package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao9b{

/*
9) Entrar com um número e a base em que se deseja calcular o logaritmo do
número, calcular tal logaritmo e imprimir o resultado;
*/
   public static void main(String args[]){

   String numero =  JOptionPane.showInputDialog("inscira um numero");
   String base =  JOptionPane.showInputDialog("inscira a base");
   
   double log = Double.parseDouble(numero) / Double.parseDouble(base);

   JOptionPane.showMessageDialog(null," o log é "+log);   
   }

}