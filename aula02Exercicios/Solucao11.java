package aula02Exercicios;

import javax.swing.*;

public class Solucao11 {

    /*
11) Entrar com um número e informar se ele é divisível por 3 e por 7.
*/
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        if(numero % 3 == 0 && numero % 7 == 0){
         JOptionPane.showMessageDialog(null,numero+" é divisível por 3 e por 7.");
        }else {
            JOptionPane.showMessageDialog(null,numero+" não é divisível por 3 e por 7.");

        }




    }

}
