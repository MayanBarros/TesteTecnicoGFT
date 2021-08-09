package desafio3;

public class ICMS implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        valor *= 0.27;
        return valor;
    }
}
