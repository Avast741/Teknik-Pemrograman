/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author User
 */
class Sparrow implements Bird {
    public void fly() 
    { 
        System.out.println("Flying"); 
    } 
    public void makeSound() 
    { 
        System.out.println("Chirp Chirp"); 
    } 
}
