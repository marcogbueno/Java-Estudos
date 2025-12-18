//POO: Polimorfismo
//Definição:
//Polimorfismo significa "muitas formas". Permite que um mesmo método tenha comportamentos diferentes, dependendo do objeto que o invoca.
//Exemplo:
//O método fazerSom() pode fazer um gato miar ou um cachorro latir, dependendo do tipo de animal.
//Exemplo em código (Java):

public class Animal {
    public void fazerSom() {
        System.out.println("Som genérico");
    }
}

public class Gato extends Animal {
    public void fazerSom() {
        System.out.println("Miau");
    }
}

public class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("Au Au");
    }
}

// Em uso:
Animal animal = new Gato();
animal.fazerSom(); // Miau