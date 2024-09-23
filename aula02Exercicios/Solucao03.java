package aula02Exercicios;

import javax.swing.*;

public class Solucao03 {

    /*
3) Entrar com um número e imprimir a raiz quadrada do número caso ele seja
positivo e o quadrado do número caso seja negativo.
*/
    public static void main(String[] args) {
     double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

     double result = 0;

     if (numero01%2 == 0){
      result =   Math.sqrt(numero01);
         JOptionPane.showMessageDialog(null,"o numero é positivo, o resultao é: "+result);
     }else {
         result =  Math.pow(numero01,2);
         JOptionPane.showMessageDialog(null,"o numero é negativo, o resultao é: "+result);

     }

    }

}
