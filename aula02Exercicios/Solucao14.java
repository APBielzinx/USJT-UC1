package aula02Exercicios;

import javax.swing.*;

public class Solucao14 {

    /*
14) Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o
número formado pelos algarismos que estão nas casas das unidades de milhar e das
centenas.
*/
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 4 dígitos:");

       int numero =  Integer.parseInt(input.substring(0,2));

       if (numero % 4 == 0){
           JOptionPane.showMessageDialog(null, numero+" é multipo de 4");
       }else {
           JOptionPane.showMessageDialog(null, numero+" não é multipo de 4");

       }



    }

}
