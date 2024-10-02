package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao22 {
    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        
        StringBuilder resultado = new StringBuilder("Números ímpares menores que " + limite + ": ");
        for (int i = 1; i < limite; i += 2) {
            resultado.append(i).append(" ");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
