/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4_2418061_1;

/**
 *
 * @author farmaardan
 */
public class Main {
    public static void main(String[] args){
        rollerCoaster rc = new rollerCoaster();
        rc.setKaryawan(5);
        System.out.println("Info Wahana Roller Coaster");
        System.out.println("Harga Tiket: " + rc.harga);
        System.out.println("Jumlah Tiket Tersedia: " + rc.jumlahTiket);
        System.out.println("Karyawan yang ditugaskan: " + rc.getKaryawan());
        System.out.println("");
        
        waterSlide ws = new waterSlide();
        ws.setKaryawan(8);
        System.out.println("Info Wahana Water Slide");
        System.out.println("Harga Tiket: " + ws.harga);
        System.out.println("Jumlah Tiket Tersedia: " + ws.jumlahTiket);
        System.out.println("Karyawan yang ditugaskan: " + ws.getKaryawan());
    }
}
