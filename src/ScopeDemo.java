public class ScopeDemo {
    static void metodeA() {
        int x = 10; // x milik metodeA
        System.out.println("Di metodeA, x = " + x);
    }

    static void metodeB() {
        int x = 99; // x milik metodeB, berbeda dari metodeA
        System.out.println("Di metodeB, x = " + x);
    }

    public static void main(String[] args) {
        metodeA();
        metodeB();
    }
}