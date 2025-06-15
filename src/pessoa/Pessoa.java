package pessoa;

public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    protected Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
