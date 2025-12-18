//package uscs;

public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    
    // Atributos estáticos para serem compartilhados por todos os objetos
    private static int limiteEstoque = 10;
    private static int totalProdutosCriados = 0;

    // Construtor Default
    public Produto() {
        totalProdutosCriados++;
    }

    // Construtor com parâmetros
    public Produto(int codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = Math.max(0, quantidade); // Garante que não inicie negativo
        totalProdutosCriados++;
    }

    // Getters e Setters (Encapsulamento)
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    // Métodos de Estoque
    public void adicionaEstoque(int qtd) {
        if (qtd > 0) this.quantidade += qtd;
    }

    public void retiraEstoque(int qtd) {
        if (this.quantidade >= qtd) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Erro: Estoque insuficiente para retirar " + qtd + " de " + descricao);
        }
    }

    public void statusEstoque() {
        if (this.quantidade == 0) {
            System.out.println("Status: Estoque Nulo");
        } else if (this.quantidade <= limiteEstoque) {
            System.out.println("Status: Estoque Restrito");
        } else {
            System.out.println("Status: Estoque Regular");
        }
    }

    public void imprimeProduto() {
        System.out.println("Cod: " + codigo + " | Desc: " + descricao + " | Qtd: " + quantidade);
    }

    public static void imprimeTotaldeProdutos() {
        System.out.println("Total de produtos criados: " + totalProdutosCriados);
    }

    public static void alteraLimite(int novoLimite) {
        if (novoLimite > 0) {
            limiteEstoque = novoLimite;
        }
    }
}

//Classe TesteProduto

//package uscs;

import java.util.Scanner;

public class TesteProduto {

    public static void entradaValorLimite() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o novo Limite de Estoque: ");
        int novo = sc.nextInt();
        if (novo >= 0) {
            Produto.alteraLimite(novo);
        } else {
            System.out.println("Valor deve ser >= 0.");
        }
    }

    public static void main(String[] args) {
        // a) Instanciando p1
        Produto p1 = new Produto(1232, "Celular Samsung S8", 30);

        // b) Instanciando p2 e inicializando
        Produto p2 = new Produto();
        p2.setCodigo(3456);
        p2.setDescricao("Monitor Samsung SyncMaster");
        p2.setQuantidade(12);

        // c) Primeira baixa
        p1.retiraEstoque(5);
        p2.retiraEstoque(8);

        // d) Impressão 1
        System.out.println("--- Relatório 1 ---");
        p1.imprimeProduto();
        p1.statusEstoque();
        p2.imprimeProduto();
        p2.statusEstoque();

        // e) Segunda baixa
        p1.retiraEstoque(10);
        p2.retiraEstoque(12); // Tentativa de retirar mais do que existe

        // f) Impressão 2
        System.out.println("\n--- Relatório 2 ---");
        p1.imprimeProduto();
        p1.statusEstoque();
        p2.imprimeProduto();
        p2.statusEstoque();
        
        Produto.imprimeTotaldeProdutos();

        // g) Alteração do limite global
        entradaValorLimite();
        
        System.out.println("\n--- Status após novo limite ---");
        p1.statusEstoque();
        p2.statusEstoque();
    }
}