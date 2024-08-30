import javax.swing.JOptionPane;

public class Solucao04b{

/*
4) Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma
do comprimento destas Strings;
*/
   
   public static void main(String args[]){
   
     String palavra01 = JOptionPane.showInputDialog("escreva uma palavra");
     
     String palavra02 = JOptionPane.showInputDialog("escreva outra palavra");
          
     String palavra03 = JOptionPane.showInputDialog("escreva outra palavra");
      
      int somaPalavras = palavra01.length() + palavra02.length() +palavra03.length();
     
     JOptionPane.showMessageDialog(null,"a soma das palavras é "+somaPalavras);

   
   }

}