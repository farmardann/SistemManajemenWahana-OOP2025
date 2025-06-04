/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P8_2418061;

/**
 *
 * @author farmaardan
 */
//import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Wahana ancol;
        ancol = new waterSlide();
        int jumlahTiket;

        try {
            System.out.println("====== Program Pembelian Tiket Wahana ======");
            System.out.print("Masukkan nama Anda : ");
            String nama = input.nextLine();
            if (nama.isEmpty()) {
                throw new IllegalArgumentException("Nama tidak boleh kosong!");
            }

            System.out.print("Masukkan alamat Anda : ");
            String alamat = input.nextLine();
            if (alamat.isEmpty()) {
                throw new IllegalArgumentException("Alamat tidak boleh kosong!");
            }

            System.out.print("Masukkan jumlah tiket : ");
            jumlahTiket = Integer.parseInt(input.nextLine());
            System.out.println("---------------------------------------------");
            System.out.println("Data Diri");
            System.out.println("Nama                : " + ancol.NamaPembeli(nama));
            System.out.println("Alamat              : " + ancol.AlamatPembeli(alamat));
            System.out.println("---------------------------------------------");

            // Tiket Water Slide
            System.out.println("Pembelian tiket wahana Water Slide");
            ancol.NamaWahana();
            System.out.println("");
            System.out.println("Harga Wahana        : " + ancol.hargaWahana());
            System.out.println("Jumlah tiket        : " + ancol.jumlahTiket(jumlahTiket));
            System.out.println("Total               : " + ancol.Total());
            System.out.println("---------------------------------------------");

            // Tiket Roller Coaster
            System.out.println("Pembelian tiket wahana Roller Coaster");
            ancol = new rollerCoaster();
            ancol.NamaWahana();
            System.out.println("");
            System.out.println("Harga Wahana        : " + ancol.hargaWahana());
            System.out.println("Jumlah tiket        : " + ancol.jumlahTiket(jumlahTiket));
            System.out.println("Total               : " + ancol.Total());
            System.out.println("---------------------------------------------");

        } catch (NumberFormatException e) { // exception handling input jumlah tiket
            JOptionPane.showMessageDialog(null, "Input jumlah tiket harus berupa angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException e) { // exception handling input nama dan alamat
            JOptionPane.showMessageDialog(null, e.getMessage(), "Peringatan", JOptionPane.WARNING_MESSAGE);
        } finally {
            System.out.println("Terima kasih telah menggunakan program pembelian tiket.");
        }
    }
}
