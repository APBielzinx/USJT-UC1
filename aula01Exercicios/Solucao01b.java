package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao01b{

/*
1) Crie um algoritmo para calcular o número de dias aproximado que você viveu,
com base em sua idade;
*/
   
   public static void main(String args[]){
   
   String speso = JOptionPane.showInputDialog("Digite seu peso em quilogramas");
   String saltura = JOptionPane.showInputDialog("Digite sua altura em metros");
   
   double peso =Double.parseDouble(speso); 
   
   double altura = Double.parseDouble(saltura); 
   
   double imc = peso / (altura*altura);
   
   JOptionPane.showMessageDialog(null,"imc ="+imc);
      
   }
   
}