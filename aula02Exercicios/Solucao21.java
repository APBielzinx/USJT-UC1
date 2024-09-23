package aula02Exercicios;

import javax.swing.*;

public class Solucao21 {

    /*
21) Ler três números e escrever o maior número (suponha números diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero03 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double maiorNumero = Math.max(numero01, Math.max(numero02, numero03)) ;

        JOptionPane.showMessageDialog(null, "o maior numero é: " + maiorNumero);


    }

}
