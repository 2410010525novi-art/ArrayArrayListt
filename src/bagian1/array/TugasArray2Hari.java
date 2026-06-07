package bagian1.array;

// Menampilkan nama hari dengan huruf lebih dari 5
public class TugasArray2Hari {

    public static void main(String[] args) {
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        for (String h : hari) {

            if (h.length() > 5) {
                System.out.println(h);
            }
        }
    }
}