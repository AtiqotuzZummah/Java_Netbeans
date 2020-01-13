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
public class KelasLuar {
    
    //Class dalam/Inner class static
    private static class Programming{
        private String language;
        private void setlanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    public static void main(String[]args){
        //Membuat instance dari kelas dalam(programming)
        KelasLuar.Programming MyLanguage = new KelasLuar.Programming();
        
        //Memasukkan Nilai/Value
        MyLanguage.setlanguage("Java");
        
        //Menampilkan Hasil Output
        System.out.println("Saya sedang mempelajari : " + MyLanguage.getLanguage());
    }
}
