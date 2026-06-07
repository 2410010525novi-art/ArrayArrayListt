package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan koleksi objek Mahasiswa menggunakan ArrayList
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Method untuk menambah mahasiswa ke dalam koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai mahasiswa
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menampilkan semua data mahasiswa dalam koleksi
    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }

    // Method tambahan untuk mendapatkan jumlah data terbaru (untuk poin 6)
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}