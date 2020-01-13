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
public class Final {
    final int x = 3; // pada kelas final harus memiliki nilai yang sama tidak bisa mengubah object
    
    public static void main(String []args) {
        MyClass myObj = new MyClass();
        myObj.x = 3;
        
        System.out.println(myObj.x);
        
    }
    
   
    
}
