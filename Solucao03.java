import javax.swing.JOptionPane;

public class Solucao03{

public static void main(String args[]){

/*
3) Crie um algoritmo que leia 3 números que representem uma data,
respectivamente dia, mês e ano. Depois imprima a data usando o formato
dia/mês/ano;
número
*/


String dia = JOptionPane.showInputDialog("digite um dia");

String mes = JOptionPane.showInputDialog("digite um mes");

String ano = JOptionPane.showInputDialog("digite um ano");

 JOptionPane.showMessageDialog(null,"a data digitada é: "+dia+"/"+mes+"/"+ano);


}

}