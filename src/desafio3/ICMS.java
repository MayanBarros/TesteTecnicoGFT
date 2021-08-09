package desafio3;

public class ICMS implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        return 0.3 * valor;
    }
}
