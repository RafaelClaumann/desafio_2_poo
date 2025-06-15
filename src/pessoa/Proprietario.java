package pessoa;

import imovel.Imovel;

import java.util.List;

public class Proprietario extends Pessoa implements ReceberValor {

    private String conta;
    private String agencia;

    // [Proprietario] 1 <>------ 1...* [Imovel]
    private List<Imovel> imoveis;

    public Proprietario(String nome) {
        super(nome);
    }

    @Override
    public void receber(final double valor) {
        System.out.printf("O proprietário %s está recebendo o valor de R$ %f%n", super.getNome(), valor);
    }

}
