import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Calculadora();
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        Scanner teclado = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {
            double num1;
            double num2;

            System.out.println("Bem vindos a calculadora em JAVA! EBAA");

            System.out.println("Escolha operação para ser realizada");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");

            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o primeiro número ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = teclado.nextDouble();
                    System.out.println(soma.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro número ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = teclado.nextDouble();
                    System.out.println(subtracao.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Digite o primeiro número ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = teclado.nextDouble();
                    System.out.println(multiplicacao.multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.println("Digite o primeiro número ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número ");
                    num2 = teclado.nextDouble();
                    System.out.println(divisao.divisao(num1, num2));
                    break;
                case 0:
                    System.out.println("Saindo da calculadora!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
