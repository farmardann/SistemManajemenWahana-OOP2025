/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P6_2418061;

/**
 *
 * @author farmaardan
 */
public class Main {
    public static void main(String[] args) {
        rollerCoaster rc = new rollerCoaster();
        System.out.println("Pemesanan Tiket Wahana");
        System.out.println("");
        System.out.println("Nama: " + rc.Nama());
        System.out.println("Wahana: " + rc.Wahana());
        System.out.println("Harga Tiket: " + rc.hargaTiket());
        System.out.println("Jumlah Tiket dipesan: " + rc.jmlTiket());
        System.out.println("Total Pembayaran: " + rc.total());
        System.out.println("===========================================");
        waterSlide ws = new waterSlide();
        System.out.println("");
        System.out.println("Nama: " + ws.Nama());
        System.out.println("Wahana: " + ws.Wahana());
        System.out.println("Harga Tiket: " + ws.hargaTiket());
        System.out.println("Jumlah Tiket dipesan: " + ws.jmlTiket());
        System.out.println("Total Pembayaran: " + ws.total());
        
    }
}
