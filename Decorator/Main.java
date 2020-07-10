/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebPage Page = new Dasar_WebPage();
        Page = new Pembelian_WebPage(Page);
        Page = new Penjualan_WebPage(Page);
        Page.TampilkanWeb();
    }
    
}
