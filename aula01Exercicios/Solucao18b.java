package aula01Exercicios;

import javax.swing.*;

public class Solucao18b {

    /*
        18) Criar um algoritmo que calcule e imprime a área de um losango.
    */
    public static void main(String[] args) {

        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("digite a diagonal maior do losangulo"));
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("digite a diagonal menor do losangulo"));

        double area = diagonalMaior * diagonalMenor / 2 ;

        JOptionPane.showMessageDialog(null, " a area do losangulo é: " + area);
    }
}