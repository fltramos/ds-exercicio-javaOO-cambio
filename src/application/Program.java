package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double dolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double quantiDolar = sc.nextDouble();

        double d = CurrencyConverter.converter(dolar, quantiDolar);

        System.out.printf("Valor a ser pago em reais = %.2f", d);

        sc.close();
    }
}
