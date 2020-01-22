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
public class KelasLuarS {
private static class KaryaSastra{
        private String Puisi;
        private void setPuisi(String Puisi){
            this.Puisi = Puisi;
        }
        private String getPuisi(){
            return Puisi;
        }
    }
    
    public static void main(String[] args){
        KelasLuarS.KaryaSastra MyPuisi = new KelasLuarS.KaryaSastra();
        MyPuisi.setPuisi("Syair Hyangga");
        
        System.out.println("Saya Sedang Mempelajari Tentang Syair Hyangga: "+MyPuisi.getPuisi());
    }
}
