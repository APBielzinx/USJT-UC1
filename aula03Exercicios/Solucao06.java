package aula03Exercicios;

import javax.swing.*;

public class Solucao06 {

    /*
6) Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz
quadrada e seu inverso.
    */
    public static void main(String[] args) {

        int contador = 0;


        while (true){

           double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero, para parar digite -999"));

           if (numero == -999){
               break;
           }

           JOptionPane.showMessageDialog(null, "A raiz quadrada de "+numero+" é: "+(Math.sqrt(numero))+"\n"
           +"o inverso desse número é "+(Math.pow(numero,-1))+" ou 1/"+numero);

           contador++;
        }



    }

}
