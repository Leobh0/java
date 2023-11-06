import java.util.Scanner;

public class CalculadoraM {
    public static void main (String[] args) {

        calculadora c = new calculadora();

        Scanner teclado = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            double num1;
            double num2;

            System.out.println("Bem vindos a calculadora em JAVA!  EBAA");


            System.out.println("Escolha operação para ser realizada");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");

            opc = teclado.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Digite o primeiro numero ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Digite o primeiro numero ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.println("Digite o primeiro numero ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo numero ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.divisao(num1, num2));
                    break;
                case 0:
                    System.out.println("Saindo da calculadora!");
                    System.exit(0);
                default:
                    System.out.println("Opção invalida!");
            }

        }

    }
}