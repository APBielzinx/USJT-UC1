package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao23 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números pares a imprimir:"));
        
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= quantidade; i++) {
            resultado.append(i * 2).append(" ");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
