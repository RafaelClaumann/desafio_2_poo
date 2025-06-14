package pessoa;

import commom.Locacao;

import java.util.List;

public class Locatario extends Pessoa {

    private String email;
    private String salario;

    // [Locatario] 1 <> ------ 1...* [Locacao]
    private List<Locacao> locacoes;

}
