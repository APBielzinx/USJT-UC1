import javax.swing.JOptionPane;

public class Solucao04{

public static void main(String args[]){

/*
4) Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso
informado foi “ + peso + “ kg.”;
*/

String speso = JOptionPane.showInputDialog("digite seu peso");

double peso = Double.parseDouble(speso);

 JOptionPane.showMessageDialog(null,"O peso informado foi "+peso+" kg");


}

}