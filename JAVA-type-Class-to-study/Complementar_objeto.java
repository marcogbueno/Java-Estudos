//Complementar: Objeto
//Definição:
//Objeto é uma instância de uma classe. Ele representa algo real que possui um estado e pode executar ações.
//Exemplo:
//Se a classe é o projeto da casa, o objeto é a casa construída de fato.
//Exemplo em código (Java):

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Maria";
        p1.idade = 30;
        p1.apresentar(); // Saída: Olá, meu nome é Maria
    }
}

//Complementar: Mensagem
//Definição:
//Mensagem é o ato de enviar uma solicitação a um objeto para que ele execute um método. É como a comunicação entre objetos em POO.
//Exemplo:
//Se você disser a um robô: "andar()", você está enviando uma mensagem para ele executar uma ação.
//Exemplo em código (Java):

Pessoa p = new Pessoa();
p.apresentar(); // Mensagem para o objeto executar o método