package desafio1;

public class Crianca {

    private String nome;
    private String personalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    @Override
    public String toString() {
        return "Crianca{" +
                "nome='" + nome + '\'' +
                ", personalidade='" + personalidade + '\'' +
                '}';
    }
}
