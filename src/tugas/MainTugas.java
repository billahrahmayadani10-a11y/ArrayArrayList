/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author haha hihii darrr
 */
public class MainTugas {
     public static void main(String[] args) {

        // Membuat objek kelas
        KelasKuliah kelas = new KelasKuliah();

        // Menambah mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "23001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "23002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "23003", 75));

        // Menampilkan semua mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        int jumlah = kelas.tampilkanSemua();

        // Menyimpan nama mata kuliah
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("\nDaftar Mata Kuliah:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        // Menampilkan rata-rata
        System.out.println("\nRata-rata Nilai : " + kelas.hitungRataRata());

        // Menampilkan jumlah lulus
        System.out.println("Jumlah Lulus : " + kelas.jumlahLulus());

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa : " + jumlah);

        // Menambah mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "23004", 90));

        System.out.println("\nSetelah Menambah Mahasiswa Baru");
        System.out.println("Jumlah Mahasiswa : " + kelas.tampilkanSemua());
    }
}
