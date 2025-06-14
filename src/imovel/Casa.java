package imovel;

public class Casa extends Imovel {

    private int qtdeAndares;

    @Override
    public double calcularAluguel() {
        return super.getValorLocacao();
    }

}
