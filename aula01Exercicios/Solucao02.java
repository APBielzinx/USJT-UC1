package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao02{

public static void main(String args[]){

/*
2) Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do
tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor do
número;
*/

int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));

 JOptionPane.showMessageDialog(null," O valor do número digitado é: "+numero);


}

}