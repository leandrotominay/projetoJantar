import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {


        // 3 Classes, 1 - Pessoa, 2 - Comida, 3 - Jantar
        // Jantar metodo main, algoritmo, para criar uma pessoa, instanciar uma pessoa, e duas comidas, e fazer com que
        // a pessoa coma uma comida
        // A pessoa terá o peso (Double) e o nome (String) e também tem o metodo comer.
        // Comida vai ter nome da comida, e peso da comida
        // Quando passar o metodo comer, acrescentar o peso da comida no peso da pessoa.
        // Classe jantar, instanciar feijão(peso) construtor
        // p.comer(nomeDaComida da classe Comida)
        // após comer mostrar o peso da pessoa depois de comer.

        // Instanciar manualmente Pessoa p = new Pessoa("Leandro", 67.0);
        System.out.println("Olá! bem-vindo ao Restaurante Vegano Virtual");
        // Criação das Pessoas
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        p1.setNome(nome);
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
        p1.setPeso(peso);
        System.out.println("Seja muito bem vindo " + p1.getNome() + "!");
        // Criação das Comidas
        Comida c1 = new Comida("Carne vegana", 1.3);
        Comida c2 = new Comida("Verdura", 1.1);
        System.out.println("No momento temos duas comidas disponiveis:");
        System.out.println(" Opção [1] " + c1.getNome() + " Opção [2] " + c2.getNome());
        System.out.println("O Que você deseja comer?");
        int opcao = sc.nextInt();
        if(opcao == 1){
            p1.comer(c1);
        }
        else if(opcao == 2){
            p1.comer(c2);
        }

        System.out.println("Você agora pesa: " + p1.getPeso() + "kg");
        System.out.println("Obrigado por comer no RVV!");


    }
}
