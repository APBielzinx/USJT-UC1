package aula05Exercicios.exemploTesteArCondicionado;

import javax.swing.JOptionPane;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() {
        // Inicializa o termostato e desliga o condicionador
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        this.ligado = true;
        JOptionPane.showMessageDialog(null, "Condicionador de ar ligado.");
    }

    public void desligar() {
        this.ligado = false;
        JOptionPane.showMessageDialog(null, "Condicionador de ar desligado.");
    }

    public void aumentarTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() < 28) {
                termostato.setTemperatura(termostato.getTemperatura() + 1);
                JOptionPane.showMessageDialog(null, "Temperatura aumentada para: " + termostato.getTemperatura() + " graus.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro: A temperatura não pode exceder 28 graus.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro: O condicionador de ar está desligado.");
        }
    }

    public void reduzirTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() > 15) {
                termostato.setTemperatura(termostato.getTemperatura() - 1);
                JOptionPane.showMessageDialog(null, "Temperatura reduzida para: " + termostato.getTemperatura() + " graus.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro: A temperatura não pode ser inferior a 15 graus.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro: O condicionador de ar está desligado.");
        }
    }

    public void imprimirTemperatura() {
        if (ligado) {
            JOptionPane.showMessageDialog(null, "Temperatura atual: " + termostato.getTemperatura() + " graus.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro: O condicionador de ar está desligado.");
        }
    }
}
