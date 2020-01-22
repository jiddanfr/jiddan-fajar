/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
import java.util.Scanner;

/**
 *
 * @author jiddan fajar
 */
public class biodata {
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    long nim ;
    String nama;
    String alamat;
    String jurusan;
    int tahunAngkatan;
    String jenisKelamin;
    
   
    System.out.print ("nama            :");
    nama = input.nextLine ();
    
    System.out.print ("alamat          :");
    alamat = input.nextLine ();
    
    System.out.print ("jurusan         :");
    jurusan = input.nextLine ();
    
    System.out.print ("jenisKelamin    :");
    jenisKelamin = input.nextLine ();
    
     System.out.print ("nim             :");
    nim = input.nextLong ();
    
    System.out.print ("tahunAngkatan    :");
    tahunAngkatan = input.nextInt ();
    
    System.out.println("nim                "+ nim);
    System.out.println("nama               "+ nama);
    System.out.println("alamat             "+ alamat);
    System.out.println("jurusan            "+ jurusan);
    System.out.println("tahunAngkatan      "+ tahunAngkatan);
    System.out.println("jenisKelamin       "+ jenisKelamin);
}  
}
