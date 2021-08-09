package desafio3;

public class IPI implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        if(valor >= 25000) {
            return 0.1 * valor;
        } else {
            return 0.05 * valor;
        }
    }
}
