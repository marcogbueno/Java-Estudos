//POO: Herança
//Definição:
//Herança é o mecanismo que permite que uma classe herde características (atributos e métodos) de outra. Promove reutilização de código e hierarquia entre classes.
//Exemplo:
//Uma classe Veiculo pode ter métodos comuns como acelerar() e frear(). Classes Carro e Moto podem herdar esses comportamentos de Veiculo.
//Exemplo em código (Java):

public class Veiculo {
    public void acelerar() {
        System.out.println("Acelerando...");
    }
}

public class Carro extends Veiculo {
    // Herda o método acelerar()
}