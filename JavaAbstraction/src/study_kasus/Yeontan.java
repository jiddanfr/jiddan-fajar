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
abstract class Yeontan {
  public abstract void YeontanSound();
  public void sleep() {
    System.out.println("Zzzz");
  }
}
class Dog extends Yeontan {
  public void YeontanSound() {
    System.out.println("The pig says: wee wee");
  }
}
abstract class yeontan { 
public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.YeontanSound();
    myDog.sleep();
  }    
}

