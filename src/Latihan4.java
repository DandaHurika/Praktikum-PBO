import java.util.Scanner;

public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai ujian: ");
        int n = scanner.nextInt();
        int[] nilaiUjian = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextInt();
        }

        System.out.println("\nNilai Minimum : " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum : " + cariNilaiMaksimum(nilaiUjian));

        scanner.close();
    }
}
