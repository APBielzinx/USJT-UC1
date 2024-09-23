package aula02Exercicios;

import javax.swing.*;

public class Solucao16 {

    /*
16) Crie um algoritmo que leia dois números e imprimir uma mensagem dizendo se
são iguais ou diferentes.
*/
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero"));
        int numero02 = Integer.parseInt(JOptionPane.showInputDialog("insira outro numero "));

        if (numero == numero02 ) {
            JOptionPane.showMessageDialog(null,"números iguais");

        }else {
            JOptionPane.showMessageDialog(null,"números diferentes");
        }




    }

}
