package desafio3;

public class IPI implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor < 25000) {
            valor *= 0.05;
        } else if (valor >= 25000) {
            valor *= 0.11;
        }
        return valor;
    }
}
