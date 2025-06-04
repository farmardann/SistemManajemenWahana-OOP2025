/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P7_2418061;

/**
 *
 * @author farmaardan
 */
public class Main {
    public static void main(String[] args) {
        Wahana ancol; // deklarasi referensi superclass

        System.out.println("Penerapan Polimorfisme Upcasting");

        ancol = new waterSlide(); // Upcasting
        System.out.println("Nama                : " + ancol.NamaPembeli("Farma Ardan"));
        ancol.NamaWahana();
        System.out.println("");
        System.out.println("Harga Wahana        : " + ancol.hargaWahana(50000));
        System.out.println("Jumlah tiket        : " + ancol.jumlahTiket(5));
        System.out.println("Total               : " + ancol.Total());
        System.out.println("---------------------------------------------");

        System.out.println("Penerapan Polimorfisme Downcasting");

       
        waterSlide aquatic = (waterSlide) ancol; // downcasting
        
        rollerCoaster A = new rollerCoaster();
        aquatic.kondisi();
        aquatic.kondisi(A);
        
    }
}
