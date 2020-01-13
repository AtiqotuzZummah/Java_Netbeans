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

//Interface
interface Manusia {
    public void manusiaSound();// interface method (does not have a body)
  public void tertawa(); // interface method (does not have a body)
}

// Cewek "implements" the MANUSIAinterface
class Cewek implements Manusia {
  public void manusiaSound() {
    // The body of manusiaSound() is provided here
    System.out.println("Suara seorang cewek : Hai....");
  }
  public void tertawa() {
    // The body of tertawa() is provided here
    System.out.println("Suara Cewek tertawa : Wkwkwkwk");
  }
}
class MyMainClass {
  public static void main(String[] args) {
    Cewek myCewek = new Cewek();  // Create a Cewek object
    myCewek.manusiaSound();
    myCewek.tertawa();
  }
}
