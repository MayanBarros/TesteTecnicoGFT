package desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int boazinha = 0;
        int malvada = 0;

        // Cinco crianças
        for (int i = 1 ; i <= 5 ; i++) {

            System.out.println("Qual o nome da Criança?");
            String nome = leitor.nextLine();

            System.out.println("Você é uma criança malvada ou boazinha ?");
            String personalidade = leitor.nextLine();

            Crianca criancaAtual = new Crianca();

            criancaAtual.setNome(nome);
            criancaAtual.setPersonalidade(personalidade);

            if (criancaAtual.getPersonalidade() == "malvada") {
                malvada++;
            } else {
                boazinha++;
            }
        }

        System.out.println("Papai noel entregou " + boazinha + " presentes");
        System.out.println("Papai não noel entregou " + malvada + " presentes");


    }
}
