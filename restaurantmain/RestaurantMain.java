/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmain;

/**
 *
 * @author User
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        
        System.out.println("Reducing/Adding Stock...");
        menu.reduceStock(0, 10);
        menu.reduceStock(1, 5);
        menu.addStok(2, 12);
        menu.reduceStock(3, 10);
        
        menu.tampilMenuMakanan();
    }
    
}
