//package uscs;

public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    
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
        this.quantidade = quantidade;
        totalProdutosCriados++;
    }

    // Métodos de encapsulamento (Getters e Setters)
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    // Métodos de Estoque
    public void adicionaEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public void retiraEstoque(int qtd) {
        if (this.quantidade >= qtd) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Erro: Estoque insuficiente para retirar " + qtd + " unidades de " + descricao);
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
        System.out.println("Código: " + codigo + " | Descrição: " + descricao + " | Quantidade: " + quantidade);
    }

    public static void imprimeTotaldeProdutos() {
        System.out.println("Total de produtos criados: " + totalProdutosCriados);
    }

    public static void alteraLimite(int novoLimite) {
        if (novoLimite >= 0) {
            limiteEstoque = novoLimite;
            System.out.println("Novo limite de estoque definido para: " + novoLimite);
        }
    }
}

//Classe TesteProduto

//package uscs;

import java.util.Scanner;

public class TesteProduto {

    public static void entradaValorLimite() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o novo valor para o Limite de Estoque: ");
        int novoLimite = sc.nextInt();
        
        if (novoLimite >= 0) {
            Produto.alteraLimite(novoLimite);
        } else {
            System.out.println("Valor inválido! O limite deve ser >= 0.");
        }
    }

    public static void main(String[] args) {
        // a) Criar p1 via construtor com parâmetros
        Produto p1 = new Produto(1232, "Celular Samsung S8", 30);

        // b) Criar p2 via construtor default e inicializar
        Produto p2 = new Produto();
        p2.setCodigo(3456);
        p2.setDescricao("Monitor Samsung SyncMaster");
        p2.setQuantidade(12);

        // c) Transações de baixa iniciais
        p1.retiraEstoque(5);
        p2.retiraEstoque(8);

        // d) Imprimir informações e status
        System.out.println("--- Relatório Parcial ---");
        p1.imprimeProduto();
        p1.statusEstoque();
        p2.imprimeProduto();
        p2.statusEstoque();

        // e) Transações de baixa adicionais
        p1.retiraEstoque(10);
        p2.retiraEstoque(12); // Note: p2 tinha 4, restará insuficiente para retirar 12

        // f) Imprimir informações e status novamente
        System.out.println("\n--- Relatório Final ---");
        p1.imprimeProduto();
        p1.statusEstoque();
        p2.imprimeProduto();
        p2.statusEstoque();
        
        Produto.imprimeTotaldeProdutos();

        // g) Exercitar alteração de limite
        entradaValorLimite();
        
        System.out.println("\n--- Verificação após novo limite ---");
        p1.statusEstoque();
        p2.statusEstoque();
    }
}