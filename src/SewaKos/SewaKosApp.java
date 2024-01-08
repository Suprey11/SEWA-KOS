package SewaKos;

import java.util.Scanner;

public class SewaKosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama\t: Supriyatin"); // Update the name
        System.out.println("NIM\t: 32602200015"); // Update the NIM
        System.out.println("Masukkan informasi Kos:");
        System.out.print("Nama Kos: ");
        String namaKos = scanner.nextLine();
        System.out.print("Alamat Kos: ");
        String alamatKos = scanner.nextLine();
        System.out.print("Harga Sewa per Bulan: ");
        double hargaSewa = scanner.nextDouble();

        Kos kos = new Kos(namaKos, alamatKos, hargaSewa);

        System.out.println("\nMasukkan informasi Kamar:");

        // Menambahkan beberapa kamar ke dalam daftar kamar kos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Kamar " + i);
            System.out.print("Nomor Kamar: ");
            int nomorKamar = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline di buffer
            System.out.print("Fasilitas Kamar: ");
            String fasilitas = scanner.nextLine();

            Kamar kamar = new Kamar(namaKos, alamatKos, hargaSewa, nomorKamar, fasilitas);
            kos.tambahKamar(kamar);
        }

        // Menampilkan informasi kos dan kamar-kamar yang telah diinput
        System.out.println("\nInformasi Kos dan Kamar:");
        System.out.println("Nama Kos: " + kos.getNamaKos());
        System.out.println("Alamat Kos: " + kos.getAlamat());
        System.out.println("Harga Sewa per Bulan: " + kos.getHargaSewa());
        System.out.println("\nDaftar Kamar:");

        for (Kamar kamar : kos.getDaftarKamar()) {
            System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
            System.out.println("Fasilitas: " + kamar.getFasilitas());
            System.out.println("------------------");
        }

        // Memulai aplikasi konsol
        String perintah;
        do {
            System.out.println("\nMasukkan perintah (help, info, kamar, exit):");
            System.out.print("Perintah: ");
            perintah = scanner.nextLine();
            kos.eksekusiPerintah(perintah);
        } while (!perintah.toLowerCase().equals("exit"));

        scanner.close();
    }
}
