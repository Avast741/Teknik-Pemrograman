/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gson;

/**
 *
 * @author mizan
 */
public class barang {
    public String productName;
    public int quantity;
    public int weight;
    public String destination;
    private servicePackage servicePackage;
    private int value;
    private int priceItem;
    
    public String toString(){
        return productName+" | "+quantity+" | "+weight+" | "+destination+" | "+servicePackage.toString()+" | "+value+" | "+(servicePackage.value+priceItem);
    }
}
