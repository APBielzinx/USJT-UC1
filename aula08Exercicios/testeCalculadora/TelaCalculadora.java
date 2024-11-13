package aula08Exercicios.testeCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadora extends JFrame implements ActionListener {
    // Tela para exibir os números e resultados
    private JTextField txtDisplay;

    private int num1 = 0;
    private int num2 = 0;
    private String operador = "";

    // Construtor para configurar a interface
    public TelaCalculadora() {

        setTitle("Calculadora");
        setLayout(new BorderLayout());
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra a janela na tela

        // Display (campo de texto para exibir números e resultados)
        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Arial", Font.PLAIN, 24));
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setEditable(false); // O display não pode ser editado diretamente
        add(txtDisplay, BorderLayout.NORTH);


        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid para botões
        add(painelBotoes, BorderLayout.CENTER);

        // Botões numéricos (0 a 9)
        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        // Adicionando os botões ao painel
        for (String texto : botoes) {
            JButton btn = new JButton(texto);
            btn.addActionListener(this);
            painelBotoes.add(btn);
        }


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();
        System.out.println(comando);

        // Se o comando for um número
        if (comando.matches("[0-9]")) {

            txtDisplay.setText(txtDisplay.getText() + comando);
        }
        // Se o comando for 'C' (limpar)
        else if (comando.equals("C")) {
            txtDisplay.setText("");
            num1 = num2 = 0;
            operador = "";
        }

        else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            // Armazena o primeiro número e o operador
            num1 = Integer.parseInt(txtDisplay.getText());
            operador = comando;
            txtDisplay.setText("");
        }

        else if (comando.equals("=")) {
            num2 = Integer.parseInt(txtDisplay.getText());

            int resultado = 0;


            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {

                        txtDisplay.setText("Erro");
                        return;
                    }
                    break;
            }


            txtDisplay.setText(String.valueOf(resultado));
            num1 = resultado;
        }
    }

}
