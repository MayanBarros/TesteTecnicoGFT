package desafio3;

public class Main {
    public static void main(String[] args) {

        // Não consegui manipular as datas como pedido no exercio :( ...

        Jogador neymar = new Jogador();
        neymar.setNome("Neymar");
        neymar.setPosicao("Atacante");
        neymar.setDataDeNascimento("20/04/2003");

        Jogador messi = new Jogador();
        messi.setNome("Messi");
        messi.setPosicao("Atacante");
        messi.setDataDeNascimento("13/07/1988");

        System.out.println(neymar.getNome());
        System.out.println(neymar.getPosicao());
        System.out.println(neymar.getDataDeNascimento());

        System.out.println("__________________________");

        System.out.println(messi.getNome());
        System.out.println(messi.getPosicao());
        System.out.println(messi.getDataDeNascimento());

    }

}
