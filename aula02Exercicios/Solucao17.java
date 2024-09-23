package aula02Exercicios;

import javax.swing.*;

public class Solucao17 {

    /*
17) Entrar com dois números e imprimir o menor número (suponha números
diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double menorNumero = Math.min(numero01, numero02);

       JOptionPane.showMessageDialog(null, " o menor numero é: "+menorNumero);



    }

}
