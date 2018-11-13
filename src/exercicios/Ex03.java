/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lacos1211;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Ex03 {

    public static void main(String[] args) {

        int cont = 0, operacao = 0;
        double valor1 = 0, valor2 = 0, escolha = 0, resultado1, resultado2, resultado3, resultado4;
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Operaçao Matematica " + "\n" + " 1-Soma" + "\n" + " 2-Subtração" + "\n" + " 3-Multiplicação" + "\n" + "4-Divisão" + "\n" + "5-Sair"));

        if (escolha == 1) {
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1°Valor "));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2°Valor "));
            resultado1 = valor1 + valor2;

            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado1);
        } else if (escolha == 2) {
            resultado2 = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "O resultado da Subtraçaõ é: " + resultado2);
        } else if (escolha == 3) {
            resultado3 = valor1 * valor2;
            JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: " + resultado3);
        } else if (escolha == 4) {
            resultado4 = valor1 / valor2;
            JOptionPane.showMessageDialog(null, "O resultado da Divisão é: " + resultado4);
        }

    }
}
