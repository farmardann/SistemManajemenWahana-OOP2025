/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P7_2418061;

/**
 *
 * @author farmaardan
 */
public class waterSlide extends Wahana {
    int harga, tiket;
    String nama;
    @Override
    public String NamaPembeli(String nm) {
        this.nama = nm;
        return nama;
    }

    @Override
    public void NamaWahana() {
        System.out.print("Nama Wahana         : Wahana Water Slide");
    }

    @Override
    public int hargaWahana(int b) {
        this.harga = b;
        return b;
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
    
    void kondisi(){
        System.out.println("Water Slide memiliki banyak perusutan");
    }
    void kondisi(rollerCoaster A) { 
        System.out.println("Water Slide memiliki kondisi lebih baik daripada Roller Coaster");
    }
   
}
