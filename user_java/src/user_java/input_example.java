/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_java;
import java.util.Scanner;
/**
 *
 * @author ATIK
 */
public class input_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka1, angka2, jumlah;
        System.out.print("Masukan Input Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Input Kedua: ");
        angka2 = input.nextInt();
        jumlah = angka1 + angka2;
        System.out.println("Jumlah: "+jumlah);
    }
}
    

