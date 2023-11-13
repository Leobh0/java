import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    public Calculadora() {
        setTitle("Calculadora");
        setSize(278, 465);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,255,255));

        setLayout(null);

        JButton divisao = new JButton("/");
        divisao.setBounds(196, 177, 65, 50);
        add(divisao);

        JButton multiplicacao = new JButton("x");
        multiplicacao.setBounds(196, 227, 65, 50);
        add(multiplicacao);

        JButton subtracao = new JButton("-");
        subtracao.setBounds(196, 277, 65, 50);
        add(subtracao);

        JButton adicao = new JButton("+");
        adicao.setBounds(196, 327, 65, 50);
        add(adicao);

        JButton igual = new JButton("=");
        igual.setBounds(196, 377, 65, 50);
        add(igual);

        JButton virgula = new JButton(",");
        virgula.setBounds(133, 377, 65, 50);
        add(virgula);

        JButton tres = new JButton("3");
        tres.setBounds(133, 327, 65, 50);
        add(tres);

        JButton seis = new JButton("6");
        seis.setBounds(133, 277, 65, 50);
        add(seis);

        JButton nove = new JButton("9");
        nove.setBounds(133, 227, 65, 50);
        add(nove);

        JButton zero = new JButton("0");
        zero.setBounds(68, 377, 65, 50);
        add(zero);

        JButton dois = new JButton("2");
        dois.setBounds(68, 327, 65, 50);
        add(dois);

        JButton cinco = new JButton("5");
        cinco.setBounds(68, 277, 65, 50);
        add(cinco);

        JButton oito = new JButton("8");
        oito.setBounds(68, 227, 65, 50);
        add(oito);

        JButton um = new JButton("1");
        um.setBounds(0, 327, 68, 50);
        add(um);

        JButton quatro = new JButton("4");
        quatro.setBounds(0, 277, 68, 50);
        add(quatro);

        JButton sete = new JButton("7");
        sete.setBounds(0, 227, 68, 50);
        add(sete);


        JTextField display = new JTextField();
        display.setBounds(0,0,278,175);
        add(display);

        setVisible(true);

    }


}
