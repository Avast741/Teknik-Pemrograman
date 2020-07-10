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
public class Restaurant {
    private Makanan[] makanan;
    private static byte id = 0;
    
    public Restaurant() {
        makanan = new Makanan[10];
        id = 0;
    }
public void tambahMenuMakanan(String nama, double harga, int stok) {
    makanan[id] = new Makanan(nama, harga, stok);
    nextId();

}

public void tampilMenuMakanan(){
for(int i =0; i<id; i++){
if(!(makanan[i].isOutOfStock())){
System.out.println(makanan[i].getNama() +"["+ makanan[i].getStok() + "]" + "\tRp." + makanan[i].getHarga());
        }
    }
}

private static void nextId(){
    id++;
}

public void addStok(int id, int byMuch){
    makanan[id].addStok(byMuch);
}

public void reduceStock(int id, int byMuch){
    makanan[id].reduceStock(byMuch);
}
}

    

