package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    // Menambahkan atribut baru berupa tahunTerbit bertipe integer
    private int tahunTerbit;

    // Menambahkan int tahunTerbit ke dalam parameter Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // Mengisi nilai atribut tahunTerbit
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Menambahkan method Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        // Memperbarui teks output agar menampilkan tahun terbit di dalam kurung setelah penulis
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}