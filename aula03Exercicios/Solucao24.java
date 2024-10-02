package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao24 {
    public static void main(String[] args) {
        double total = 0;

        while (true) {
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da mercadoria (ou 0 para finalizar):"));
            if (preco == 0) break;

            while (preco < 0) {
                preco = Double.parseDouble(JOptionPane.showInputDialog("Preço inválido. Digite novamente:"));
            }

            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
            while (quantidade < 0) {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade inválida. Digite novamente:"));
            }

            total += preco * quantidade;
        }
        JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + String.format("%.2f", total));
    }
}
