/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SingletonObject {
    
   private static SingletonObject instance = new SingletonObject();

   private SingletonObject(){}

   public static SingletonObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Main Menu :");
      System.out.println("1. Business");
      System.out.println("2. Jewelry");
      System.out.println("3. Fashion");
      System.out.println("4. Exit");
   }
}
