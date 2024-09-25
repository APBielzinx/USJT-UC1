package aula03Exercicios;

import javax.swing.*;

public class Solucao03 {

    /*
   3) Entrar com vários números positivos e imprimir a média dos números digitados.
    */
    public static void main(String[] args) {

        double media = 0;
        int contador = 0;

        while (true){

           String numero = JOptionPane.showInputDialog("Insira um valor, para parar digite PARE");

           if (numero.equalsIgnoreCase("PARE")){
               break;
           }
           media = media + Double.parseDouble(numero);
           contador++;
        }

        JOptionPane.showMessageDialog(null, (media/contador));

    }

}
