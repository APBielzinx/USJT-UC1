package aula06Exercicios.exemploTestePagamento;

import javax.swing.JOptionPane;

public class TestePagamento {
    public static void main(String[] args) {
        String[] opcoes = {"Boleto", "Cheque", "Cartão de Crédito"};
        String tipoPagamento = (String) JOptionPane.showInputDialog(null,
                "Escolha o tipo de pagamento:",
                "Teste de Pagamento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        String nomePagador = JOptionPane.showInputDialog("Digite o nome do pagador:");
        double valorPagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));

        switch (tipoPagamento) {
            case "Boleto":
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de vencimento:"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de vencimento:"));
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento:"));
                Boleto boleto = new Boleto(nomePagador, valorPagamento, dia, mes, ano);
                boleto.setNumeroDoBoleto(JOptionPane.showInputDialog("Digite o número do boleto:"));
                JOptionPane.showMessageDialog(null, "Boleto criado: " + boleto.getNumeroDoBoleto());
                break;

            case "Cheque":
                String numeroCheque = JOptionPane.showInputDialog("Digite o número do cheque:");
                Cheque cheque = new Cheque(nomePagador, valorPagamento, numeroCheque);
                JOptionPane.showMessageDialog(null, "Cheque criado: " + cheque.getNumeroDocheque());
                break;

            case "Cartão de Crédito":
                String numeroCartao = JOptionPane.showInputDialog("Digite o número do cartão:");
                CartaoDeCredito cartao = new CartaoDeCredito(nomePagador, valorPagamento, numeroCartao);
                JOptionPane.showMessageDialog(null, "Cartão de Crédito criado: " + cartao.getNumeroDocartao());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
