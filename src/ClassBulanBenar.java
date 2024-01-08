/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
package uts;

/**
 *
 * author andre
 */
public abstract class ClassBulan {
    public int jumlah_hari = 30;

    // Perbaikan: Ganti nama metode dari 'hari_libur' menjadi 'getHariLibur'
    protected int getHariLibur() {
        // Perbaikan: Ubah pengembalian nilai menjadi 22 tanpa mengubah 'jumlah_hari'
        return 22;
    }

    // Perbaikan: Tambahkan kata kunci 'abstract' karena ini adalah metode abstrak
    public abstract int libur_nasional();

    // Perbaikan: Hapus implementasi metode 'ganjil', karena ini adalah metode abstrak
    public abstract boolean ganjil();

    // Perbaikan: Hapus implementasi metode 'genap', karena metode abstrak tidak memiliki implementasi
    // Perbaikan: Tambahkan kata kunci 'abstract' karena ini adalah metode abstrak
    public abstract boolean genap();

    // Perbaikan: Tambahkan metode setter untuk mengubah nilai 'jumlah_hari'
    public void setJumlahHari(int jumlah_hari) {
        this.jumlah_hari = jumlah_hari;
    }
}

