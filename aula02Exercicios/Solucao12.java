package aula02Exercicios;

import javax.swing.*;

public class Solucao12 {

    /*
12) Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não
é divisível por nenhum destes.
*/
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        if(numero % 10 == 0 || numero % 5 == 0 || numero % 2 == 0) {
         JOptionPane.showMessageDialog(null,numero+" é divisível por 10, por 5 ou por 2");
        }else {
            JOptionPane.showMessageDialog(null,numero+" não é divisível por 10, por 5 ou por 2");

        }




    }

}
