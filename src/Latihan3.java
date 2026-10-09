public class Latihan3 {
    // Versi 1: Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Versi 2: Celsius ke skala pilihan (Fahrenheit / Kelvin)
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit") || skalaTujuan.equalsIgnoreCase("F")) {
            return (celsius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else {
            System.out.println("Skala tidak dikenal, mengembalikan nilai Celsius asli.");
            return celsius;
        }
    }

    public static void main(String[] args) {
        double celsius = 30.0;

        System.out.println(celsius + " °C = " + konversiSuhu(celsius) + " °F");
        System.out.println(celsius + " °C = " + konversiSuhu(celsius, "Kelvin") + " K");
        System.out.println(celsius + " °C = " + konversiSuhu(celsius, "Fahrenheit") + " °F");
    }
}
