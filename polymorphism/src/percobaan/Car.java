/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author ATIK
 */
public class Car {
    public void carSound() {
        System.out.println("The car has a different voice");
    }}

class Toyota extends Car {
    public void carSound() {
        System.out.println("The sound of the car the Toyota: brumm brumm");
    }}
 
class Honda extends Car {
    public void carSound() {
        System.out.println("The sound of the car the Honda: bremm bremm");
    }}

class Hyundai extends Car {
    public void carSound() {
        System.out.println("The sound of the car the Hyundai : bromm bromm");
    }}

class MyMainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myToyota = new Toyota();
        Car myHonda = new Honda();
        Car myHyundai = new Hyundai();
        myCar.carSound();
        myToyota.carSound();
        myHonda.carSound();
        myHyundai.carSound();
    }
}