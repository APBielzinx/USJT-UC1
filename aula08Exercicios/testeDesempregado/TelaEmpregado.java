package aula08Exercicios.testeDesempregado;

import aula06Exercicios.exemploTesteEmpresa.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEmpregado extends JFrame implements ActionListener {
    private JTextField txtNome, txtSobrenome, txtCpf, txtSalario, txtComissao, txtVendas, txtValorTarefa, txtTarefas, txtSeguroDesemprego;
    private JComboBox<String> cboTipoEmpregado;
    private JTextArea txtAreaDados;
    private JButton btnCriarEmpregado, btnMostrarDados;

    public TelaEmpregado() {
        super("Cadastro de Empregado");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Nome:"));
        txtNome = new JTextField(20);
        add(txtNome);

        add(new JLabel("Sobrenome:"));
        txtSobrenome = new JTextField(20);
        add(txtSobrenome);

        add(new JLabel("CPF:"));
        txtCpf = new JTextField(14);
        add(txtCpf);

        add(new JLabel("Tipo de Empregado:"));
        cboTipoEmpregado = new JComboBox<>(new String[] {"Mensalista", "Vendedor", "Tarefeiro", "Desempregado"});
        add(cboTipoEmpregado);

        add(new JLabel("Salário Base:"));
        txtSalario = new JTextField(10);
        add(txtSalario);

        add(new JLabel("Comissão por Venda:"));
        txtComissao = new JTextField(10);
        add(txtComissao);

        add(new JLabel("Vendas Realizadas:"));
        txtVendas = new JTextField(5);
        add(txtVendas);

        add(new JLabel("Valor por Tarefa:"));
        txtValorTarefa = new JTextField(10);
        add(txtValorTarefa);

        add(new JLabel("Tarefas Concluídas:"));
        txtTarefas = new JTextField(5);
        add(txtTarefas);

        add(new JLabel("Seguro Desemprego:"));
        txtSeguroDesemprego = new JTextField(10);
        add(txtSeguroDesemprego);

        btnCriarEmpregado = new JButton("Criar Empregado");
        btnCriarEmpregado.addActionListener(this);
        add(btnCriarEmpregado);

        btnMostrarDados = new JButton("Mostrar Dados");
        btnMostrarDados.addActionListener(this);
        add(btnMostrarDados);

        // Text area para mostrar os dados do empregado
        txtAreaDados = new JTextArea(5, 30);
        txtAreaDados.setEditable(false);
        add(new JScrollPane(txtAreaDados));

        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCriarEmpregado) {

            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();
            double salarioBase = Double.parseDouble(txtSalario.getText());

            double comissao = 0.0;
            int vendas = 0;
            double valorTarefa = 0.0;
            int tarefasConcluidas = 0;
            double seguroDesemprego = 0.0;

            Empregado empregado = null;
            Desempregado desempregado = null;
            String tipo = (String) cboTipoEmpregado.getSelectedItem();

            if (tipo.equals("Mensalista")) {
                empregado = new Mensalista(nome, sobrenome, cpf, salarioBase);
            } else if (tipo.equals("Vendedor")) {
                comissao = Double.parseDouble(txtComissao.getText());
                vendas = Integer.parseInt(txtVendas.getText());
                empregado = new Vendedor(nome, sobrenome, cpf, salarioBase, comissao, vendas);
            } else if (tipo.equals("Tarefeiro")) {
                valorTarefa = Double.parseDouble(txtValorTarefa.getText());
                tarefasConcluidas = Integer.parseInt(txtTarefas.getText());
                empregado = new Tarefeiro(nome, sobrenome, cpf, valorTarefa, tarefasConcluidas);
            } else if (tipo.equals("Desempregado")) {
                seguroDesemprego = Double.parseDouble(txtSeguroDesemprego.getText());
                desempregado = new Desempregado(nome, sobrenome, cpf, seguroDesemprego);
            }
            if (empregado != null) {
                txtAreaDados.setText(empregado.dados());
            }
            if (desempregado != null) {
                txtAreaDados.setText(desempregado.dados());
            }
        } else if (e.getSource() == btnMostrarDados) {

            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();

            txtAreaDados.setText("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf);
        }
    }


}
