package imovel;

import pessoa.Proprietario;

public class Casa extends Imovel {

    private int quantidadeAndares;

    public Casa() {
        super();
    }

    public Casa(Proprietario proprietario, double valorAluguel) {
        super(proprietario, valorAluguel);
    }

    @Override
    public double calcularAluguel() {
        return super.getValorLocacao();
    }

}
