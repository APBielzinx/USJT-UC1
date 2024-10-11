package exemploTesteAtribuicao;

import javax.swing.JOptionPane;

public class TesteAtribuicao {

    public static void main(String[] args) {

        String nomeProf = JOptionPane.showInputDialog("digite o nome do professor");

        int idadeProf = Integer.parseInt(JOptionPane.showInputDialog("digite a idade do professor")) ;

        Professor professor = new Professor(nomeProf, idadeProf);

        String nomeDisciplina = JOptionPane.showInputDialog("digite o nome da disciplina");

        int resposta = JOptionPane.showConfirmDialog(null, "A disciplina é pratica?", "Pratica", JOptionPane.YES_NO_OPTION);
        
        boolean pratica;

        if (resposta == 0) {
            pratica = true;
        }else{
            pratica = false;
        }

        Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);
        
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());


        
}
}
