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
public class Ex2 {
    public static void main(String[] args) {
     int idade = 0, cont = 0;    
     
        
        
        
        while(idade!=100){
            idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "+"\n"+"digite 100 para parar!"));
            if (idade<18){
                cont=cont+1;
           }   
        
          }
          JOptionPane.showMessageDialog(null, "O Numero de pessoas menores de idade é: "+cont);
         
    }
}
    
 

