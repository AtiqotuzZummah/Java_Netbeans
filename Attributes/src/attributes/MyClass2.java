/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;



public class MyClass2 {
    int x = 9;//change the value x to 10
    
    public static void main(String []args) {
        MyClass2 myObj = new MyClass2 ();
        myObj.x = 10;// is now 10
        
        System.out.println(myObj.x);
    }
    
    
    
}
