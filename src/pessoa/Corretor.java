package pessoa;

import commom.Locacao;

import java.time.LocalDate;
import java.util.List;

public class Corretor extends Pessoa implements ReceberValor {

    private String registro;
    private LocalDate dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    // [Corretor] 1 <>------ 1...* [Locacao]
    private List<Locacao> locacoes;

    public void sacarComissoes(final double valor) {
        this.totalComissaoAcumulada = this.totalComissaoAcumulada - valor;
    }

    @Override
    public void receber(final double valor) {
        System.out.printf("O corretor %s está recebendo o valor de R$ %f%n", super.getNome(), valor + this.totalComissaoAcumulada);
    }

}
