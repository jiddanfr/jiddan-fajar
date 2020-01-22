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
interface Humans {
  public void HumansSound(); // interface method (does not have a body)
  public void Sleep(); // interface method (does not have a body)
  public void Laugh();
}

class Boys implements Humans {
  public void HumansSound() {
    System.out.println("The Boys says   : Yuhuuuu");
  }
  public void Sleep() {
    System.out.println("When Boys Sleep : Kkrr Kkrr");
  }
  public void Laugh() {
    System.out.println("When Boys Laugh : HAHAHAHAHAHAHA");
  }
}

class Human {
  public static void main(String[] args) {
    Boys myBoys = new Boys();
    myBoys.HumansSound();
    myBoys.Sleep();
    myBoys.Laugh();
  }
}

