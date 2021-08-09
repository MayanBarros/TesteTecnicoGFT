package desafio2;

public class Main {
    public static void main(String[] args) {

        Mesada minhaMesada = new Mesada();
        minhaMesada.setSaldo(1000);
        minhaMesada.pagar(500);
        minhaMesada.sacar(1000);
        double saldo1 = minhaMesada.getSaldo();
        System.out.println("Saldo atual da Conta: " + saldo1);

        MesadaFilhoComportado irmaoComportado = new MesadaFilhoComportado();
        irmaoComportado.setSaldo(2000);
        irmaoComportado.pagar(1000);
        irmaoComportado.sacar(500);
        double saldo2 = irmaoComportado.getSaldo();
        System.out.println("Saldo atual da Conta: " + saldo2);

    }
}
