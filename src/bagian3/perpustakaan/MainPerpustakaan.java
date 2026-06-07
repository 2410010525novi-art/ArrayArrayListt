package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        // Memperbarui pembuatan objek Buku dengan menambahkan data tahun terbit di parameter ketiga
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        perpus.tampilkanKoleksi();
        
        // 4. PINJAM BUKU: Harus dipanggil 2 kali untuk memicu tulisan "sedang dipinjam"
        System.out.println();
        perpus.pinjamBuku("Bumi Manusia"); // Panggilan ke-1 (Berhasil dipinjam)
        perpus.pinjamBuku("Bumi Manusia"); // Panggilan ke-2 (Sedang dipinjam)
        
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        
        // --- UJI COBA LATHIAN MANDIRI ---
        System.out.println();
        System.out.println(">> Menguji Pengembalian Buku:");
        perpus.kembalikanBuku("Bumi Manusia"); // Menguji method kembalikanBuku
        
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        
        System.out.println();
        // Menguji method cariPenulis
        perpus.cariPenulis("Andrea Hirata");
    }
}