package desafio2;

import java.util.*;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new LinkedHashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º número: ");
            numeros.add(sc.nextInt());
        }

        //Maior número
        int maiorNumero = 0;
        for (Integer numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("Maior número: " + maiorNumero);

        //Menor número
        System.out.println("Menor número(Entre colchetes): " + numeros.stream().min(Comparator.comparingInt(Integer::intValue)));

        //Média
        double soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        System.out.println("Média: " + soma / 10);

        //Números acima de 10
        int numerosAcimaDez = 0;
        for (Integer numero : numeros) {
            if (numero > 10) {
                numerosAcimaDez ++;
            }
        }
        System.out.println("Números acima de 10 :" + numerosAcimaDez);

        //Números acima de 50
        int numerosAcimaCinquenta = 0;
        for (Integer numero : numeros) {
            if (numero > 50) {
                numerosAcimaCinquenta ++;
            }
        }
        System.out.println("Números acima de 50 :" + numerosAcimaCinquenta);
    }
}
