package aula01Exercicios;

import javax.swing.JOptionPane;

public class Solucao10b{

/*
10) Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três
frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade
da segunda, segunda metade da terceira, segunda metade da segunda, primeira
metade da primeira, primeira metade da terceira, segunda metade da primeira.
Concatene então as três frases originais e imprima o resultado. Na linha de baixo,
escreva a frase embaralhada e compare o resultado;
*/
   public static void main(String[] args){

   String frase01Original =  JOptionPane.showInputDialog("inscira a primeira frase");
   String frase02Original =  JOptionPane.showInputDialog("inscira a segunda frase");
   String frase03Original =  JOptionPane.showInputDialog("inscira a terceira frase");

   if (frase01Original.length()%2 != 0){
       frase01Original = frase01Original + " ";
   }
   if (frase02Original.length()%2 != 0){
           frase02Original = frase02Original + " ";
   }
   if (frase03Original.length()%2 != 0){
           frase03Original = frase03Original + " ";
   }

  String frase01PrimeiraParte = frase01Original.substring(0, frase01Original.length() / 2);
  String frase01 = frase01Original.substring(frase01Original.length() / 2);
   
  String frase02PrimeiraParte = frase02Original.substring(0, frase02Original.length() / 2);
 String frase02 = frase02Original.substring(frase02Original.length() / 2);
  
   String frase03PrimeiraParte = frase03Original.substring(0, frase03Original.length() / 2);
 String frase03 = frase03Original.substring(frase03Original.length() / 2);
   
     
   JOptionPane.showMessageDialog(null,"frases originais: "+frase01Original +", "+frase02Original +", "+frase03Original+", frases embaralhadas: "+frase02PrimeiraParte+ "" +frase03 +", "+frase02+ ""+frase01PrimeiraParte+", "+frase03PrimeiraParte +""+frase01);   
   }

}