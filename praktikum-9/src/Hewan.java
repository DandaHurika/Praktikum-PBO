public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara... ");
    }
}