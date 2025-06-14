public class Proprietario extends Pessoa implements ReceberValor {

    private String conta;
    private String agencia;

    @Override
    public void receber(final double valor) {
        System.out.println("Proprietario recebeu: " + valor);
    }

}
