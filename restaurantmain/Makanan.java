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
class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan(String nama, double harga, int stok){
        nama_makanan = nama;
        harga_makanan = harga;
        this.stok = stok;
    }
    
    public String getNama(){
        return nama_makanan;
    }
    
    public double getHarga(){
        return harga_makanan;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void addStok(int byMuch){
        if (byMuch < 0){
            System.out.println("Adding Stock cannot be Zero");
        } else {
            stok += byMuch;
        }
    }
    
    public void reduceStock(int byMuch){
        if(isOutOfStock() || stok - byMuch <0){
            System.out.println("Stock Cannot Be Negative");
        } else{
            stok -= byMuch;
        }
    }
    
    public boolean isOutOfStock(){
        if(stok == 0){
            return true;
        } else{
            return false;
        }
    }
    
}
