import javax.swing.JOptionPane;

public class Solucao8b{

/*
8) Entrar com um número e imprimir o logaritmo desse número na base 10;
*/
 public static void main(String args[]){

   String numero =  JOptionPane.showInputDialog("inscira um numero");
     
   double numeroBase10 = Math.log(Double.parseDouble(numero));
   
   JOptionPane.showMessageDialog(null,"numero "+numero+" na base 10 é "+numeroBase10);   
   }

}