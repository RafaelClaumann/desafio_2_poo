import java.time.LocalDate;

public class Corretor extends Pessoa {

    private String registro;
    private LocalDate dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public void sacarComissoes(double valor) {
        System.out.println("Corretor sacou comissao: " + valor);
    }

    public void receber(double valor) {
        System.out.println("Corretor recebeu: " + valor);
    }

}
