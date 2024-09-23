package aula02Exercicios;

import javax.swing.*;

public class Solucao10 {

    /*
10) Entrar com um número e informar se ele é ou não divisível por 5.
*/
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        if(numero % 5 == 0){
         JOptionPane.showMessageDialog(null,numero+" é divisível por 5");
        }else {
            JOptionPane.showMessageDialog(null,numero+" não é divisível por 5");

        }




    }

}
