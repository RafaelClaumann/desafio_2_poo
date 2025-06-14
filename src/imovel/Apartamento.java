package imovel;

public class Apartamento extends Imovel {

    private int andar;
    private int numero;
    private double condominio;
    private double fundoDeReserva;
    private double investimento;

    @Override
    public double calcularAluguel() {
        return (super.getValorLocacao() + this.condominio) - (this.fundoDeReserva + this.investimento);
    }

}
