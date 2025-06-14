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

    // [Imovel] 1 <------ 1...* [Locacao]
    private List<Locacao> locacoes;

    // [Imovel] 1...* ------<> 1 [Proprietario]
    private Proprietario proprietario;

    public abstract double calcularAluguel();

}
