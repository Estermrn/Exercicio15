package com.mycompany.exercicio15;

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));

        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null, nome + ": aceita. ");

        } else {
            JOptionPane.showMessageDialog(null,  nome + ": não aceita. ");
            
        }
    }
}
