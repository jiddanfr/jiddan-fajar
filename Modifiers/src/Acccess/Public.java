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
public class Public {
  public String fname = "Jiddan fajar r";
  public String lname = "Jiddan";
  public String email = "jiddanfajar12@gmai.com";
  public int age = 20;
public static void main(String[] args) {
    Public myObj = new Public(); 
    System.out.println("Name : " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age  : " + myObj.age);  
}
}
