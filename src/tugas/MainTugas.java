// Nama: Novi Cahyani Lukman
// NPM: 2410010525

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Menyimpan daftar nama mata kuliah dalam sebuah array String (minimal 3, ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data", "Jaringan Komputer"};
        
        // Menampilkan daftar mata kuliah
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Poin 3: Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: Menambah minimal 5 objek Mahasiswa ke dalam koleksi
        kelas.tambahMahasiswa(new Mahasiswa("Ahmad", "23010101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "23010102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "23010103", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dika", "23010104", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "23010105", 90.0));

        // Menampilkan seluruh data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // Poin 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("=== STATISTIK KELAS ===");
        System.out.printf("Rata-rata Nilai : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mhs Lulus: " + kelas.jumlahLulus() + " mahasiswa");
        System.out.println("Total Data Awal : " + kelas.getJumlahMahasiswa() + " mahasiswa");
        System.out.println();

        // Poin 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println(">>> Menambahkan 1 mahasiswa baru...");
        Mahasiswa mhsBaru = new Mahasiswa("Fahmi", "23010106", 65.0);
        kelas.tambahMahasiswa(mhsBaru);

        // Poin 6: Menampilkan kembali jumlah data terbaru setelah penambahan
        System.out.println("=== DATA SETELAH PENAMBAHAN ===");
        kelas.tampilkanSemua();
        System.out.println("Total Data Terbaru: " + kelas.getJumlahMahasiswa() + " mahasiswa");
    }
}