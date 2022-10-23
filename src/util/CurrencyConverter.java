package util;public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dolar, double quantiDolar) {
        double c = dolar * IOF;
        return (dolar + c) * quantiDolar;

    }
}
