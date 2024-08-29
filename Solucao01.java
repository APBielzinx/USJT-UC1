import javax.swing.JOptionPane;

public class Solucao01{

public static void main(String args[]){

/*
1) Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela
na ordem contrária em que foram digitadas, separadas por espaço;
*/

String palavra01 = JOptionPane.showInputDialog("digite uma palavra");

String palavra02 = JOptionPane.showInputDialog("digite outra palavra");

String palavra03 = JOptionPane.showInputDialog("digite outra palavra");

 JOptionPane.showMessageDialog(null," a ordem contária é: "+palavra03+" "+palavra02+" "+palavra01);


}

}