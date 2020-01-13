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
public class KelasLuar {
    
    private static class University{
        private String faculty;
        private void setFaculty(String Faculty){
            this.faculty = Faculty;
        }
        private String getFaculty(){
            return faculty;
        }
    }
    
    public static void main(String[]args){
        KelasLuar.University MyFaculty = new KelasLuar.University();
        
        MyFaculty.setFaculty("Informatics Engineering");
        
        System.out.println("I was a student in the field : "+MyFaculty.getFaculty());
    }
    
    
    
        
    }
    

