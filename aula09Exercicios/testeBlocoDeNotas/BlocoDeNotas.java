package aula09Exercicios.testeBlocoDeNotas;

import javax.swing.*;
import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<String> notas = new ArrayList<>();

    public BlocoDeNotas() {
    }

    public ArrayList<String> buscarNota(String notaBuscada) {
        ArrayList<String> notasEncontradas = new ArrayList<>();

        for (String nota : notas) {
            if (nota.equals(notaBuscada)) {
                notasEncontradas.add(nota);
            }
        }

        return notasEncontradas;
    }

    public ArrayList<String> inserirNota(String nota) {
        notas.add(nota);
        JOptionPane.showMessageDialog(null, "Nota inserida com sucesso!");
        return notas;
    }

    public ArrayList<String> atualizarNota(String notaAntiga, String notaNova) {
        if (notas.contains(notaAntiga)) {
            notas.set(notas.indexOf(notaAntiga), notaNova);
            JOptionPane.showMessageDialog(null, "Nota atualizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nota não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return notas;
    }


    public void removerNota(String notaBuscada) {
        ArrayList<String> busca = buscarNota(notaBuscada);
        if (busca.contains(notaBuscada)) {
            notas.remove(notaBuscada);
            JOptionPane.showMessageDialog(null, "Nota removida com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nota não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }

    public void imprimirNotas() {
        if (notas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma nota cadastrada.");
        } else {
            JOptionPane.showMessageDialog(null, "Notas cadastradas:\n" + String.join("\n", notas));
        }    }


    }

