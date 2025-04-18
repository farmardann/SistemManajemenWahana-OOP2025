/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_2418061_2;

/**
 *
 * @author farmaardan
 */
public class antrianWahana {
    protected String namaWahana;
    protected int nomorAntrian;
    protected int lanjutAntrian;

    public antrianWahana(String namaWahana, int nomorAwal) {
        this.namaWahana = namaWahana;
        this.nomorAntrian = nomorAwal;
        this.lanjutAntrian = nomorAwal + 1;
    }

    public int ambilAntrian() {
        nomorAntrian++; // ✅ Tambah nomor antrian sekarang
        lanjutAntrian = nomorAntrian + 1; // ✅ Perbarui nomor antrian berikutnya
        return nomorAntrian;
    }
}
