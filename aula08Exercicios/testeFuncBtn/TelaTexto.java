package aula08Exercicios.testeFuncBtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTexto extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public TelaTexto() {
        super("Exemplo de Tela com Texto");

        // Painel de entrada de texto
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JLabel lblTexto = new JLabel("Texto:");
        txtTexto = new JTextField(20);
        painelEntrada.add(lblTexto);
        painelEntrada.add(txtTexto);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.NORTH);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            String texto = txtTexto.getText();
            if (!texto.isEmpty()) {
                JOptionPane.showMessageDialog(this, texto, "Texto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Campo de texto vazio!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == btnLimpar) {
            txtTexto.setText("");
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

}
