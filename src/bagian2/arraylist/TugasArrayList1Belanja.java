package bagian2.arraylist;

import java.util.ArrayList;
/*
 * Tugas ArrayList No. 1
 * Menambahkan data belanja,
 * menghapus item ke-2,
 * lalu menampilkan isi dan jumlah item.
 */
public class TugasArrayList1Belanja {

    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        // Menghapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Daftar Belanja : " + belanja);
        System.out.println("Jumlah Item : " + belanja.size());
    }
}