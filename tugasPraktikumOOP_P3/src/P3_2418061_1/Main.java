/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_2418061_1;

/**
 *
 * @author farmaardan
 */
public class Main {
    public static void main(String[] args){
        rollerCoaster rc = new rollerCoaster();
        System.out.println("Info Wahana Roller Coaster");
        System.out.println("Harga Tiket: " + rc.harga);
        System.out.println("Jumlah Tiket Tersedia: " + rc.jumlahTiket);
        System.out.println("");
        
        waterSlide ws = new waterSlide();
        System.out.println("Info Wahana Water Slide");
        System.out.println("Harga Tiket: " + ws.harga);
        System.out.println("Jumlah Tiket Tersedia: " + ws.jumlahTiket);
    }
}
