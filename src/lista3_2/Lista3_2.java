package lista3_2;

import javax.swing.JOptionPane;

public class Lista3_2 {
    public static void main(String[] args) {
        int escolha;
        int metragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a metragem: "));
        escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a op��o desejada: \n1. Tijolo de 6 furos\n2. Tijolo de 4 furos\n3. Tijolo Maci�o"));
        switch(escolha){
            case 1:
                metragem *= 15;
                JOptionPane.showMessageDialog(null, "Ser�o necess�rios "+ metragem + " tijolos de 6 furos");
                break;
            case 2:
                metragem *=25;
                JOptionPane.showMessageDialog(null, "Ser�o necess�rios "+ metragem + " tijolos de 4 furos");
                break;
            case 3:
                metragem *= 30;
                JOptionPane.showMessageDialog(null, "Ser�o necess�rios "+ metragem + " tijolos maci�os");
                break;
            default:
                JOptionPane.showMessageDialog(null, "C�digo inv�lido");
        }
    }   
}
