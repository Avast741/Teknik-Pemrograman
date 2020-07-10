/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author User
 */
public class ObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Subject subject = new Subject();

       BinaryObserver binaryObserver = new BinaryObserver(subject);

      System.out.println("Status pertama: 50");	
      subject.setState(20);
      System.out.println("Status kedua: 15");	
      subject.setState(10);
   }
    
}
