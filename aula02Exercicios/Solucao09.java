package aula02Exercicios;

import javax.swing.*;

public class Solucao09 {

    /*
9) Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é.
*/
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("insira um numero")) ;

        if(numero % 3 == 0){
         JOptionPane.showMessageDialog(null,numero+" é multiplo de 3");
        }else {
            JOptionPane.showMessageDialog(null,numero+" não é multiplo de 3");

        }




    }

}
