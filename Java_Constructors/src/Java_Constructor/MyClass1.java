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
public class MyClass1 {
    int x;
    
    public MyClass1(int y) {
        x = y;
       
        
    }
    public static void main(String[] args) {
        MyClass1 myObj = new MyClass1(5);
      System.out.println(myObj.x);
    }
    
}
