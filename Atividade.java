package AtividadeSomativa;

import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        // Usuário deverá entrar com dois valores e escolher a operação matemática
        System.out.println("Digite o primeiro valor");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = sc.nextDouble();
        System.out.println(
                "Digite a operação matématica desejada 1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão");
        double operacao = sc.nextDouble();
        if (operacao == 1) {
            operacao = valor1 + valor2;
            System.out.println("O resultado é igual a: " + operacao);
        } else if (operacao == 2) {
            operacao = valor1 - valor2;
            System.out.println("O resultado é igual a: " + operacao);
        } else if (operacao == 3) {
            operacao = valor1 * valor2;
            System.out.println("O resultado é igual a: " + operacao);
        } else if (operacao == 4) {
            operacao = valor1 / valor2;
            System.out.println("O resultado é igual a: " + operacao);
        } else {
            System.out.println("Operação inválida");
        }

    }

    public void Exercicio2() {
        // Ler o número da matricula do aluno e distribuir para um time (quatro times)
        System.out.println("Digite o número da matricula");
        int matricula = sc.nextInt();
        if (matricula % 4 == 0) {
            System.out.println("O aluno vai para o time do Chris");

        } else if (matricula % 4 == 1) {
            System.out.println("O aluno vai para o time do Greg");
        } else if (matricula % 4 == 2) {
            System.out.println("O aluno vai para o time do Caruso");
        } else if (matricula % 4 == 3) {
            System.out.println("O aluno vai para o time do Jerome");
        } else {
            System.out.println("Valor Inválido");
        }

    }

    public void Exercicio3() {
        // Se o cliente comprar mais de 8kg ou gastar mais de 25R$, receberá 10% de
        // desconto
        System.out.println("Digite a quantidade de morangos que deseja comprar em kg");
        double morango = sc.nextDouble();
        System.out.println("Digite a quantidade de maças que deseja comprar em kg");
        double maca = sc.nextDouble();
        System.out.println("Digite a quantidade de bananas que deseja comprar em kg");
        double banana = sc.nextDouble();
        double valor1 = (morango * 2.5);
        double valor2 = (maca * 1.8);
        double valor3 = (banana * 1.3);
        double peso = (morango + maca + banana);
        double precoTotal = (valor1 + valor2 + valor3);
        if (peso >= 8 || precoTotal >= 25) {
            precoTotal = precoTotal - (precoTotal * 0.1);
            System.out.println("Valor total da compra com desconto é de R$: "+precoTotal);
        }
        else {System.out.println("Valor total da compra sem desconto é de R$ "+ precoTotal);}
    }

}
