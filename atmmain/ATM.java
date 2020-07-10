/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmain;

/**
 *
 * @author User
 */
public class ATM {
   private boolean userAuthenticated; // whether user is authenticated
   private int currentAccountNumber; // current user's account number
   private Screen screen; // ATM's screen
   private Keypad keypad; // ATM's keypad
   private CashDispenser cashDispenser; // ATM's cash dispenser
   private DepositSlot depositSlot; // ATM's deposit slot
   private BankDatabase bankDatabase; // account information database

   // constants corresponding to main menu options
   private static final int BALANCE_INQUIRY = 1;
   private static final int WITHDRAWAL = 2;
   private static final int DEPOSIT  = 3; 
   private static final int EDITPIN = 4;  
   private static final int TRANSFER  = 5; 
   private static final int EXIT = 6;

   // no-argument ATM constructor initializes instance variables
   public ATM() {
      userAuthenticated = false; // user is not authenticated to start
      currentAccountNumber = 0; // no current account number to start
      screen = new Screen(); // create screen
      keypad = new Keypad(); // create keypad 
      cashDispenser = new CashDispenser(); // create cash dispenser
      depositSlot = new DepositSlot(); // create deposit slot
      bankDatabase = new BankDatabase(); // create acct info database
   }

   // start ATM 
   public void run() {
      // welcome and authenticate user; perform transactions
      while (true) {
         // loop while user is not yet authenticated
         while (!userAuthenticated) {
            screen.displayMessageLine("\nWelcome!");       
            authenticateUser(); // authenticate user
         }
         
         performTransactions(); // user is now authenticated
         userAuthenticated = false; // reset before next ATM session
         currentAccountNumber = 0; // reset before next ATM session
         screen.displayMessageLine("\nThank you! Goodbye!");
      }
   }

   // attempts to authenticate user against database
   private void authenticateUser() {
      screen.displayMessage("\nPlease enter your account number: ");
      int accountNumber = keypad.getInput(); // input account number
      screen.displayMessage("\nEnter your PIN: "); // prompt for PIN
      int pin = keypad.getInput(); // input PIN
      
      // set userAuthenticated to boolean value returned by database
      userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);
      
      // check whether authentication succeeded
      if (userAuthenticated) {
         currentAccountNumber = accountNumber; // save user's account #
      } 
      else {
         screen.displayMessageLine(
            "Invalid account number or PIN. Please try again.");
      } 
   } 

   // display the main menu and perform transactions
   private void performTransactions() {
      // local variable to store transaction currently being processed
      Transaction currentTransaction = null;
      
      boolean userExited = false; // user has not chosen to exit

      // loop while user has not chosen option to exit system
      while (!userExited) {
         // show main menu and get user selection
         int mainMenuSelection = displayMainMenu();

         // decide how to proceed based on user's menu selection
         switch (mainMenuSelection) {
            // user chose to perform one of three transaction types
            case BALANCE_INQUIRY: 
                currentTransaction = (BalanceInquiry) createTransaction(BALANCE_INQUIRY);
                break;
            case WITHDRAWAL:
                currentTransaction = (Withdrawal) createTransaction(WITHDRAWAL);
                break;
            case DEPOSIT:
                currentTransaction = (Deposit) createTransaction(DEPOSIT);
            break;    
            case EDITPIN:
                keypad = new Keypad();
                boolean cek = false;
                do{
                    System.out.print("PIN baru : ");
                    int pin = keypad.getInput();
                    if(pin==currentAccountNumber){
                        System.out.println("PIN tidak boleh sama");
                    }else if(pin%1000==currentAccountNumber%1000){
                        System.out.println("PIN tidak boleh sama 3 terakhir");
                    }else{
                        System.out.println("PIN berhasil diubah");
                        currentAccountNumber = pin;
                        cek=true;
                    }
                }while(cek==false);
                
            break;    
            case TRANSFER:
                currentTransaction = (Transfer) createTransaction(TRANSFER);
                break;
            case EXIT: // user chose to terminate session
               screen.displayMessageLine("\nExiting the system...");
               userExited = true; // this ATM session should end
               break;
            default: // user did not enter an integer from 1-4
               screen.displayMessageLine(
                  "\nYou did not enter a valid selection. Try again.");
               break;
         }
      } 
   } 

   // display the main menu and return an input selection
   private int displayMainMenu() {
      screen.displayMessageLine("\nMain menu:");
      screen.displayMessageLine("1 - View my balance");
      screen.displayMessageLine("2 - Withdraw cash");
      screen.displayMessageLine("3 - Deposit funds"); 
      screen.displayMessageLine("4 - Change PIN Number"); 
      screen.displayMessageLine("5 - Transfer");
      screen.displayMessageLine("6 - Exit\n");
      screen.displayMessage("Enter a choice: ");
      return keypad.getInput(); // return user's selection
   } 
         
   // return object of specified Transaction subclass
   private Transaction createTransaction(int type) {
      Transaction temp = null; // temporary Transaction variable
      
      // determine which type of Transaction to create     
      switch (type) {
         case BALANCE_INQUIRY: // create new BalanceInquiry transaction
            temp = new BalanceInquiry(
               currentAccountNumber, screen, bankDatabase);
            ((BalanceInquiry) temp).execute();
            break;
         case WITHDRAWAL: // create new Withdrawal transaction
             temp = new Withdrawal (currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
             ((Withdrawal) temp).execute();
            break; 
         case DEPOSIT: // create new Deposit transaction 
             temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot); 
            ((Deposit) temp).execute();
                            break;
         
         case TRANSFER: //changing pin number
             temp = new Transfer(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
             ((Transfer) temp).execute();
             break;
                     
      }

      return temp; // return the newly created object
   } 
}
