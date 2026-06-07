package bagian3.perpustakaan;

// Mengimpor kelas ArrayList dari library Java
import java.util.ArrayList;

public class Perpustakaan {
    // 1. DATA: Membuat ArrayList yang khusus menampung objek bertipe Buku
    private ArrayList<Buku> koleksi = new ArrayList<>();

    // 2. METHOD: Menambah satu objek buku ke dalam koleksi ArrayList
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // 3. METHOD: Menampilkan seluruh koleksi buku beserta nomor urutnya
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        // Perulangan untuk mengambil objek Buku satu per satu berdasarkan indeks
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            // Memanggil method .info() milik class Buku untuk menampilkan datanya
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // 4. METHOD: Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        // Menelusuri seluruh isi koleksi menggunakan for-each
        for (Buku b : koleksi) {
            // Memeriksa apakah judul buku sama dengan judul yang dicari
            if (b.getJudul().equals(judul)) {
                // Jika sudah dipinjam, tampilkan pesan peringatan
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    // Jika tersedia, ubah status dipinjam menjadi true
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return; // Keluar dari method karena buku sudah ditemukan
            }
        }
        // Jika perulangan selesai dan buku tidak ditemukan
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // 5. METHOD: Menghitung jumlah total buku yang masih tersedia (belum dipinjam)
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            // Tanda seru (!) berarti "tidak", jadi jika buku TIDAK dipinjam
            if (!b.isDipinjam()) {
                jumlah++; // Hitungan bertambah 1
            }
        }
        return jumlah; // Mengembalikan hasil hitungan akhir
    }
    // Method untuk mengembalikan buku berdasarkan judul
    public void kembalikanBuku(String judul) {
        // Menelusuri seluruh koleksi buku menggunakan perulangan for-each
        for (Buku b : koleksi) {
            // Memeriksa apakah judul buku sama dengan judul yang diinput
            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false); // Mengubah status dipinjam menjadi false (tersedia kembali)
                System.out.println(judul + " telah dikembalikan.");
                return; // Keluar dari method karena proses pengembalian selesai
            }
        }
        // Jika seluruh isi list sudah diperiksa dan judul buku tidak ditemukan
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }
    // Method untuk mencari dan menampilkan semua buku berdasarkan nama penulis
    public void cariPenulis(String penulis) {
        System.out.println("== Buku karya " + penulis + " ==");
        // Menelusuri seluruh koleksi buku menggunakan perulangan for-each
        for (Buku b : koleksi) {
            // Memeriksa apakah nama penulis buku sama dengan penulis yang dicari
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.getJudul() + " (" + b.getTahunTerbit() + ")");
            }
        }
    }
}