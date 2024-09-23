package aula02Exercicios;

import javax.swing.*;

public class Solucao06 {

    /*
6) Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a
20 ou menor do que 20.
*/
    public static void main(String[] args) {
     double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

     if (numero > 20) {

         JOptionPane.showMessageDialog(null, "maior do que 20") ;

     } else if (numero == 20) {
         JOptionPane.showMessageDialog(null, "igual a 20") ;

     } else {
         JOptionPane.showMessageDialog(null, "menor do que 20") ;
     }


    }

}
