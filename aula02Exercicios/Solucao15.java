package aula02Exercicios;

import javax.swing.*;

public class Solucao15 {

    /*
15) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade
da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.
*/
    public static void main(String[] args) {
        int dataNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));

        int dataAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual "));

        if (dataNasc < 0  || dataAtual < 0 ) {
            JOptionPane.showMessageDialog(null,"Data invalida");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null,"sua idade é: "+(dataAtual-dataNasc));


    }

}
