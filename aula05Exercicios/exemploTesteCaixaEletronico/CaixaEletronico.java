package aula05Exercicios.exemploTesteCaixaEletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {
        String nomeAgencia = JOptionPane.showInputDialog("Digite o nome da agência:");
        int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência (máximo 4 dígitos):"));
        Agencia agencia = new Agencia(nomeAgencia, numeroAgencia); // O dígito é calculado automaticamente

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta corrente (máximo 4 dígitos):"));
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta corrente:"));
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, agencia, saldoInicial);

        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        Cliente cliente = new Cliente(nomeCliente, cpfCliente, contaCorrente);

        // Operações
        double valorSaque1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para o primeiro saque:"));
        contaCorrente.sacar(valorSaque1);

        JOptionPane.showMessageDialog(null, "Saldo após primeiro saque: R$ " + contaCorrente.consultarSaldo());

        double valorSaque2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para o segundo saque:"));
        contaCorrente.sacar(valorSaque2);

        JOptionPane.showMessageDialog(null, "Saldo após segundo saque: R$ " + contaCorrente.consultarSaldo());

        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito:"));
        contaCorrente.depositar(valorDeposito);

        contaCorrente.imprimirSaldo();
    }
}
