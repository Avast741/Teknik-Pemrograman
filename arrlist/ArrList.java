/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlist;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Mizan");
        arr.add("Nur Qalam");
        tampil(arr);
    }
    
    static void tampil(ArrayList<String> array){
        array.add("Method");
        System.err.println(array);
    }
}


