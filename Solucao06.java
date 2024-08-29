import javax.swing.JOptionPane;

public class Solucao06{

public static void main(String args[]){

/*
6) Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o
tipo caractere para garantir que não seja digitado mais de um número por vez.
Depois concatene estes caracteres armazenando-os em uma String (lembre-se de
que o jeito mais fácil de transformar algo em String é concatenando-o com uma
String vazia “”). Imprima o resultado.
*/

String snumero01 = JOptionPane.showInputDialog("digite um numero representando milhar");

char milhar = snumero01.charAt(0);

String snumero02 = JOptionPane.showInputDialog("digite um numero representando centena");

char centena = snumero02.charAt(0);

String snumero03 = JOptionPane.showInputDialog("digite um numero representando dezena");

char dezena = snumero03.charAt(0);

String snumero04 = JOptionPane.showInputDialog("digite um numero representando unidade");

char unidade = snumero04.charAt(0);


 JOptionPane.showMessageDialog(null,"o numero é: "+milhar+""+centena+""+dezena+""+unidade);


}

}