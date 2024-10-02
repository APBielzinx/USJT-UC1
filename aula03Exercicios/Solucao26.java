package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao26 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        int opcao;
        do {
            String menu = "Operações Disponíveis:\n" +
                    "1. Adição\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n" +
                    "9. Sair do Programa\n" +
                    "Digite o número de ordem da opção desejada:";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2));
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }
}
