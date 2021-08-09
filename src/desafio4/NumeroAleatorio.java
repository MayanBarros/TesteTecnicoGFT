package desafio4;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int intAleatorio = 0;
        int numeroUsuario = 1000;

        System.out.println("Digite um número de 0 a 10 que você acha que corresponde ao valor gerado alearoriamente até acertá-lo: ");
        while (intAleatorio != numeroUsuario) {
            intAleatorio = random.nextInt(10);
            System.out.print("Digite um número: ");
            numeroUsuario = sc.nextInt();
        }

        System.out.println("Você acertou!");
    }
}
