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
public class KelasLuar {
private class Order{
        private String merk = "CHANNEL";
        private int Harga = 500000;
        private void jalankan(){
            System.out.println("Merk Baju: "+merk);
            System.out.println("Harga Baju: "+Harga);
        }
    }
    
    private class Pemesan{
        private String nama = "SUZY";
        private int umur = 24;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        study_kasus.KelasLuar outerclass = new study_kasus.KelasLuar();       
        study_kasus.KelasLuar.Order data1 = outerclass.new Order();
        study_kasus.KelasLuar.Pemesan data2 = outerclass.new Pemesan();
        
        System.out.println("===== DATA DARI CLASS ORDER ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
    
}
