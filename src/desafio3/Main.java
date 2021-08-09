package desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para calcular os impostos: ");
        double valor = leitor.nextDouble();

        ICMS meuICMS = new ICMS();
        double icms = meuICMS.calculaImposto(valor);
        System.out.println(String.format("ICMS: R$%.2f", icms));

        IPI meuIPI = new IPI();
        double ipi = meuIPI.calculaImposto(valor);
        System.out.println(String.format("IPI: R$%.2f", ipi));

        COFINS meuCOFINS = new COFINS();
        double cofins = meuCOFINS.calculaImposto(valor);
        System.out.println(String.format("COFINS: R$%.2f", cofins));

        double totalImposto = icms + ipi + cofins;
        System.out.println(String.format("O total do seu imposto é : R$%.2f", totalImposto));

    }
}
