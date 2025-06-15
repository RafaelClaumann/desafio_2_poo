package commom;

import imovel.Imovel;
import pessoa.Corretor;
import pessoa.Locatario;

import java.time.LocalDate;

public class Locacao {

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDate dataPagamento;

    // [Locacao] 1...* ------<> 1 [Locatario]
    // [Locacao] 1...* ------<> 1 [Corretor]
    // [Locacao] 1...* -------> 1 [Imovel]
    private Locatario locatario;
    private Corretor corretor;
    private Imovel imovel;

    public void enviarCobranca() {
        System.out.printf("E-mail: %s%n", locatario.getEmail());
        System.out.printf("O valor referente ao seu aluguel neste mês foi de R$ %f%n.", imovel.calcularAluguel());
    }

    public void pagarProprietario() {
        final double valorAluguel = this.imovel.calcularAluguel();
        this.imovel.getProprietario().receber(valorAluguel);
        this.corretor.receber(valorAluguel);
    }

}
