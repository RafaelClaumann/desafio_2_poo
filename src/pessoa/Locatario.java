package pessoa;

import commom.Locacao;

import java.util.List;

public class Locatario extends Pessoa {

    private String email;
    private String salario;

    // [Locacao] 1...* ------<> 1 [Locatario]
    private List<Locacao> locacoes;

}
