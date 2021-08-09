package desafio4;

public class ContaCorrente extends Conta {

    @Override
    public Double rendimento() {
        return this.getSaldo() * 0.05;
    }
}
