/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fly;

/**
 *
 * @author User
 */
public class FlyNoWay implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Tidak bisa terbang");
    }
}
