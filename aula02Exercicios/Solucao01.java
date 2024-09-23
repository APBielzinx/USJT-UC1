package aula02Exercicios;

import javax.swing.*;

public class Solucao01 {

    /*
1) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
caso o resultado seja maior que 10, apresentá-lo.
*/
    public static void main(String[] args) {
     int numero01 = Integer.parseInt(JOptionPane.showInputDialog("insira um numero inteiro")) ;
     int numero02 = Integer.parseInt(JOptionPane.showInputDialog("insira um numero inteiro")) ;

     int soma = numero01 + numero02;

     if (soma > 10){
         JOptionPane.showMessageDialog(null,"a soma dos dois numero é: "+soma);
     }else {
         JOptionPane.showMessageDialog(null," A soma é menor ou igual a 10");

     }

    }

}
