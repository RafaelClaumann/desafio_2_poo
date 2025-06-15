import commom.Locacao;
import imovel.Casa;
import pessoa.Corretor;
import pessoa.Locatario;
import pessoa.Proprietario;

public class Main {
    public static void main(String[] args) {

        final Corretor corretor = new Corretor("nome_do_corretor");
        final Locatario locatario = new Locatario("nome_do_locatario");
        final Proprietario proprietario = new Proprietario("nome_do_proprietario");
        final Casa imovel = new Casa(proprietario, 1200.0);
        final Locacao locacao = new Locacao(imovel, corretor, locatario);

        locacao.pagarProprietario();
        corretor.sacarComissoes(500);

        System.out.println("Hello, World!");
    }
}