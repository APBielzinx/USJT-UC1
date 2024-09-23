package aula02Exercicios;

import javax.swing.*;

public class Solucao05 {

    /*
5) Construir um algoritmo que indique se o número digitado está compreendido
entre 20 e 90 ou não.
*/
    public static void main(String[] args) {
     double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

     if (numero > 20 && numero < 90) {

         JOptionPane.showMessageDialog(null, "O numero "+ numero +" está entre 20 e 90") ;

     }else {
         JOptionPane.showMessageDialog(null, "O numero "+ numero +" Não está entre 20 e 90") ;
     }


    }

}
