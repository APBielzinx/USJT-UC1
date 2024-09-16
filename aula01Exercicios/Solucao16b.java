package aula01Exercicios;

import javax.swing.*;

public class Solucao16b {

/*
16) Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada;
*/
   public static void main(String[] args){

       double numero = Double.parseDouble(JOptionPane.showInputDialog("digite um numero para o calculo"));

           double raizQuadrada = Math.sqrt(numero);
           double elevadoQuadrado = Math.pow(numero, 2);

           JOptionPane.showMessageDialog(null, "a raiz quadrada é: " + raizQuadrada + " o numero elevado ao quadrado é: " + elevadoQuadrado);
}
}