public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        // Hitung berapa elemen yang nilainya di atas rata-rata
        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }

        // Buat array baru sesuai ukuran elemen yang memenuhi syarat
        int[] hasil = new int[count];
        int idx = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[idx++] = nilai;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] data = {70, 85, 60, 90, 75, 95, 80};

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("Total Nilai    : " + total);
        System.out.printf("Rata-rata Kelas : %.2f\n", rataRata);

        int[] diAtasRataRata = filterDiAtasRataRata(data);
        System.out.print("Elemen di atas rata-rata: ");
        for (int n : diAtasRataRata) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
