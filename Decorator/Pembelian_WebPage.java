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
public class Pembelian_WebPage extends WebPageDecorator{
    
    public Pembelian_WebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void PembelianUser() {
        System.out.println("Bagian Pembelian...");
    }

    public void TampilkanWeb() {
        super.TampilkanWeb();
        this.PembelianUser();
    }
}
