/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.perpustakaan;

/**
 *
 * @author haha hihii darrr
 */
public class MainPerpustakaan {
    public static void main(String[] args) {
// Membuat objek pengelola
Perpustakaan perpus = new Perpustakaan();

// Membuat objek Buku lalu memasukkannya ke koleksi
perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
perpus.tampilkanKoleksi();
System.out.println();
perpus.pinjamBuku("Bumi Manusia");
perpus.pinjamBuku("Bumi Manusia");

System.out.println();

perpus.kembalikanBuku("Bumi Manusia");

System.out.println();

perpus.cariPenulis("Andrea Hirata");// coba pinjam kedua kali
System.out.println();
perpus.tampilkanKoleksi();
System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
}
}
