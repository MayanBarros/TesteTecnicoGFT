package desafio3;


import java.util.Date;

public class Jogador {
    private String nome;
    private String posicao;
    private String dataDeNascimento;

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void imprimirDados() {
        System.out.println("Nome do Jogador: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Posição: " + this.posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}
