package aula02Exercicios;

import javax.swing.*;

public class Solucao23 {

    /*
23) Ler três números e armazená-los em três variáveis com os seguintes nomes, de
acordo com seus valores relativos: maior, intermediário e menor (suponha números
diferentes).
*/
    public static void main(String[] args) {
        double numero01 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero02 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;
        double numero03 = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        double maior =  Math.max(numero01, Math.max(numero02, numero03));

        double menor =  Math.min(numero01, Math.min(numero02, numero03));

        double intermediario = 0;
        if (numero01 > menor && numero01 < maior) {
            intermediario  = numero01;
        } else if (numero02 > menor && numero02 < maior) {
            intermediario  = numero02;
        }else {
            intermediario  = numero03;
        }

        String ordem = " a ordem é: "+menor+", "+intermediario+", "+maior;

        JOptionPane.showMessageDialog(null, ordem);

    }

}
