//package testeproduto;

public class Produto {
    public static int LimiteEstoque = 10;
    private int codProd;
    private String descrProd;
    private int qteProd;
   
    public static void alteraLimite(int qte){
        if (qte <=0){
            System.out.println("Novo Limite Invalido!!!");
        }
        else{
            LimiteEstoque = qte;
        }
    }
   
    public void statusEstoque(){
        if(qteProd == 0){
            System.out.println("Estoque Nulo!!!");
        }
        else{
            if(qteProd > LimiteEstoque){
                System.out.println("Estoque Regular!!!");
            }
            else{
             System.out.println("Estoque Restrito!!!");
            }
        }
    }
   
    public void adicionaEstoque(int qte){
        if(qte < 0){
            System.out.println("Quantidade Negativa!!!");
        }
        else{
            qteProd += qte;
        }
    }
   
    public void retiraEstoque(int qte){
        if(qte > qteProd){
            System.out.println("quantidade invalida!!!");
        }
        else{
            qteProd -= qte;
        }
    }
   
    public void imprimeProduto(){
        System.out.println("Codigo: " + codProd);
        System.out.println("Descrição: " + descrProd);
        System.out.println("Qte Produto: " + qteProd);
    }
   
    public int getcodProd(){
        return codProd;
    }
   
    public void setcodProd(int codProd){
        this.codProd = codProd;
    }

    public String getDescrProd() {
        return descrProd;
    }

    public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
    }

    public int getQteProd() {
        return qteProd;
    }

    public void setQteProd(int qteProd) {
        this.qteProd = qteProd;
    }
   
    public Produto(){}
        public Produto(int codProd, String descrProd, int qteProd){
            this.codProd = codProd;
            this.descrProd = descrProd;
            this.qteProd = qteProd;
    }

   
   
}

//package testeproduto;

public class TesteProduto {
    public static void main(String[] args) {
        int ValorLimite;
   
    Produto p1 = new Produto(1234, "Celular", 30);
   
    Produto p2 = new Produto();
    p2.setcodProd(3456);
    p2.setDescrProd("monitor");
    p2.retiraEstoque(12);
    p2.retiraEstoque(5);
    p1.imprimeProduto();
    p1.statusEstoque();
    p1.imprimeProduto();
    p1.statusEstoque();
    //Produto.alteraLimite(2);
    novoLimite = entradaValorLimite();
    Produto.alteraLimite(novoLimite);
   
    System.out.println("Novo Limite: " + Produto.LimiteEstoque);
   
    }

    public int entradaValorLimite(int ValorLimite){
       Scanner s1 = new Scanner(System.in);
       System.out.print("Entre com o limite pelo teclado");
       return s1.next();
    }

}