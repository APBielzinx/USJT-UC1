package aula03Exercicios;

import javax.swing.*;

public class Solucao17 {
    public static void main(String[] args) {
        StringBuilder tabela = new StringBuilder("Tabela de conversão de polegadas para centímetros:\n");
        tabela.append("1 polegada = 2,54 cm\n");
        
        for (int i = 1; i <= 20; i++) {
            double centimetros = i * 2.54;
            tabela.append(i).append(" polegadas = ").append(String.format("%.2f", centimetros)).append(" cm\n");
        }
        
        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}
