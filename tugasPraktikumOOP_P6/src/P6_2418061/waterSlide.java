/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P6_2418061;

/**
 *
 * @author farmaardan
 */
public class waterSlide extends Wahana {
    String n, w;
    int ht, jmlT;
    
    public waterSlide(){
        this.n = "Muhammad Kevin Abdullah Jafar";
        this.w = "Water Slide";
        this.ht = 25000;
        this.jmlT = 5;
    }
    @Override
    public String Nama() {
        return n;
    }
    @Override
    public String Wahana() {
        return w;
    }

    @Override
    public int hargaTiket() {
        return ht;
    }

    @Override
    public int jmlTiket() {
        return jmlT;
    }

    @Override
    public int total() {
        return ht * jmlT;
    }
   
   
}
