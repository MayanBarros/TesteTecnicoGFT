package desafio3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Imposto i1 = new ICMS();
        Imposto i2 = new IPI();
        Imposto i3 = new COFINS();

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        double icms = i1.calculaImposto(valor);
        System.out.printf("ICMS: %.2f%n", icms);

        double ipi = i2.calculaImposto(valor);
        System.out.printf("ICMS: %.2f%n", ipi);

        double cofins = i3.calculaImposto(valor);
        System.out.printf("ICMS: %.2f%n", cofins);

        System.out.printf("Valor final: %.2f", (valor + icms + ipi + cofins));
    }
}
