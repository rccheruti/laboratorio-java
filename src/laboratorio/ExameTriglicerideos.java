/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger Cheruti RA 1827106-5
 */
public class ExameTriglicerideos extends Exame {
    private double quantidadeTriglicerideos;

    public ExameTriglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public String classificarResultado() {
        String classificacao;
        
        if (anoNascimento <= 9 && quantidadeTriglicerideos < 75) {
            classificacao = "Baixo risco";
        } else if (anoNascimento <= 19 && quantidadeTriglicerideos < 90) {
            classificacao = "Baixo risco";
        } else if (quantidadeTriglicerideos < 150) {
            classificacao = "Baixo risco";
        } else {
            classificacao = "Alto risco";
        }
        return "Resultado: " + classificacao;
    }
}