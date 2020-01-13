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
public class MyClass {

    //static method
    static void myStaticMethod(){
        System.out.println("static method bisa dipanggil tanpa menambahkan objek");
    }
    
    public static void myPublicMethod() {
        System.out.println("public method hanya bisa dipanggil dengan menambahkan object");
    }
    
    public static void main(String[] args) {
        myStaticMethod(); //memanggil static method
        //myPublicMethod(); akan eror
        
        MyClass myObj = new MyClass();//memanggil public method
        myObj.myPublicMethod();
    }
    
}
