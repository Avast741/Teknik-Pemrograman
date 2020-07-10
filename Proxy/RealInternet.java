/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author User
 */
public class RealInternet implements Internet 
{ 
    @Override
    public void connectTo(String serverhost) 
    { 
        System.out.println("Connecting to "+ serverhost); 
    } 
} 
