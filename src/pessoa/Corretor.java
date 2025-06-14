package pessoa;

import commom.Locacao;

import java.time.LocalDate;
import java.util.List;

public class Corretor extends Pessoa implements ReceberValor {

    private String registro;
    private LocalDate dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    // [Locacao] 1...* ------<> 1 [Corretor]
    private List<Locacao> locacoes;

    public void sacarComissoes(double valor) {
        System.out.println("pessoa.Corretor sacou comissao: " + valor);
    }

    @Override
    public void receber(final double valor) {
        System.out.println("pessoa.Corretor recebeu: " + valor);
    }

}
