package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao13b{

/*
13) Escrever um algoritmo que leia três números reais (a, b e c), calcule e escreva o
resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5;
*/
   public static void main(String args[]){

     double  a  = Double.parseDouble( JOptionPane.showInputDialog("insira uma numero"));
     double  b  = Double.parseDouble( JOptionPane.showInputDialog("insira uma numero"));
     double  c  = Double.parseDouble( JOptionPane.showInputDialog("insira uma numero"));
     
     double expressao =  2 * ( ( a - c ) / 8 ) - b * 5;
      
  
   JOptionPane.showMessageDialog(null," o resualtado é "+expressao);
}
}