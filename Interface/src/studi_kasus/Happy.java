/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi_kasus;

/**
 *
 * @author ATIK
 */

interface SebabInterface{
    public void myMethod();
    

}

interface AkibatInterface {
    public void myOtherMethod();
}

class DemoClass implements SebabInterface, AkibatInterface {
  public void myMethod() {
    System.out.println("Saya sangat senang sekali");
  }
  public void myOtherMethod() {
    System.out.println("Karena saya melihat konser Bts");
  }
}
public class Happy {
    public static void main(String[]args){
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
        
    }
    
}
