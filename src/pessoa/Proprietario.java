package pessoa;

import imovel.Imovel;

import java.util.List;

public class Proprietario extends Pessoa implements ReceberValor {

    private String conta;
    private String agencia;

    // [Proprietario] 1 <>------ 1...* [Imovel]
    private List<Imovel> imoveis;

    @Override
    public void receber(final double valor) {
        System.out.println("pessoa.Proprietario recebeu: " + valor);
    }

}
