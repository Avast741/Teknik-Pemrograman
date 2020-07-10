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
import java.util.ArrayList; 
import java.util.List; 
  
  
public class ProxyInternet implements Internet 
{ 
    private Internet internet = new RealInternet(); 
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("netflix.com"); 
        bannedSites.add("jackjack.com"); 
        bannedSites.add("northkorea.com"); 
        bannedSites.add("russia.com"); 
    } 
      
    @Override
    public void connectTo(String serverhost) throws Exception 
    { 
        if(bannedSites.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        internet.connectTo(serverhost); 
    } 
  
} 
