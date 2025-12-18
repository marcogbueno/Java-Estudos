//package testaeletrodomestico;

public class Eletrodomestico {
    String nome;
    int    voltagem;
    double peso;
    String cor;
   
    public Eletrodomestico(){}
    public Eletrodomestico(String nome){
        this.nome = nome;
    }
   
    public void Operar(){
        System.out.println(nome + "Operando!!!");
    }
   
    public void Imprimir(){
       
        System.out.println("Cor:"      + cor);
        System.out.println("Nome:"     + nome);
        System.out.println("Peso:"     + peso);
        System.out.println("Voltagem:" + voltagem);
       
    }
   
    public void Desligar(){
        System.out.println(nome + "Desligado!!!");
    }
   
    public void Ligar(){
        System.out.println(nome + "ligado!!!");
    }
} 

//package testaeletrodomestico;

public class TestaEletrodomestico {
    public static void main(String[] args) {
       
        Eletrodomestico Eletro1 = new Eletrodomestico("Geladeira");
        Eletrodomestico X = new Eletrodomestico();
        Eletro1.nome     = "Refrigerador";
        Eletro1.cor      = "Black piano";
        Eletro1.peso     = 27.8;
        Eletro1.voltagem = 220;
       
        X.nome     = "Refrigerador";
        X.cor      = "Black piano";
        X.peso     = 27.8;
        X.voltagem = 220;
        Eletro1.Imprimir();
   
    }
   
}