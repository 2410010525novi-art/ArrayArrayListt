package bagian1.array;

public class TugasArray3Genap {
    public static void main(String[] args) {

        int[] angka = {4, 8, 15, 16, 23, 42};

        int genap = 0;

        for (int a : angka) {

            if (a % 2 == 0) {
                genap++;
            }
        }

        System.out.println("Jumlah genap : " + genap);
    }
}