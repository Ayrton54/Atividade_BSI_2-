
package com.mycompany.atividade_ifba;


public class Questão_8 {

   
    public static void main(String args[]) {
        double n1, n2, n3, n4 = 0, n5;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        
        for(int i = 2; i < n1; i++)
        {
            i = i * (i - 1);
            
            n2 = i;
            
            n3 = 1 / n2;
            
            n4 = n4 + n3;
        }
        n5 = n4 + 2;
        System.out.println( "O valor da costante é = " + n5);
    }
}
