/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4_2418061_1;

/**
 *
 * @author farmaardan
 */
public class rollerCoaster extends Wahana{
    String nama = "Roller Coaster";
    private int karyawan;
    
    public void setKaryawan(int krywn){
        this.karyawan = krywn;
    }
    public int getKaryawan(){
        return karyawan;
    }
    public rollerCoaster() {
        super.harga = 50000;
        super.jumlahTiket = 5;
    }
   
}
