package aula03Exercicios;

import javax.swing.JOptionPane;

public class Solucao25 {
    public static void main(String[] args) {
        int[] votos = new int[4];
        int totalVotantes = 0;

        while (true) {
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato (1-4) ou -1 para encerrar:"));
            if (voto == -1) break;

            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
                totalVotantes++;
            } else {
                JOptionPane.showMessageDialog(null, "Voto inválido!");
            }
        }

        StringBuilder resultado = new StringBuilder("Resultados da eleição:\n");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalVotantes == 0) ? 0 : (votos[i] * 100.0 / totalVotantes);
            resultado.append("Candidato ").append(i + 1).append(": ").append(String.format("%.2f", percentual)).append("% (").append(votos[i]).append(" votos)\n");
        }
        resultado.append("Total de votantes: ").append(totalVotantes);
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
