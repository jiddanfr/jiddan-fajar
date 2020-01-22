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
public class Default {
  String fname = "Ahmad zakir arya mega";
  String lname = "Ahmad";
  String email = "Ahmad@nabila.com";
  int age = 19;
  
  public static void main(String[] args) {
    Default myObj = new Default();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
}
}
