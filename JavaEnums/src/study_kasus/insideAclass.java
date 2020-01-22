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
public class insideAclass {
enum Month {
    JANUARI,
    FEBRUARI,
    MARET,
    APRIL,
    MEI,
    JUNI,
    JULI,
    AGUSTUS,
    SEPTEMBER,
    OKTOBER,
    NOVEMBER,
    DESEMBER
  }

  public static void main(String[] args) { 
    Month myVar = Month.AGUSTUS;
    System.out.println(myVar); 
  } 
}        
