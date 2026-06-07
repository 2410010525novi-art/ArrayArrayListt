package bagian2.arraylist;

import java.util.ArrayList;

// Latihan Mandiri 2.5 No 2
public class TugasArrayList2NilaiTerbesar {

    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList<>();

        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);

        int max = nilai.get(0);

        for (int n : nilai) {

            if (n > max) {
                max = n;
            }
        }

        System.out.println("Nilai terbesar : " + max);
    }
}