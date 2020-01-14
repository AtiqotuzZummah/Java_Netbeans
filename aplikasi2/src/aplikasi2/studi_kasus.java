/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi2;
	
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;



/**
 *
 * @author ATIK
 */
public class studi_kasus {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/superrmarket";
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
                    insertbarang();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updatebarang();
                    break;
                case 4:
                    deletebarang();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
static void showData() {
        String sql = "SELECT * FROM superrmarket";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA BARANG DI SUPERRMARKET   |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                String id_barang = rs.getString("id_barang");
                String nama_barang = rs.getString("nama_barang");
                String merk = rs.getString("merk");

                
                System.out.println(String.format("%s. %s -- (%s)", id_barang, nama_barang, merk));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
static void insertbarang() {
    try {
        // ambil input dari user
        System.out.println("id_barang: ");
        String id_barang = input.readLine().trim();
        System.out.println("nama_barang: ");
        String nama_barang = input.readLine().trim();
        System.out.println("merk: ");
        String merk = input.readLine().trim();
        
        // query simpan
        String sql = "INSERT INTO superrmarket ( id_barang ,nama_barang , merk) VALUE( '%s', '%s' , '%s')";
        sql = String.format(sql,id_barang , nama_barang , merk);
        
        // simpan buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void updatebarang() {
    try {  
        // ambil input dari user
        System.out.print("ID yang mau diedit: ");
        int id_barang = Integer.parseInt(input.readLine());
        System.out.print("nama_barang: ");
        String nama_barang = input.readLine().trim();
        System.out.print("merk: ");
        String merk = input.readLine().trim();

        // query update
        String sql = "UPDATE superrmarket SET nama_barang='%s', merk='%s' WHERE id_barang=%d";
        sql = String.format(sql, nama_barang, merk, id_barang);

        // update data barang
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void deletebarang() {
    try {
        
        // ambil input dari user
        System.out.print("ID yang mau dihapus: ");
        int id_barang = Integer.parseInt(input.readLine());
        
        // buat query hapus
        String sql = String.format("DELETE FROM superrmarket WHERE id_barang=%d", id_barang);
        // hapus data
        stmt.execute(sql);
        
        System.out.println("Data telah terhapus...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}






   
   
    
    
}
