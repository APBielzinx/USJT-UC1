package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao21 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").charAt(0);
            
            if (sexo == 'M' && idade > 21) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome);
            }
        }
    }
}
