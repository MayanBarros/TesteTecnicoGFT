package desafio3;

public class COFINS implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        if (valor > 17000) {
            return 0.08 * valor;
        } else {
            return 0;
        }
    }
}
