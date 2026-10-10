import java.util.Scanner;

public class KalkulatorMethod {

    // a) Operasi Dasar (Method Static dengan Parameter & Return Value)
    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return Double.NaN;
        }
        return a / b;
    }

    static double pangkat(double base, double exp) {
        return Math.pow(base, exp);
    }

    static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Error: Akar kuadrat dari angka negatif tidak valid!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    // c) Method Overloading pada 'tambah'
    static double tambah(double a, double b) {
        return a + b;
    }

    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // d) Method riwayatKeMaksimum
    static double riwayatKeMaksimum(double[] riwayat, int jumlahRiwayat) {
        if (jumlahRiwayat == 0) return Double.NaN;

        double max = riwayat[0];
        for (int i = 1; i < jumlahRiwayat; i++) {
            if (riwayat[i] > max) {
                max = riwayat[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] riwayatHasil = new double[100]; // Penampung riwayat hasil
        int jumlahRiwayat = 0;
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n========== KALKULATOR METHOD ==========");
            System.out.println("1. Penjumlahan (2 Angka)");
            System.out.println("2. Penjumlahan (3 Angka) [Overloading]");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");

            int pilihan = scanner.nextInt();
            double hasil = Double.NaN;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = scanner.nextDouble();
                    hasil = tambah(a1, b1);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c2 = scanner.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b3 = scanner.nextDouble();
                    hasil = kurang(a3, b3);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b4 = scanner.nextDouble();
                    hasil = kali(a4, b4);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b5 = scanner.nextDouble();
                    hasil = bagi(a5, b5);
                    if (!Double.isNaN(hasil)) System.out.println("Hasil: " + hasil);
                    break;

                case 6:
                    System.out.print("Masukkan angka basis: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double exp = scanner.nextDouble();
                    hasil = pangkat(base, exp);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    double angkaAkar = scanner.nextDouble();
                    hasil = akarKuadrat(angkaAkar);
                    if (!Double.isNaN(hasil)) System.out.println("Hasil: " + hasil);
                    break;

                case 8:
                    berjalan = false;
                    System.out.println("\nKeluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // Simpan hasil perhitungan ke riwayat jika nilainya valid
            if (!Double.isNaN(hasil)) {
                riwayatHasil[jumlahRiwayat++] = hasil;
            }
        }

        // Tampilkan nilai maksimum dari riwayat hasil saat keluar program
        System.out.println("\n----------------------------------------");
        double maxHasil = riwayatKeMaksimum(riwayatHasil, jumlahRiwayat);
        if (Double.isNaN(maxHasil)) {
            System.out.println("Tidak ada perhitungan yang dilakukan.");
        } else {
            System.out.println("Nilai hasil perhitungan TERBESAR yang pernah dilakukan: " + maxHasil);
        }
        System.out.println("========================================");

        scanner.close();
    }
}