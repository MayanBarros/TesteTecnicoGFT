package desafio4;

public class Main {
    public static void main(String[] args) {

        //Conta corrente
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setNumero(43446678);
        contaCorrente.setTitular("Mayan Barros da Silva");
        contaCorrente.setSaldo(100000.0);

        System.out.println("Conta Corrente Itaú");
        System.out.println("Nome: " + contaCorrente.getTitular());
        System.out.println("Numero: " + contaCorrente.getNumero());
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        System.out.println("Rendimento: " + contaCorrente.rendimento());


        System.out.println("__________________________________________________");


        //Conta poupança
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumero(45778554);
        contaPoupanca.setTitular("Patricia da Silva Barros");
        contaPoupanca.setSaldo(500000.0);

        System.out.println("Conta Poupança Banco do Brasil");
        System.out.println("Nome: " + contaPoupanca.getTitular());
        System.out.println("Numero: " + contaPoupanca.getNumero());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        System.out.println("Rendimento: " + contaPoupanca.rendimento());

    }
}
