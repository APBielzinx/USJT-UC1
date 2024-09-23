package aula02Exercicios;

import javax.swing.*;

public class Solucao04 {

    /*
4) Ler três números e escrevê-los em ordem crescente (suponha números
diferentes).
*/
    public static void main(String[] args) {
     double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
     double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
     double numero03 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

    double maiorNumero =  Math.max(numero01, Math.max(numero02, numero03));

    double menorNumero =  Math.min(numero01, Math.min(numero02, numero03));

    double numeroDoMeio = 0;
    if (numero01 > menorNumero && numero01 < maiorNumero) {
        numeroDoMeio  = numero01;
    } else if (numero02 > menorNumero && numero02 < maiorNumero) {
        numeroDoMeio  = numero02;
    }else {
        numeroDoMeio  = numero03;
    }

    String ordem = " a ordem é: "+menorNumero+", "+numeroDoMeio+", "+maiorNumero;

    JOptionPane.showMessageDialog(null, ordem);

    }

}
