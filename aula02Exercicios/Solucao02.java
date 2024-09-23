package aula02Exercicios;

import javax.swing.*;

public class Solucao02 {

    /*
2) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
*/
    public static void main(String[] args) {
     double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
     double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

     double soma = numero01 + numero02;

     if (soma <= 20){
         soma = soma - 5;
         JOptionPane.showMessageDialog(null,"a soma dos dois numero é: "+soma);
     }else {
         JOptionPane.showMessageDialog(null," A soma é maior que 20");

     }

    }

}
