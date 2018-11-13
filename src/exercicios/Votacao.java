/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Votacao {
    public static void main(String[] args) {
        int contA= 0;
        int contB=0;
        int voto = 0, chapaA = 0, chapaB = 0;
           
        while(voto!=3){
            voto= Integer.parseInt(JOptionPane.showInputDialog("Digite 17 para Bolsonaro ou 13 para Hadadd: "));
            if (voto==17){
                contA=contA+1;
             
            
          }
            else if (voto==13){
                contB=contB+1;
          }
          }
         JOptionPane.showMessageDialog(null, "Total de votos da chapa A: "+Double.toString(contA));
         JOptionPane.showMessageDialog(null, "Total de votos da chapa B: "+Double.toString(contB));
         if (contA>contB){
            JOptionPane.showMessageDialog(null, "A Chapa vencedora foi a Chapa Bolsomito :)");
             
         } 
         if (contA<contB){
            JOptionPane.showMessageDialog(null, "A chapa vencedora foi a Chapa Hadadd :)");
         }
          if (contA==contB){
            JOptionPane.showMessageDialog(null, "As Chapas ficaram empatadas :(");
         }
         }
}
