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
public class Restoran {
    
    //Class dalam/inner class pertama
    private class Pesanan{
        private String makanan = "Nasi Goreng";
        private String minuman = "Jus Jeruk";
        private int harga = 50000;
        private void menu(){
            System.out.println("nama makanan : " + makanan);
            System.out.println("nama minuman : " + minuman);
            System.out.println("harga        : " + harga);
        }
        
    }
    //Class dalam/inner class kedua
    private class Pelanggan{
        private String nama = "Kim Taehyung";
        private int meja = 2;
        private void identitas(){
            System.out.println("atas nama  " + nama);
            System.out.println("meja nomor  " + meja);
        }
    }
    
public static void main (String []args){
    Restoran outerclass = new Restoran();
    Restoran.Pesanan data1 = outerclass.new Pesanan();
    Restoran.Pelanggan data2 = outerclass.new Pelanggan();


System.out.println("===== Data Menu Yang di Pesan =====");
data1.menu();
System.out.println("===== Data Identitas Pelanggan =====");
data2.identitas();
}
}

    
    

    
   
