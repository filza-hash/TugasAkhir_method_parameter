# Kalkulator Bangun Ruang (Java - OOP / PBO)

Program kalkulator sederhana berbasis **Pemrograman Berorientasi Objek (PBO / Object-Oriented Programming)** menggunakan bahasa Java dan dibangun melalui **Apache NetBeans**. Proyek ini mendemonstrasikan penerapan pilar-pilar OOP seperti *Abstraction*, *Inheritance* (Pewarisan), dan *Polymorphism*.

## 📂 Struktur Proyek

Proyek ini dibagi menjadi dua file utama dalam *package* yang sama:
1. **`Bangun_ruang.java`**: Berisi kelas abstrak (`Bangun_ruang`) sebagai kerangka utama, beserta kelas-kelas turunan (`Kubus`, `Balok`, `Tabung`) yang mengimplementasikan rumus perhitungan masing-masing.
2. **`Main.java`**: Berisi fungsi utama (`main`) untuk menjalankan program, menginisialisasi objek, serta mendemonstrasikan polimorfisme dengan menampilkan hasil perhitungan ke layar.

## 🚀 Fitur & Pilar OOP yang Digunakan

- **Abstraction (Abstraksi):** Menggunakan `abstract class` dan `abstract method` untuk mendefinisikan kontrak wajib (`hitungVolume` dan `hitungLuasPermukaan`) bagi setiap bangun ruang.
- **Inheritance (Pewarisan):** Kelas anak (`Kubus`, `Balok`, `Tabung`) mewarisi struktur dari kelas induk (`Bangun_ruang`).
- **Polymorphism (Polimorfisme):** Memproses berbagai objek bangun ruang secara bersamaan di dalam sebuah *loop* menggunakan referensi dari kelas induk.

## 🛠️ Cara Menjalankan di Apache NetBeans

1. Buka aplikasi **Apache NetBeans**.
2. Buat proyek Java baru (misalnya dengan nama `KalkulatorBangunRuang`).
3. Buat dua file baru di dalam folder `src` (atau *package* proyek Anda):
   - `Bangun_ruang.java`
   - `Main.java`
4. Salin kode program yang sesuai ke dalam masing-masing file tersebut.
5. Klik kanan pada file **`Main.java`**, lalu pilih **Run File** (atau tekan `Shift + F6`).
6. Lihat hasil perhitungan pada jendela **Output** di bagian bawah NetBeans.

## 📝 Contoh Output Program

```text
=== KALKULATOR BANGUN RUANG (PBO / OOP) ===

----------------------------------
Bangun Ruang    : Kubus
Volume          : 64.00
Luas Permukaan  : 96.00

----------------------------------
Bangun Ruang    : Balok
Volume          : 30.00
Luas Permukaan  : 62.00

----------------------------------
Bangun Ruang    : Tabung
Volume          : 1539.38
Luas Permukaan  : 747.69
----------------------------------
