/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SewaKos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Kos implements Informasi, KamarInterface, Perintah {
    private String namaKos;
    private String alamat;
    private double hargaSewa;
    private List<Kamar> daftarKamar;

    public Kos(String namaKos, String alamat, double hargaSewa) {
        this.namaKos = namaKos;
        this.alamat = alamat;
        this.hargaSewa = hargaSewa;
        this.daftarKamar = new ArrayList<>();
    }

    public String getNamaKos() {
        return namaKos;
    }

    public void setNamaKos(String namaKos) {
        this.namaKos = namaKos;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public List<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\nInformasi Kos:");
        System.out.println("Nama Kos: " + getNamaKos());
        System.out.println("Alamat Kos: " + getAlamat());
        System.out.println("Harga Sewa per Bulan: " + getHargaSewa());
        System.out.println("Jumlah Kamar Tersedia: " + getDaftarKamar().size());
    }

    @Override
    public void tampilkanKamarTersedia() {
        System.out.println("\nKamar Tersedia di Kos:");
        for (Kamar kamar : getDaftarKamar()) {
            if (!kamar.isTerisi()) {
                System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
                System.out.println("Fasilitas: " + kamar.getFasilitas());
                System.out.println("------------------");
            }
        }
    }

    @Override
    public void eksekusiPerintah(String perintah) {
        switch (perintah.toLowerCase()) {
            case "help":
                System.out.println("Daftar Perintah:");
                System.out.println("help  - Menampilkan daftar perintah");
                System.out.println("info  - Menampilkan informasi kos");
                System.out.println("kamar - Menampilkan kamar yang tersedia");
                System.out.println("exit  - Keluar dari aplikasi");
                break;
            case "info":
                tampilkanInfo();
                break;
            case "kamar":
                tampilkanKamarTersedia();
                break;
            case "exit":
                System.out.println("Terima kasih. Sampai jumpa!");
                break;
            default:
                System.out.println("Perintah tidak valid. Ketik 'help' untuk bantuan.");
        }
    }
}

