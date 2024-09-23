package aula02Exercicios;

import javax.swing.*;

public class Solucao20 {

    /*
20) Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado
do menor número e a raiz quadrada do maior número, se for possível (suponha
números diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double maiorNumero = Math.max(numero01, numero02);

        double menorNumero = Math.min(numero01, numero02);

        JOptionPane.showMessageDialog(null, "menor número ao quadrado é: "+(Math.pow(menorNumero,2)) + " raiz quadrada do maior numero é: " + (Math.sqrt(maiorNumero)));


    }

}
