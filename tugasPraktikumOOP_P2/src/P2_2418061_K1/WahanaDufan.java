/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2_2418061_K1;

/**
 *
 * @author farmaardan
 */
public class WahanaDufan {
    String namaWahana; String jenisWahana; String kondisiWahana;
    int wisatawan; int harga;
    
    public WahanaDufan(String nw, String jw, String kw, int wt, int hg){
        this.namaWahana = nw;
        this.jenisWahana = jw;
        this.kondisiWahana = kw;
        this.wisatawan = wt;
        this.harga = hg;
    }
    
    public String getNamaWahana(){
        return namaWahana;
    }
    public String getJenisWisata(){
        return jenisWahana;
    }
    public String getKondisiWahana(){
        return kondisiWahana;
    }
    public int getWisatawan(){
        return wisatawan;
    }
    public int getHargaTiket(){
        return harga;
    }
    
}
