/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author SYAIDA FILZA
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== KALKULATOR BANGUN RUANG (PBO / OOP) ===");

        // Membuat objek-objek bangun ruang
        Bangun_ruang kubus = new Kubus(4.0);
        Bangun_ruang balok = new Balok(5.0, 3.0, 2.0);
        Bangun_ruang tabung = new Tabung(7.0, 10.0);

        // Memasukkan objek ke dalam array untuk demonstrasi Polymorphism
        Bangun_ruang[] daftarBangun = {kubus, balok, tabung};

        // Menampilkan hasil perhitungan menggunakan perulangan
        for (Bangun_ruang b : daftarBangun) {
            String namaKelas = b.getClass().getSimpleName();
            System.out.println("\n----------------------------------");
            System.out.println("Bangun Ruang    : " + namaKelas);
            System.out.printf("Volume          : %.2f\n", b.hitungVolume());
            System.out.printf("Luas Permukaan  : %.2f\n", b.hitungLuasPermukaan());
        }
        System.out.println("----------------------------------");
    }
}
