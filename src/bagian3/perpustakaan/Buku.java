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
public class Buku {
   // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Setter
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Informasi buku
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";

        return judul + " oleh " + penulis
                + " (" + tahunTerbit + ")"
                + " [" + status + "]";
    }
}
