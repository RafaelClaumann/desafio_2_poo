package imovel;

import commom.Locacao;
import pessoa.Proprietario;

import java.util.List;

public abstract class Imovel {

    private int codigo;
    private String endereco;
    private double valorLcacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;

    // [Locacao] 1..* ------> 1 [Imovel]
    private List<Locacao> locacoes;

    // [Proprietario] 1 <>------ 1...* [Imovel]
    private Proprietario proprietario;

    public abstract double calcularAluguel();

}
