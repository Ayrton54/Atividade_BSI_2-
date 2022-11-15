package com.mycompany.atividade_ifba;

import javax.swing.JOptionPane;

public class Questão_6 {

    public static void main(String[] args) {
        // TODO code application logic here

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Para verificar se é primo, Digite um número inteiro"));

        if ((numero == 0) || (numero == 1)) {
            JOptionPane.showMessageDialog(null, "Número não é primo");
        } else {
            int i = 0, fim;

            fim = (int) Math.sqrt(numero);

            if ((numero % 2) == 0) {
                JOptionPane.showMessageDialog(null, "Número não é primo");

            } else {
                JOptionPane.showMessageDialog(null, "Número é primo");

            }

        }

    }

}
