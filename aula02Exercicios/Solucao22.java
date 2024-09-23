package aula02Exercicios;

import javax.swing.*;

public class Solucao22 {

    /*
22) Ler três números e armazenar o maior número na variável de nome maior
(suponha números diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero03 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double maior = Math.max(numero01, Math.max(numero02, numero03)) ;
        
        JOptionPane.showMessageDialog(null, "o maior numero é: " + maior);


    }

}
