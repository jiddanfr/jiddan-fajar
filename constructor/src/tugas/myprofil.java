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
public class myprofil {
    long modelnim;
    String modelname;
    String modelalamatrumah;
    String modeljurusan;
    int modelangkatan;

public myprofil (long nim, String name, String alamatrumah, String jurusan, int angkatan) {
    modelnim = nim;
    modelname = name;
    modelalamatrumah = alamatrumah;
    modeljurusan = jurusan;
    modelangkatan = angkatan;
}

public static void main (String[] args){
    myprofil profil = new myprofil (201869040023L, "jiddan fajar r","pasuruan","Teknik Informatika",2018);
    System.out.println(profil.modelnim);
    System.out.println(profil.modelname);
    System.out.println(profil.modelalamatrumah);
    System.out.println(profil.modeljurusan);
    System.out.println(profil.modelangkatan);
}
}
