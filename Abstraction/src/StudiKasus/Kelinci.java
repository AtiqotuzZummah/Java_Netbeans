/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author ATIK
 */
public class Kelinci extends Hewan{
    public void setNama() {
        System.out.println("Nama Hewan adalah : Kelinci");
    }
     public void setMakanan() {
        System.out.println("Makanan kelinci adalah  : Wortel");
    }
      public void setWarna() {
        System.out.println("Warna Kelici adalah  : Putih");
    }
      
      public static void main(String[] args){
          Kelinci k = new Kelinci();
          
          k.setNama();
          k.setMakanan();
          k.setWarna();
      }
}
