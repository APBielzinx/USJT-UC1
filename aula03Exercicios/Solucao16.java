package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao16 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        StringBuilder resultado = new StringBuilder("Sequência de Fibonacci: ");
        int a = 0, b = 1;
        while (a <= numero) {
            resultado.append(a).append(" ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
