package aula02Exercicios;

import javax.swing.*;

public class Solucao19 {

    /*
19) Entrar com dois números e imprimi-los em ordem decrescente (suponha
números diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double maiorNumero = Math.max(numero01, numero02);
        double menorNumero = Math.min(numero01, numero02);

       JOptionPane.showMessageDialog(null, "a ordem é: "+maiorNumero+", "+menorNumero);



    }

}
