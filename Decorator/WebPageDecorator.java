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
public abstract class WebPageDecorator implements WebPage {

    protected WebPage page;

    public WebPageDecorator(WebPage webpage) {
        this.page = webpage;
    }

    public void TampilkanWeb() {
        this.page.TampilkanWeb();
    }
}
