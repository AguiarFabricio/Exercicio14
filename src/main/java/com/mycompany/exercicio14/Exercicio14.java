/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio14;

/**
 *
 * @author Fabricio de Aguiar
 */
/**Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
se o ano de nascimento é válido, ou seja, se o ano de nascimento é
menor que o ano atual, então mostre a idade desta pessoa.*/

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));

        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

        if (anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano de nascimento não pode ser maior e nem igual o ano atual!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
