public class OverLoadingDemo {
    // Method tambah dengan 2 parameter int
    static int tambah(int a, int b) {
        return a + b;
    }

    // Overloading 1: Beda jumlah parameter (3 parameter int)
    static int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading 2: Beda tipe parameter (2 parameter double)
    static double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(tambah(2, 3));         // Panggil versi 2 int
        System.out.println(tambah(2, 3, 4));      // Panggil versi 3 int
        System.out.println(tambah(2.5, 3.5));     // Panggil versi double
    }
}