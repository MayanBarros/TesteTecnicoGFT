package desafio1;

public class Caixa {

    public Double calculaValorFinal(Produto produto, Integer quantidade) {
        if (produto.getTipo() == 1) {
            return 0.9 * produto.getValor() * quantidade;
        }
        if (produto.getTipo() == 2) {
            return 0.8 * produto.getValor() * quantidade;
        }
        if (produto.getTipo() == 3 && quantidade > 5) {
            return 0.9 * produto.getValor() * quantidade;
        } else {
            return 0.9 * produto.getValor() * quantidade;
        }
    }
}
