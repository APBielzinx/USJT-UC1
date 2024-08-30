import javax.swing.JOptionPane;

public class Solucao03b{

/*
3) Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde base e expoente são números
reais;
*/
 public static void main(String args[]){
   
     String snumero = JOptionPane.showInputDialog("digite um número");
     
     double numeroElevado = Math.pow(Double.parseDouble(snumero),2.5);
          
     JOptionPane.showMessageDialog(null,"o numero elevadoao quadrado é "+numeroElevado);

   
   }

}