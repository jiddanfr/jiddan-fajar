/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

/**
 *
 * @author jiddan fajar
 */
public class Objects {
public void ObjectsSound() {
    System.out.println("The Objects sound");
    System.out.println("=================");
  }
}

class Watch extends Objects {
  public void ObjectsSound() {
    System.out.println("The Watch Make a Sound  : tik tok");
  }
}

class Motorcycle extends Objects {
  public void ObjectsSound() {
    System.out.println("The Motorcycle Make a Sound  : Brum Brum");
  }
}

class Bell extends Objects {
  public void ObjectsSound() {
    System.out.println("The Bell Make a Sound   : Kriinggg");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Objects myObjects = new Objects();
    Objects myWatch = new Watch();
    Objects myMotorcycle = new Motorcycle();
    Objects myBell = new Bell();
        
    myObjects.ObjectsSound();
    myWatch.ObjectsSound();
    myMotorcycle.ObjectsSound();
    myBell.ObjectsSound();
  }
}
