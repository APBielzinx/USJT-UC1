import javax.swing.JOptionPane;

public class Solucao5b{

/*
5) Crie um algoritmo que calcule o valor de uma dívida, submetida a juros
compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros
(em %) e N representa o número de meses. Responda: se você deve para o cartão de
crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?
*/
   public static void main(String args[]){
   
   double porcentagem = (10*100)/100;
   
   System.out.println(porcentagem);
   
   double valorFinal = Math.pow( 100.00 * (1 + porcentagem),8);
     
   
   JOptionPane.showMessageDialog(null,"depois de 8 meses você deverá pagar "+valorFinal);
   
   }

}