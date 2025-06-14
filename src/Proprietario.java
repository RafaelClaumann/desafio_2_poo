public class Proprietario extends Pessoa {

    private String conta;
    private String agencia;

    void receber(double valor) {
        System.out.println("Proprietario recebeu: " + valor);
    }

}
