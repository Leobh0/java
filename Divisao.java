public class Divisao {
    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de divisão por zero.
        }
    }
}
