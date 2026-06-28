/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Menghitung rata-rata
    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        if (daftarMahasiswa.size() == 0)
            return 0;

        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah lulus
    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Mengembalikan jumlah mahasiswa
    public int tampilkanSemua() {

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(
                    m.getNama() + " | " +
                    m.getNpm() + " | Nilai : " +
                    m.getNilai() +
                    " | Lulus : " + m.lulus());
        }

        return daftarMahasiswa.size();
    }
}
