package commom;

import pessoa.Corretor;
import pessoa.Locatario;

import java.time.LocalDate;

public class Locacao {

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDate dataPagamento;
    private Locatario locatario;
    private Corretor corretor;

    public void enviarCobranca() {
        System.out.println("Enviando cobranca");
    }

    public void pagarProprietario() {
        System.out.println("Pagando proprietario");
    }

}
