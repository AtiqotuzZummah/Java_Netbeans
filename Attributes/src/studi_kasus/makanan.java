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
public class makanan {
    String menu = "Soto";
    long harga = 15000;
    
    public static void main(String []args){
        makanan myObj = new makanan();
        System.out.println("menu : " + myObj.menu);
        System.out.println("harga: " + myObj.harga);
    }
    
}
