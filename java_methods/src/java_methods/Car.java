/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_methods;

/**
 *
 * @author ATIK
 */
public class Car {
    
    //create a fullthrotel()method
    public void fullthrotel() {
        System.out.println("The car is going as fast as it can!");
        
    //menambahkan sebuah kecepatan dan menambahkan parameter
    public void speed (int maxspeed) {
        System.out.println("Max speed is : " + maxspeed);
        
    //inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullthrotel();
        myCar.speed(200);
    }
        
        
    
    }
    
}
