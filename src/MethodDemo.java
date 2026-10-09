public class MethodDemo {
    // Method void dengan parameter nama
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method void dengan beberapa parameter
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    public static void main(String[] args) {
        // Panggil method sapa
        sapa("Budi");
        sapa("Siti");

        // Panggil method tampilkanBiodata
        tampilkanBiodata("Budi", 20, "Bandung");
    }
}
