package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao02b{

/*
2) Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de
sua base e de sua altura;
*/
   
   public static void main(String args[]){
   
     String anosVividos = JOptionPane.showInputDialog("quantos anos você tem?");
     
     int diasVividos = Integer.parseInt(anosVividos);
     
     diasVividos = diasVividos*365;
     
     JOptionPane.showMessageDialog(null,"Você viveu aproximadamente"+diasVividos);

   
   }

}