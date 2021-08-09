package desafio1;

public class Programa {
    public static void main(String[] args) {
        Produto banana = new Produto("Banana", 0.99, 2);
        Produto energetico = new Produto("Energético", 5.49, 3);
        Produto arroz = new Produto("Arroz", 20.00, 1);
        Produto chocolate = new Produto("Chocolate", 4.50, 1);
        Produto leite = new Produto("Leite", 3.73, 3);
        Produto abacaxi = new Produto("Abacaxi", 2.40, 2);

        Caixa caixa = new Caixa();

        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(banana, 3));
        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(energetico, 7));
        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(arroz, 1));
        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(chocolate, 12));
        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(leite, 5));
        System.out.printf("R$%.2f%n", caixa.calculaValorFinal(abacaxi, 1));
    }
}
