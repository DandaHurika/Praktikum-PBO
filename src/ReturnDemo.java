public class ReturnDemo {
    // Method mengembalikan nilai int
    static int tambah(int a, int b) {
        return a + b;
    }

    // Method mengembalikan nilai boolean
    static boolean isGenap(int angka) {
        return angka % 2 == 0;
    }

    public static void main(String[] args) {
        int hasil = tambah(15, 7);
        System.out.println("Hasil tambah: " + hasil);

        System.out.println("Apakah 8 genap? " + isGenap(8));
        System.out.println("Apakah 7 genap? " + isGenap(7));
    }
}