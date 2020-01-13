/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Constructor;

/**
 *
 * @author ATIK
 */
public class MyClass {
    int x;

    public MyClass(){
        x = 5;
    }
    public static void main(String[] args) {
       MyClass myObj = new MyClass();
       System.out.println(myObj.x);
    }
    
}
