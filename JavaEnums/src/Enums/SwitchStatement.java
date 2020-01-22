/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author jiddan fajar
 */
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
public class SwitchStatement {
public static void main(String[] args) {
    Level myVar = Level.HIGH; 
                
    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}    
