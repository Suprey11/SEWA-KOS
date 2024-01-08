/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SewaKos;

/**
 *
 * @author andre
 */
class Kamar extends Kos {
    private int nomorKamar;
    private String fasilitas;
    private boolean terisi;

    public Kamar(String namaKos, String alamat, double hargaSewa, int nomorKamar, String fasilitas) {
        super(namaKos, alamat, hargaSewa);
        this.nomorKamar = nomorKamar;
        this.fasilitas = fasilitas;
        this.terisi = false;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }
}

