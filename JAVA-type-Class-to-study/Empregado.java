//package uscs;

public class Empregado {
    // Atributos privados (Encapsulamento - Item 3)
    private int codigo;
    private String nome;
    private String cargo;
    private double salario;

    // Atributos estáticos para controle global (Item 1 e 7)
    private static int contadorEmpregados = 0;

    // Construtor sem parâmetros (Item 1 e 7)
    public Empregado() {
        contadorEmpregados++;
        this.codigo = contadorEmpregados; // Auto-incremento (Item 7)
    }

    // Construtor com parâmetros (Item 1 e 7)
    // Nota: O código não é mais recebido, pois é auto-incrementado
    public Empregado(String nome, String cargo, double salario) {
        contadorEmpregados++;
        this.codigo = contadorEmpregados; // Auto-incremento (Item 7)
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos Getter e Setter (Item 5 e 6)
    public int getCodigo() { return codigo; }
    // Nota: Não criamos setCodigo para garantir a integridade do auto-incremento

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Funções solicitadas (Item 1)
    public void imprimeEmpregado() {
        System.out.println("ID: " + codigo + 
                           " | Nome: " + nome + 
                           " | Cargo: " + cargo + 
                           " | Salário: R$ " + salario);
    }

    public static void totalEmpregados() {
        System.out.println("Quantidade total de empregados criados: " + contadorEmpregados);
    }
}

//package uscs;

public class TesteEmpregado {
    public static void main(String[] args) {
        // a) Criar e1 via construtor (Adaptado para auto-incremento: ID será 1)
        Empregado e1 = new Empregado("Paulo Silva", "Gerente Financeiro", 15400.00);

        // b) Criar e2 via construtor default e inicializar com setters (ID será 2)
        Empregado e2 = new Empregado();
        e2.setNome("Ana Paula");
        e2.setCargo("Analista de Sistemas Senior");
        e2.setSalario(10700.00);

        // c) Executar os métodos de impressão
        System.out.println("--- Dados dos Empregados ---");
        e1.imprimeEmpregado();
        e2.imprimeEmpregado();

        // d) Executar a função TotalEmpregados
        System.out.println("");
        Empregado.totalEmpregados();
    }
}