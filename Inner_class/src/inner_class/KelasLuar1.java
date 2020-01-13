/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author ATIK
 */
//Outer Class/Kelas Luar
public class KelasLuar1 {
    
    //Class dalam/Inner Class Pertama
    private class Mobil{
        private String merk = "SUZUKI";
        private float kecepatan = 360.0f;
        private void jalankan() {
            System.out.println("Merk Mobil:"+merk);
            System.out.println("Kecepatan Mobil:"+kecepatan);
        }
    }
    


//Class  dalam/Inner Class kedua
private class pengguna{
    private String nama = "Atiqotuz Zummah";
    private int umur = 19;
    private void identitas(){
        System.out.println("Nama Saya : " + nama);
        System.out.println("Usia Saya : " + umur);
        
    }}
public static void main(String[] args){
    //membuat instance dari Kelas Luar
    KelasLuar1 outerclass = new KelasLuar1();
    //membuat Instance dari KelasDalam(Mobil)
    KelasLuar1.Mobil data1 = outerclass.new Mobil();
    //membuat instance dari KelasDlam (pengguna)
    KelasLuar1.pengguna data2 = outerclass.new pengguna();


//Menampilkan hasil output
System.out.println("====DATA DARI CLASS MOBIL ====");
data1.jalankan();
System.out.println("====DATA DARI CLASS PENGGUNA");
data2.identitas();
}
}






