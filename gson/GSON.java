/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author mizan
 */
public class GSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Gson gson = new Gson();

        try (Reader reader = new FileReader("D:\\Indonesia Negaraku, Polban Kampusku\\Java\\Gson\\src\\barang.json")) {

            ArrayList<barang> data = gson.fromJson(reader, new TypeToken<ArrayList<barang>>() {}.getType());
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

