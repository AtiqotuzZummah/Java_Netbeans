/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author ATIK
 */
public class Car {
    
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    
    public void speed (int maxSpeed) {
        System.out.println("Max Speed : " + maxSpeed);
    }
        
      public static void main(String []args) {
          Car myCar = new Car();
          myCar.fullThrottle();
          myCar.speed(200);
      } 
}
