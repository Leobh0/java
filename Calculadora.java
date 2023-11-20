import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Calculadora extends JFrame implements ActionListener {
    JTextField display;
    private double resultado;

    public Calculadora() {

        setTitle("Calculadora");
        setSize(278, 465);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 255, 255));

        setLayout(null);

        resultado = 0;

        JButton arquivo = new JButton("\uD83D\uDCC1");
        arquivo.setBounds(0, 173, 68, 55);
        arquivo.addActionListener(this);
        add(arquivo);

        JButton limpar = new JButton("C");
        limpar.setBounds(68, 173, 65, 55);
        limpar.addActionListener(this);
        add(limpar);

        JButton apagar = new JButton("←");
        apagar.setBounds(133, 173, 65, 55);
        apagar.addActionListener(this);
        add(apagar);

        JButton divisao = new JButton("/");
        divisao.setBounds(196, 173, 65, 55);
        divisao.addActionListener(this);
        add(divisao);


        JButton multiplicacao = new JButton("x");
        multiplicacao.setBounds(196, 227, 65, 50);
        multiplicacao.addActionListener(this);
        add(multiplicacao);

        JButton subtracao = new JButton("-");
        subtracao.setBounds(196, 277, 65, 50);
        subtracao.addActionListener(this);
        add(subtracao);

        JButton adicao = new JButton("+");
        adicao.setBounds(196, 327, 65, 50);
        adicao.addActionListener(this);
        add(adicao);

        JButton igual = new JButton("=");
        igual.setBounds(196, 377, 65, 50);
        igual.addActionListener(this);
        add(igual);

        JButton virgula = new JButton(",");
        virgula.setBounds(133, 377, 65, 50);
        virgula.addActionListener(this);
        add(virgula);

        JButton tres = new JButton("3");
        tres.setBounds(133, 327, 65, 50);
        tres.addActionListener(this);
        add(tres);

        JButton seis = new JButton("6");
        seis.setBounds(133, 277, 65, 50);
        seis.addActionListener(this);
        add(seis);

        JButton nove = new JButton("9");
        nove.setBounds(133, 227, 65, 50);
        nove.addActionListener(this);
        add(nove);

        JButton zero = new JButton("0");
        zero.setBounds(0, 377, 135, 50);
        zero.addActionListener(this);
        add(zero);

        JButton dois = new JButton("2");
        dois.setBounds(68, 327, 65, 50);
        dois.addActionListener(this);
        add(dois);

        JButton cinco = new JButton("5");
        cinco.setBounds(68, 277, 65, 50);
        cinco.addActionListener(this);
        add(cinco);

        JButton oito = new JButton("8");
        oito.setBounds(68, 227, 65, 50);
        oito.addActionListener(this);
        add(oito);

        JButton um = new JButton("1");
        um.setBounds(0, 327, 68, 50);
        um.addActionListener(this);
        add(um);

        JButton quatro = new JButton("4");
        quatro.setBounds(0, 277, 68, 50);
        quatro.addActionListener(this);
        add(quatro);

        JButton sete = new JButton("7");
        sete.setBounds(0, 227, 68, 50);
        sete.addActionListener(this);
        add(sete);


        display = new JTextField();
        display.setBounds(0, 0, 278, 175);
        display.setEditable(false);
        add(display);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton clickedButton) {
            String buttonText = clickedButton.getText();

            if (buttonText.equals("←")) {
                String currentText = display.getText();
                if (!currentText.isEmpty()) {
                    display.setText(currentText.substring(0, currentText.length() - 1));
                }
            } else if (buttonText.equals("\uD83D\uDCC1")) {
                display.setText("");
                resultado = 0;
                JFileChooser fileChooser = new JFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto", "txt");
                fileChooser.setFileFilter(filter);

                int resultado = fileChooser.showOpenDialog(null);

                if (resultado == JFileChooser.APPROVE_OPTION) {

                    File arquivoSelecionado = fileChooser.getSelectedFile();


                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoSelecionado))) {
                        String linha;
                        while ((linha = bufferedReader.readLine()) != null) {
                            display.setText(display.getText() + linha);
                        }
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                } else {
                    display.setText("Nenhum arquivo selecionado.");
                }

            } else if (buttonText.equals("C")) {
                display.setText("");
                resultado = 0;


            } else if (buttonText.equals("/") || buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("x")) {

                display.setText(display.getText() + buttonText);

            } else if (buttonText.equals("=")) {
                try {
                    CalcularExpressao calcular = new CalcularExpressao();
                    resultado = calcular.calcularExpressao(display.getText());
                    display.setText(resultado + " ");
                } catch (NumberFormatException ex) {
                    display.setText("Entrada inválida!");
                } catch (IllegalArgumentException | ArithmeticException ex) {
                    display.setText(ex.getMessage());
                }

            } else {
                display.setText(display.getText() + buttonText);
            }

        }
    }
}





