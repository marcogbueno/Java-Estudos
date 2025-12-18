//POO: Abstração
//Definição:
//Abstração é o processo de isolar os aspectos essenciais de um objeto do mundo real, omitindo os detalhes desnecessários. É uma forma de pensar apenas no que é importante para o funcionamento de um sistema, sem se preocupar com os detalhes internos.
//Exemplo:
//Imagine uma máquina de café. Para usá-la, basta apertar um botão. Você não precisa saber como ela aquece a água,como os grãos são moídos ou como o café é filtrado. Esses detalhes são abstraídos.

public abstract class Animal {
    public abstract void emitirSom();
}

public class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}