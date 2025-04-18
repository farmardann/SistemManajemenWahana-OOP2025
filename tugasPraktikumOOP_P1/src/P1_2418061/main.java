/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1_2418061;

/**
 *
 * @author farmaardan
 */
public class main {
    public static void main(String[] args) {
        
        informasiWahana jatimPark = new informasiWahana(); // Deklarasi Objek
        
        System.out.println("Manajemen Wahana Jatim Park");
        System.out.println("Nama: " + jatimPark.namaWahana);
        System.out.println("Status: " + jatimPark.status);
        System.out.println("Harga tiket: " + jatimPark.harga);
        System.out.println("Jumlah Wisatawan: " + jatimPark.JmlWisatawan(25));
        jatimPark.digunakan();
    }
}
