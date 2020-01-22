/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferReader;
import java.io.*;
/**
 *
 * @author jiddan fajar
 */
public class Profil {
    public static void main(String[] args){
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    
    String nama;
    String alamat;
    String jurusan;
    String jenisKelamin;
    
try{ 
    
    System.out.print ("nama            :");
    nama = input.readLine ();
    
    System.out.print ("alamat          :");
    alamat = input.readLine ();
    
    System.out.print ("jurusan         :");
    jurusan = input.readLine ();
    
    System.out.print ("jenisKelamin    :");
    jenisKelamin = input.readLine ();
    
    System.out.println("nama               "+ nama);
    System.out.println("alamat             "+ alamat);
    System.out.println("jurusan            "+ jurusan);
    System.out.println("jenisKelamin       "+ jenisKelamin);
    
}catch (IOException ex){    
    System.out.println("Terjadi kesalahan pada input");
        }    
    }
}

