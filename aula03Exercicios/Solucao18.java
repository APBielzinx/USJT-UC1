package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao18 {
    public static void main(String[] args) {
        int limiteInferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior:"));
        int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));
        
        StringBuilder tabela = new StringBuilder("Tabela de conversão de Celsius para Fahrenheit:\n");
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9/5) + 32;
            tabela.append(celsius).append(" °C = ").append(String.format("%.2f", fahrenheit)).append(" °F\n");
        }
        
        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}
