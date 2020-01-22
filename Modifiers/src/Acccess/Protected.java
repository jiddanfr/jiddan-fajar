/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acccess;

/**
 *
 * @author jiddan fajar
 */
public class Protected {
  protected String fname = "Jiddan fajar r";
  protected String lname = "Jiddan";
  protected String Jurusan = "Teknik Informatika";
  protected long Nim = 201869040038L;
}

class Student extends Protected {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Jurusan: " + myObj.Jurusan);
    System.out.println("Nim: " + myObj.Nim);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
    
