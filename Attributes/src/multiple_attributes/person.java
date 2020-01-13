/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_attributes;

/**
 *
 * @author ATIK
 */
public class person {
    String fname = "Atiqotuz";
    String lname = "Zummah";
    int age = 19;
    
    public static void main(String []args) {
        person myObj = new person();
    System.out.println("Name: " + myObj.fname + "" + myObj.lname);
    System.out.println("Age : " + myObj.age);
   
    
}}
