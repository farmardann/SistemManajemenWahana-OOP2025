/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_2418061_2;

/**
 *
 * @author farmaardan
 */
public class wahanaAir extends antrianWahana{
    public wahanaAir(String namaWahana, int nomorAwal) {
        super(namaWahana, nomorAwal);
    }

    public String getInfoAntrian() {
        return "Wahana: " + namaWahana + " | Antrian Saat Ini: " + nomorAntrian +
               " | Antrian Selanjutnya: " + lanjutAntrian;
    }
}
