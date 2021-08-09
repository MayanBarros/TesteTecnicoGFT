package desafio3;

public class COFINS implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor > 13000) {
            valor *= 0.04;
        } else if (valor <= 13000) {
            return 0;
        }
        return valor;
    }
}
