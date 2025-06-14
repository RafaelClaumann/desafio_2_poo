package pessoa;

import java.time.LocalDate;

public class Corretor extends Pessoa implements ReceberValor {

    private String registro;
    private LocalDate dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public void sacarComissoes(double valor) {
        System.out.println("pessoa.Corretor sacou comissao: " + valor);
    }

    @Override
    public void receber(final double valor) {
        System.out.println("pessoa.Corretor recebeu: " + valor);
    }

}
