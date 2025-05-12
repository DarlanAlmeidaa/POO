public class animal {
    public static void main(String[] args) {
        Gato gato = new Gato("Mimi");
        Cachorro cachorro = new Cachorro("Rex");

        gato.falar();
        cachorro.falar();
    }
}

class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void falar() {
        System.out.println("O animal faz um som");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println(nome + " diz: Miau!");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println(nome + " diz: Au au!");
    }
}
