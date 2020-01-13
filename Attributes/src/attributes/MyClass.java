/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author ATIK
 */
public class MyClass {

    int x; //modify attributes
    public static void main(String[] args) {
        MyClass myObj = new MyClass ();
        myObj.x = 25;
        
        System.out.println(myObj.x);
    }
    
}
