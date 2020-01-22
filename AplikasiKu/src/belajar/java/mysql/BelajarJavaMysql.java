/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;
import java.sql.*;
/**
 *
 * @author jiddan fajar
 */
public class BelajarJavaMysql {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/perpustakan";
static final String USER = "root";
static final String PASS = "kopi";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
public static void main(String[] args) {
try {
Class.forName(JDBC_DRIVER);
conn = DriverManager.getConnection(DB_URL, USER, PASS);
stmt = conn.createStatement();
String sql = "SELECT * FROM buku";
rs = stmt.executeQuery(sql);
while(rs.next()){
System.out.println("ID Buku: " + rs.getInt("id_buku"));
System.out.println("Judul: " + rs.getString("judul"));
System.out.println("Pengarang: " + rs.getString("pengarang"));
}
            
stmt.close();
conn.close();            
} 
catch (Exception e) {
e.printStackTrace();
}
}    
}
