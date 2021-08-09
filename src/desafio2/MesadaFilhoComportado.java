package desafio2;

public class MesadaFilhoComportado {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double pagar(double valor) {
        this.saldo += valor;
        return saldo;
    }

    public Double sacar(double valor) {
        valor = valor - (0.1 / 100);
        this.saldo -= valor;
        return saldo;
    }

    public void InformarSaldo() {
        System.out.println(this.saldo);
    }

    @Override
    public String toString() {
        return "Mesada{" +
                "saldo=" + saldo +
                '}';
    }
}
