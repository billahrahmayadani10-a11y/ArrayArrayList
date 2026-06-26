/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        // =========================
        // Nomor 1
        // =========================
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Menghapus item ke-2 (index 1)
        daftarBelanja.remove(1);

        System.out.println("=== Nomor 1 ===");
        System.out.println("Daftar Belanja:");

        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }

        System.out.println("Jumlah item: " + daftarBelanja.size());

        // =========================
        // Nomor 2
        // =========================
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(8);
        angka.add(70);
        angka.add(25);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("\n=== Nomor 2 ===");
        System.out.println("Nilai terbesar: " + terbesar);

        // =========================
        // Nomor 3
        // =========================
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Citra");
        nama.add("Aldi");
        nama.add("Dina");

        System.out.println("\n=== Nomor 3 ===");
        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
