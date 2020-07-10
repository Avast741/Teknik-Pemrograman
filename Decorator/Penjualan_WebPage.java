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
public class Penjualan_WebPage extends WebPageDecorator {
    
    public Penjualan_WebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void PenjualanUser() {
        System.out.println("Bagian Penjualan...");
    }

    public void TampilkanWeb() {
        super.TampilkanWeb();
        this.PenjualanUser();
    }
}
