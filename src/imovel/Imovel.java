package imovel;

import commom.Locacao;

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

    public abstract double calcularAluguel();

}
