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
public class Ex1 {

    public static void main(String[] args) {
        
        int tabuada1;
        int tabuada2;
        int tabuada3;
        int tabuada4;
        int tabuada5;
        int tabuada6;
        int tabuada7;
        int tabuada8;
        int tabuada9;
        int tabuada10;
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero Para saber sua tabuada"));
        tabuada1 = numero * 1;
        tabuada2 = numero * 2;
        tabuada3 = numero * 3;
        tabuada4 = numero * 4;
        tabuada5 = numero * 5;
        tabuada6 = numero * 6;
        tabuada7 = numero * 7;
        tabuada8 = numero * 8;
        tabuada9 = numero * 9;
        tabuada10 = numero * 10;

        JOptionPane.showMessageDialog(null, "A tabuada do " + numero + " é:"
                + "\n" + numero + "X1=" + tabuada1
                + "\n" + numero + "X2=" + tabuada2
                + "\n" + numero + "X3=" + tabuada3
                + "\n" + numero + "X4=" + tabuada4
                + "\n" + numero + "X5=" + tabuada5
                + "\n" + numero + "X6=" + tabuada6
                + "\n" + numero + "X7=" + tabuada7
                + "\n" + numero + "X8=" + tabuada8
                + "\n" + numero + "X9=" + tabuada9
                + "\n" + numero + "X10=" + tabuada10);

    }
}
