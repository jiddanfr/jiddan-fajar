/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author jiddan fajar
 */
public class Constructor {
    long modelnim;
    String modelname;
    String modelalamatrumah;
    String modeljurusan;
    int modelangkatan;
    
public Constructor() {
    modelnim = 201869040038L;
    modelname = "jiddan fajar r";
    modelalamatrumah = "pasuruan";
    modeljurusan = "Teknik Informatika";
    modelangkatan = 2018;
}
public static void main(String[] args) {
    Constructor profil = new Constructor();
    System.out.println("nim               = "+profil.modelnim);
    System.out.println("name              = "+profil.modelname);
    System.out.println("alamat rumah      = "+profil.modelalamatrumah);
    System.out.println("jurusan           = "+profil.modeljurusan);
    System.out.println("angkatan          = "+profil.modelangkatan);

}
}
