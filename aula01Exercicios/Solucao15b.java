package aula01Exercicios;

import javax.swing.*;

public class Solucao15b {

/*
15) Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto;
*/
   public static void main(String[] args){
           int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero para a divisão"));
           int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero para a divisão"));

            int divisao = numero1/numero2;

           JOptionPane.showMessageDialog(null, "o dividendo é: " + numero1 + " o divisor é: " + numero2 + " o quociente é " + divisao + " o resto é: " + (numero1%numero2));
}
}