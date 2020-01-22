/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author jiddan fajar
 */
public class KelasLuar {
private class Mobil{
        private String merk = "SUZUKI";
        private float kecepatan = 360.0f;
        private void jalankan(){
            System.out.println("Merk Mobil: "+merk);
            System.out.println("Kecepatan Mobil: "+kecepatan);
        }
    }
    
    private class Pengguna{
        private String nama = "Wildan";
        private int umur = 19;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        KelasLuar outerclass = new KelasLuar();       
        KelasLuar.Mobil data1 = outerclass.new Mobil();
        KelasLuar.Pengguna data2 = outerclass.new Pengguna();
        
        System.out.println("===== DATA DARI CLASS MOBIL ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}

