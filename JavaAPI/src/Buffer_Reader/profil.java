/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer_Reader;
import java.io.*;

/**
 *
 * @author ATIK
 */
public class profil {
    public static void main(String[] args) {
        //Membuat objek dari Class BufferReader
     BufferedReader input =
             new BufferedReader(new InputStreamReader(System.in));
     
     
     String nama;
     String alamat;
     String jurusan;
     String jenis_kelamin;
     String nim;
     String tahun_angkatan;
     
     
     
     try{
         
     
     System.out.print("nama         :");
     nama = input.readLine ();
     
     System.out.print("alamat        :");
     nama = input.readLine ();
     
     System.out.print("jurusan         :");
     nama = input.readLine ();
     
     System.out.print("jenis_kelamin         :");
     nama = input.readLine ();
     
     System.out.print("nim         :");
     nama = input.readLine ();
     
     System.out.print("tahun_angkatan        :");
     nama = input.readLine ();
     }catch (IOException ex) {
         
         System.out.println("nama             : +   nama");
         System.out.println("alamat           : +   alamat");
         System.out.println("nama             : +   jurusan");
         System.out.println("jenis_kelamin    : +   jenis_kelamin");
         System.out.println("nim              : +   nim");
         System.out.println("tahun_angkatan   : +   tahun_angkatan");
         
         
     }
     
     
     
     
     
     
     
     
     
  
     
             
             
             
             
     
     
                
        
    }
    
}
