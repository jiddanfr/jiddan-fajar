/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author jiddan fajar
 */
public class StudyKasus {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/company";
static final String USER = "root";
static final String PASS = "";

static Connection conn;
static Statement stmt;
static ResultSet rs;

static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);  
public static void main(String[] args) {

    try {
        // register driver
        Class.forName(JDBC_DRIVER);

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        while (!conn.isClosed()) {
            showMenu();
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void showMenu() {
    System.out.println("\n========= MENU UTAMA =========");
    System.out.println("1. Insert Data");
    System.out.println("2. Show Data");
    System.out.println("3. Edit Data");
    System.out.println("4. Delete Data");
    System.out.println("0. Keluar");
    System.out.println("");
    System.out.print("PILIHAN> ");

    try {
        int pilihan = Integer.parseInt(input.readLine());

        switch (pilihan) {
            case 0:
                System.exit(0);
                break;
            case 1:
                insertBighit();
                break;
            case 2:
                showData();
                break;
            case 3:
                updateBighit();
                break;
            case 4:
                deleteBighit();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void showData() {
    String sql = "SELECT * FROM bighit";
    try {
        rs = stmt.executeQuery(sql); 
        
        System.out.println("+--------------------------------+");
        System.out.println("|         DATA BIGHIT ENT        |");
        System.out.println("+--------------------------------+");
        while (rs.next()) {
            int id_artis = rs.getInt("id_artis");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            String group = rs.getString("grup");
            String th_debut = rs.getString("th_debut");
            
            System.out.println(String.format("%d. %s,%s,%s -- (%s)", id_artis,nama,alamat,group,th_debut));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void insertBighit() {
    try {
        // ambil input dari user
        System.out.print("id_artis: ");
        int id_artis = Integer.parseInt(input.readLine());
        System.out.print("nama: ");
        String nama = input.readLine().trim();
        System.out.print("alamat: ");
        String alamat = input.readLine().trim();
        System.out.print("grup: ");
        String group = input.readLine().trim();
        System.out.print("th_debut: ");
        String th_debut = input.readLine().trim();
        
        // query simpan
        String sql = "INSERT INTO bighit (id_artis,nama,alamat,grup,th_debut) VALUE(%d,'%s','%s','%s', '%s')";
        sql = String.format(sql, id_artis,nama,alamat,group,th_debut);
        
        // simpan buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void updateBighit() {
    try {  
        // ambil input dari user
        System.out.print("ID yang mau diedit: ");
        int id_artis = Integer.parseInt(input.readLine());
        System.out.print("nama: ");
        String nama = input.readLine().trim();
        System.out.print("alamat: ");
        String alamat = input.readLine().trim();
        System.out.print("grup: ");
        String group = input.readLine().trim();
        System.out.print("th_debut: ");
        String th_debut = input.readLine().trim();


        // query update
        String sql = "UPDATE bighit SET nama='%s', alamat='%s',grup='%s', th_debut ='%s' WHERE id_artis=%d";
        sql = String.format(sql,nama,alamat,group,th_debut,id_artis);

        // update data buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void deleteBighit() {
    try {
        
        // ambil input dari user
        System.out.print("ID yang mau dihapus: ");
        int id_artis = Integer.parseInt(input.readLine());
        
        // buat query hapus
        String sql = String.format("DELETE FROM bighit WHERE id_artis=%d", id_artis);
        // hapus data
        stmt.execute(sql);
        
        System.out.println("Data telah terhapus...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
}
