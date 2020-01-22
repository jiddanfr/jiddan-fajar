/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study_kasus;


/**
 *
 * @author jiddan fajar
 */
enum Day {
    Mother,
    Valentine,
    Birth
  }
public class SwitchStatement {
public static void main(String[] args) {
    Day myVar = Day.Valentine; 
                
    switch(myVar) {
      case Mother:
        System.out.println("Mother Day");
        break;
      case Valentine:
        System.out.println("Valentine Day");
        break;
      case Birth:
        System.out.println("BirthDay");
        break;
    }
  }    
}
