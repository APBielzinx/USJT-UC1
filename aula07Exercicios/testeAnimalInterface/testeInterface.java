package aula07Exercicios.testeAnimalInterface;

import javax.swing.*;

public class testeInterface {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        JOptionPane.showMessageDialog(null,c);
        c.fazerSom();
        c.mover();
    }

}
