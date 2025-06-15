# Desafio 2 - Programação Orientada à Objetos

### Diagrama de classes

![image](https://github.com/user-attachments/assets/afb31b53-9342-4d6d-a2cf-40cca3107aaa)

### Requisitos

- [x] O cálculo do aluguel deverá ser feito por cada subclasse, de acordo com as regras do
  tipo de imóvel
  - Para a `Casa`, o aluguel será apenas o valor definido no `Imovel`
  - `Apartamento`, o aluguel será a soma do valor do aluguel com o valor do
    condomínio, subtraindo-se desse valor o fundo de reserva e os investimentos
- [x]  A implementação do método `receber()`, para o `Corretor` e o `Proprietario`, devem
  imprimir uma linha na console:
    - O proprietário *nome* está recebendo o valor de R$ *valor*
    - O corretor *nome* está recebendo o valor de R$ *valor*
    - Para o `Corretor`, também deve adicionar o valor da comissão ao atributo
      `totalComissaoAcumulada`
- [x] A implementação do método `sacarComissao()` referente ao `Corretor` deve
  decrementar do valor de `totalComissaoAcumulada` o valor que foi sacado
- [x] A implementação do método `enviarCobranca()` referente à classe `Locacao` deve
  imprimir o seguinte texto na console:
  ```plain
    E-mail: <e-mail do locatário>
    O valor referente ao seu aluguel neste mês foi de R$<valor calculado do aluguel>
    ```
- [x] A implementação do método `pagarProprietario()` referente à classe `Locacao` deve
  chamar o método `receber()` da classe `Proprietario`, enviando o valor líquido que este
  deve receber, e o método `receber()` da classe `Corretor`, enviando o valor da comissão
  que deve receber

### Critérios

- [x] Implementar a classe `Pessoa` com todos os atributos e métodos definidos no diagrama de classes
- [x] Implementar a classe `Corretor` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Proprietário` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Locatario` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Imovel` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Casa` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Apartamento` com todos os atributos e métodos definidos no diagrama de classes 
- [x] Implementar a classe `Locacao` com todos os atributos e métodos definidos no diagrama de classes
