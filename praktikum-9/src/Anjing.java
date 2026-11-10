public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + ": Guk guk!");
    }
}
