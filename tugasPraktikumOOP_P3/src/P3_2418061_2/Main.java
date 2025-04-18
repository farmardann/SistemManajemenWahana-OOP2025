/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_2418061_2;

/**
 *
 * @author farmaardan
 */
public class Main {
    public static void main(String[] args) {
        wahanaAir wahana = new wahanaAir("Water Slide", 10);

        // Mengambil antrian baru
        wahana.ambilAntrian();

        // Menampilkan informasi antrian
        System.out.println(wahana.getInfoAntrian());
    }
}
