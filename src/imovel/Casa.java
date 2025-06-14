package imovel;

public class Casa extends Imovel {

    private int quantidadeAndares;

    @Override
    public double calcularAluguel() {
        return super.getValorLocacao();
    }

}
