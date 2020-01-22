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
interface CouseInterface {
  public void myMethod();
}
interface EffectInterface {
  public void myOtherMethod(); 
}
class DemoClass implements CouseInterface, EffectInterface {
  public void myMethod() {
    System.out.println("I am Disapointed");
  }
  public void myOtherMethod() {
    System.out.println("Because I didn't Watch a Movie With Park Jimin");
  }
}

class MultipleInterfaces {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
