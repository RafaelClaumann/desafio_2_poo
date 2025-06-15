package imovel;

import commom.Locacao;
import pessoa.Proprietario;

import java.util.List;

public abstract class Imovel {

    private int codigo;
    private String endereco;
    private double valorLocacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;

    // [Imovel] 1 <------ 1...* [Locacao]
    // [Imovel] 1...* ------<> 1 [Proprietario]
    private List<Locacao> locacoes;
    private Proprietario proprietario;

    public abstract double calcularAluguel();

    public double getValorLocacao() {
        return valorLocacao;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

}
