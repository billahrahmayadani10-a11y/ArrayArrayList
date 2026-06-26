/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.array;

/**
 *
 * @author haha hihii darrr
 */
public class LatihanMandiriArray {
    public static void main(String[] args) {

        // =========================
        // Nomor 1
        // =========================
        double[] suhu = {30.5, 28.7, 32.1, 29.8, 31.4, 27.9};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {

            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }

        }

        System.out.println("=== Nomor 1 ===");
        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);

        // =========================
        // Nomor 2
        // =========================
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Minggu"};

        System.out.println("\n=== Nomor 2 ===");

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // =========================
        // Nomor 3
        // =========================
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\n=== Nomor 3 ===");
        System.out.println("Jumlah angka genap : " + jumlahGenap);
    }
}
