/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P7_2418061;

/**
 *
 * @author farmaardan
 */
public class rollerCoaster extends Wahana{
    int harga, tiket;
    String nama;
    
    
    @Override
    public String NamaPembeli(String nm) {
        this.nama = nm;
        return nama;
    }

    @Override
    public void NamaWahana() {
        System.out.print("Nama Wahana         : Roller Coaster");
    }

    @Override
    public int hargaWahana(int jml) {
        this.harga = jml;
        return harga;
    }
    
    @Override
    public int jumlahTiket(int jml) {
        this.tiket = jml;
        return tiket;
    }

    @Override
    public int Total() {
        return harga * tiket;
    }
   
}
