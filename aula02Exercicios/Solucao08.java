package aula02Exercicios;

import javax.swing.*;

public class Solucao08 {

    /*
8) Entrar com dois números e imprimir o maior número (suponha números
diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;


        double maiorNumero = Math.max(numero01, numero02);

        JOptionPane.showMessageDialog(null, " o maior numero é: "+ maiorNumero);


    }

}
