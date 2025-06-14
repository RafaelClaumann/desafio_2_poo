package imovel;

public abstract class Imovel {

    private int codigo;
    private String endereco;
    private double valorLcacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;

    public abstract double calcularAluguel();

}
