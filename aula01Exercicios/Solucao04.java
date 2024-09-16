package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao04{

public static void main(String args[]){

/*
4) Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso
informado foi “ + peso + “ kg.”;
*/

double peso = Double.parseDouble(JOptionPane.showInputDialog("digite seu peso"));

 JOptionPane.showMessageDialog(null,"O peso informado foi "+peso+" kg");


}

}