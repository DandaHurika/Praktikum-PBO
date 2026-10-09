public class Latihan1 {
    // Method hitung luas persegi panjang
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Method hitung luas lingkaran
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang (10 x 5): " + luasPersegiPanjang(10, 5));
        System.out.println("Luas Persegi Panjang (7.5 x 4): " + luasPersegiPanjang(7.5, 4));

        System.out.println("Luas Lingkaran (r = 7): " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r = 10): " + luasLingkaran(10));
    }
}