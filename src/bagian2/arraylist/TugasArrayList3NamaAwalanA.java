package bagian2.arraylist;

import java.util.ArrayList;
/*
 * Tugas ArrayList No. 3
 * Menampilkan nama yang
 * diawali huruf A.
 */
public class TugasArrayList3NamaAwalanA {

    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {

            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}