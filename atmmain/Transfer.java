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
public class Transfer extends Transaction {
   private int amount; // amount to withdraw
   private final Keypad keypad; // reference to keypad
   private final CashDispenser cashDispenser; // reference to cash dispenser

   // constant corresponding to menu option to cancel
   private final static int CANCELED = 6;

   // Withdrawal constructor
   public Transfer(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase, Keypad atmKeypad, 
      CashDispenser atmCashDispenser) {

      // initialize superclass variables
      super(userAccountNumber, atmScreen, atmBankDatabase);
      
      // initialize references to keypad and cash dispenser
      keypad = atmKeypad;
      cashDispenser = atmCashDispenser;
   }

   // perform transaction
   public void execute() {
      boolean cashDispensed = false; // cash was not dispensed yet
      double availableBalance; // amount available for withdrawal
      // get references to bank database and screen
      BankDatabase bankDatabase = getBankDatabase(); 
      Screen screen = getScreen();
                        screen.displayMessageLine("\nAccount Number that you want to transfer to : ");
                        int kemana  =keypad.getInput();
      // loop until cash is dispensed or the user cancels
      do {
         // obtain a chosen withdrawal amount from the user 
         amount = displayMenuOfAmounts();

         // check whether user chose a withdrawal amount or canceled
         if (amount != CANCELED) {
            // get available balance of account involved
            availableBalance = 
               bankDatabase.getAvailableBalance(getAccountNumber());
      
            // check whether the user has enough money in the account 
            if (amount <= availableBalance) {
               // check whether the cash dispenser has enough money
               if (cashDispenser.isSufficientCashAvailable(amount)) {
                  // update the account involved to reflect the withdrawal
                  bankDatabase.debit(getAccountNumber(), amount);
                  
                  cashDispenser.dispenseCash(amount); // dispense cash
                  cashDispensed = true; // cash was dispensed

                  screen.displayMessageLine("\nYour cash has been" +
                     " Transfered.");
               } 
               else { // cash dispenser does not have enough cash
                  screen.displayMessageLine(
                     "\nInsufficient cash available in the ATM." +
                     "\n\nPlease choose a smaller amount.");
               }
            }
            else { // not enough money available in user's account
               screen.displayMessageLine(
                  "\nInsufficient funds in your account." +
                  "\n\nPlease choose a smaller amount."); 
            } 
         } 
         else { // user chose cancel menu option 
            screen.displayMessageLine("\nCanceling transaction...");
            return; // return to main menu because user canceled
         } 
      } while (!cashDispensed);
   } 

   // display a menu of withdrawal amounts and the option to cancel;
   // return the chosen amount or 0 if the user chooses to cancel
   private int displayMenuOfAmounts() {
      int userChoice = 0; // local variable to store return value

      Screen screen = getScreen(); // get screen reference
      
      // array of amounts to correspond to menu numbers

      // loop while no valid choice has been made
      while (userChoice == 0) {
         // display the withdrawal menu

         screen.displayMessage("\nChoose transfer amount: ");

         int input = keypad.getInput(); // get user input through keypad

         // determine how to proceed based on the input value
               userChoice = input; // save user's choice 
      
      } 

      return userChoice; // return withdrawal amount or CANCELED
   }
}