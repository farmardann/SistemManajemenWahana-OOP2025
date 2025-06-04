/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P9_2418061;

/**
 *
 * @author farmaardan
 */
public class waterSlide extends Wahana implements dapatPelampung, dapatKolamRenang{
    int harga, tiket;
    String nama, alamat;
    @Override
    public String NamaPembeli(String nm) {
        this.nama = nm;
        return nama;
    }
    
    @Override
    public String AlamatPembeli(String nma) {
        this.alamat = nma;
        return alamat;
    }

    @Override
    public void NamaWahana() {
        System.out.print("Nama Wahana         : Wahana Water Slide");
    }

    @Override
    public int hargaWahana() {
        this.harga = 25000;
        return harga;
    }
    
    @Override
    public int jumlahTiket(int a) {
        this.tiket = a;
        return a;
    }

    @Override
    public int Total() {
        return harga * tiket;
    }

    @Override
    public void banplmpng() {
        System.out.println("Terdapat banyak pelampung untuk keselamatan wisatawan");
    }

    @Override
    public void Kolam() {
        System.out.println("Memiliki Kolam yang luas");
    }
   
}
