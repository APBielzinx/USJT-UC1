import javax.swing.JOptionPane;

public class Solucao6b{

/*
6) Entrar com um número inteiro de 3 casas decimais e imprimir o algarismo da casa
das dezenas;
*/
   public static void main(String args[]){

   String numeroDecimal =  JOptionPane.showInputDialog("inscira inteiro de 3 casas decimais");
     
   String numeroCortado = numeroDecimal.substring(numeroDecimal.length() - 3 ); 
   
   JOptionPane.showMessageDialog(null," o numero cortado é "+numeroCortado);
   
   }

}