package imovel;

public class Apartamento extends Imovel {

    private int andar;
    private int numero;
    private double condominio;
    private double fundoReserva;
    private double investimento;

    @Override
    public double calcularAluguel() {
        return (super.getValorLocacao() + this.condominio) - (this.fundoReserva + this.investimento);
    }

}
