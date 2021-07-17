public class Comida {


    //
    // 3 Classes, 1 - Pessoa, 2 - Comida, 3 - Jantar
    // Jantar metodo main, algoritmo, para criar uma pessoa, instanciar uma pessoa, e duas comidas, e fazer com que
    // a pessoa coma uma comida
    // A pessoa terá o peso (Double) e o nome (String) e também tem o metodo comer.
    // Comida vai ter nome da comida, e peso da comida
    // Quando passar o metodo comer, acrescentar o peso da comida no peso da pessoa.
    // Classe jantar, instanciar feijão(peso) construtor
    // p.comer(nomeDaComida da classe Comida)
    // após comer mostrar o peso da pessoa depois de comer.

    private String nome;
    public double peso;

    // Construtores

    public Comida(){}

    public Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
