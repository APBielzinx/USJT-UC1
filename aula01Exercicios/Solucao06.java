package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao06{

public static void main(String[] args){

/*
6) Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o
tipo caractere para garantir que não seja digitado mais de um número por vez.
Depois concatene estes caracteres armazenando-os em uma String (lembre-se de
que o jeito mais fácil de transformar algo em String é concatenando-o com uma
String vazia “”). Imprima o resultado.
*/

 String snumero01 = JOptionPane.showInputDialog("Digite um número representando milhar:");
 String snumero02 = JOptionPane.showInputDialog("Digite um número representando centena:");
 String snumero03 = JOptionPane.showInputDialog("Digite um número representando dezena:");
 String snumero04 = JOptionPane.showInputDialog("Digite um número representando unidade:");

 char milhar = snumero01.charAt(0);
 char centena = snumero02.charAt(0);
 char dezena = snumero03.charAt(0);
 char unidade = snumero04.charAt(0);

 String resultado = "" + milhar + centena + dezena + unidade;

 JOptionPane.showMessageDialog(null, "O número é: " + resultado);

}

}
