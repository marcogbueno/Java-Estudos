//POO: Encapsulamento
//Definição:
//Encapsulamento significa ocultar os dados internos de um objeto e permitir o acesso apenas por meio de métodos definidos. Isso protege os dados e controla como eles são manipulados.
//Exemplo:
//Um controle remoto tem botões para mudar o canal. Você não pode acessar diretamente os circuitos internos para mudar o canal — você usa os botões (interface).
//Exemplo em código (Java):

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}