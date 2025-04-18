/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2_2418061_K1;

/**
 *
 * @author farmaardan
 */
public class main {
    public static void main(String[] args) {
        WahanaDufan Dufan = new WahanaDufan("Roller Coaster", "Ekstrim", "Baik", 50, 50000);
        
        System.out.println("Wahana Dufan");
        System.out.println("Nama Wahana: " + Dufan.getNamaWahana());
        System.out.println("Jenis Wahana: " + Dufan.getJenisWisata());
        System.out.println("kondisi Wahana: " + Dufan.getKondisiWahana());
        System.out.println("Harga tiket: " + Dufan.getHargaTiket());
        System.out.println("Jumlah Wisatawan: " + Dufan.getWisatawan());
        System.out.println("Pendapatan: " + Dufan.wisatawan * Dufan.harga);
    }
}
