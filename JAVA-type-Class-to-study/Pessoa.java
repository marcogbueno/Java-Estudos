public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private String rg;

    // Construtor sem parâmetros
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String cpf, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }

    // Construtor de cópia
    public Pessoa(Pessoa outra) {
        this.nome = outra.nome;
        this.endereco = outra.endereco;
        this.cpf = outra.cpf;
        this.rg = outra.rg;
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public void imprimePessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}

//Classe Aluno (Herda de Pessoa)

public class Aluno extends Pessoa {
    private int matricula;
    private double p1;
    private double p2;
    private int faltas;

    private final int LIMITE_FALTAS = 10;
    private final double MEDIA_APROVACAO = 7.0;
    private final double MEDIA_REPROVACAO = 3.0;

    public Aluno() { super(); }

    public Aluno(String nome, String endereco, String cpf, String rg, int matricula, double p1, double p2, int faltas) {
        super(nome, endereco, cpf, rg);
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.faltas = faltas;
    }

    // Construtor de cópia
    public Aluno(Aluno outro) {
        super(outro); // Chama construtor de cópia da Pessoa
        this.matricula = outro.matricula;
        this.p1 = outro.p1;
        this.p2 = outro.p2;
        this.faltas = outro.faltas;
    }

    // Getters e Setters
    public double getP1() { return p1; }
    public void setP1(double p1) { this.p1 = p1; }
    public double getP2() { return p2; }
    public void setP2(double p2) { this.p2 = p2; }
    public int getFaltas() { return faltas; }
    public void setFaltas(int faltas) { this.faltas = faltas; }

    public void imprimeAluno() {
        super.imprimePessoa();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota P1: " + p1 + " | Nota P2: " + p2);
        imprimeFaltas();
    }

    public void imprimeFaltas() {
        System.out.println("Total de faltas: " + faltas);
    }

    public void resultado() {
        double media = (p1 + p2) / 2;
        System.out.print("Status: ");
        if (faltas > LIMITE_FALTAS) {
            System.out.println("REPROVADO POR FALTAS");
        } else if (media >= MEDIA_APROVACAO) {
            System.out.println("APROVADO (Média: " + media + ")");
        } else if (media < MEDIA_REPROVACAO) {
            System.out.println("REPROVADO POR NOTA (Média: " + media + ")");
        } else {
            System.out.println("EM REAVALIAÇÃO/EXAME (Média: " + media + ")");
        }
    }
}


//Classe TesteAluno

public class TesteAluno {
    public static void main(String[] args) {
        // Teste Pessoa
        System.out.println("--- DADOS DA PESSOA ---");
        Pessoa jose = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
        jose.imprimePessoa();

        // Teste Aluno Pedro
        System.out.println("\n--- DADOS DO ALUNO PEDRO ---");
        Aluno pedro = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 4.5, 8.0, 10);
        pedro.imprimeAluno();
        pedro.resultado();

        // Teste Aluno Francisco (Cópia de Pedro)
        System.out.println("\n--- NOVO ALUNO (FRANCISCO - BASEADO NO PEDRO) ---");
        Aluno francisco = new Aluno(pedro);
        francisco.setNome("Francisco");
        francisco.setP1(9.0);
        francisco.setP2(9.5);
        francisco.imprimeAluno();
        francisco.resultado();

        // Alterando faltas do Francisco
        System.out.println("\n--- STATUS FRANCISCO (APÓS 11 FALTAS) ---");
        francisco.setFaltas(11);
        francisco.resultado();

        // Alterando notas do Francisco
        System.out.println("\n--- STATUS FRANCISCO (NOTAS 8.0 E 9.5) ---");
        francisco.setP1(8.0);
        francisco.setP2(9.5);
        // Note: como as faltas ainda são 11, ele continuará reprovado por faltas
        francisco.resultado();
    }
}