/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
import java.util.Scanner;

/**
 *
 * @author ATIK
 */
public class biodata {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        long nim ;
        String nama ;
        String alamat ;
        String jurusan ;
        int tahun_angkatan;
        String jenis_kelamin;
        
       
        System.out.println("========");
        System.out.println("Biodata Diri");
        System.out.println("========");
        
        
        System.out.print ("nama               :");
        nama = input.nextLine();
        
        System.out.print ("alamat             :");
        alamat = input.nextLine();
        
        System.out.print ("jurusan            :");
        jurusan = input.nextLine();
        
        
    
        System.out.print ("jenis_kelamin      :");
        jenis_kelamin = input.nextLine();
        
        System.out.print("nim                :");
        nim = input.nextLong();
        
        System.out.print ("tahun_angkaatan    :");
        tahun_angkatan = input.nextInt();
        
        System.out.println("========");
        System.out.println("Biodata Diri");
        System.out.println("========");
        System.out.println ("nim   "+ nim);
        System.out.println ("nama   "+ nama);
        System.out.println ("alamat   "+ alamat);
        System.out.println ("jurusan   "+ jurusan);
        System.out.println ("tahun_angkatan  "+ tahun_angkatan);
        System.out.println ("jenis_kelamin   "+ jenis_kelamin);
        
        
        
        
       
        
        
        
        
        
        
       
        
        
        
    }
    
}
