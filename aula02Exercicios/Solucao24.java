package aula02Exercicios;

import javax.swing.*;

public class Solucao24 {

    /*
24) Ler cinco números e identificar o maior e o menor de todos (NÃO suponha
números diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero03 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero04 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero05 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;


        double maior =  Math.max(numero01, Math.max(numero02, Math.max(numero03,Math.max(numero04,numero05))));

        double menor =  Math.min(numero01, Math.min(numero02, Math.min(numero03,Math.min(numero04,numero05))));


        JOptionPane.showMessageDialog(null, "Numero maior é: " + maior +" numero menor é "+menor);


    }



}
