//Complementar: Classe
//Definição:
//Classe é um molde (ou modelo) para criar objetos. Ela define os atributos (características) e os métodos (comportamentos) que os objetos daquele tipo terão.
//Exemplo:
//Pense em um projeto de construção: é um plano que define como construir casas. A classe é esse plano.
//Exemplo em código (Java):

public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}