public class CalcularExpressao {
    public double calcularExpressao(String expressao) {

        expressao = expressao.replaceAll("\\s+", "");
        expressao = expressao.replaceAll(",", ".");

        if (expressao.isEmpty()) {
            throw new IllegalArgumentException("Expressão vazia!");
        }

        if (!expressao.contains("+") && !expressao.contains("-") && !expressao.contains("x") && !expressao.contains("/")) {
            return Double.parseDouble(expressao);
        }

        if (expressao.startsWith("+") || expressao.startsWith("-") || expressao.startsWith("x") || expressao.startsWith("/")) {
            throw new IllegalArgumentException("Expressão começa com um operador inválido!");
        }
        if (expressao.endsWith("+") || expressao.endsWith("-") || expressao.endsWith("x") || expressao.endsWith("/")) {
            throw new IllegalArgumentException("Expressão termina com um operador inválido!");
        }


        String[] elementos = expressao.split("(?=[-+x/])|(?<=[-+x/])");

        double resultado = Double.parseDouble(elementos[0]);

        for (int i = 1; i < elementos.length; i += 2) {
            String operador = elementos[i];
            double proximoNumero = Double.parseDouble(elementos[i + 1]);

            switch (operador) {
                case "+":
                    Soma soma = new Soma();
                    resultado = soma.calcular(resultado,proximoNumero);
                    break;
                case "-":
                    Subtracao subtracao = new Subtracao();
                    resultado = subtracao.calcular(resultado,proximoNumero);
                    break;
                case "x":
                    Multiplicacao multiplicacao = new Multiplicacao();
                    resultado = multiplicacao.calcular(resultado,proximoNumero);
                    break;
                case "/":
                    if (proximoNumero == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida!");
                    }
                    Divisao divisao = new Divisao();
                    resultado = divisao.calcular(resultado,proximoNumero);
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido: " + operador);
            }
        }

        return resultado;
    }
}