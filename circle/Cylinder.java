/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author User
 */
public class Cylinder extends Circle {
    private double height; 
     
    public Cylinder() { 
        super();
        height = 1.0; 
    }
    public Cylinder(double height) { 
        super(); 
        this.height = height; 
    }
    public Cylinder(double radius, double height) { 
        super(radius); 
        this.height = height; 
    }
    public double getHeight() { 
        return height; 
    }
    @Override
    public double getArea(){
        return (2 * Math.PI * super.getRadius() * height) + (2 * super.getArea());
    }
    public double getVolume() { 
        return super.getArea()*height; 
    }
    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString() + "height=" + height;
    }
}
