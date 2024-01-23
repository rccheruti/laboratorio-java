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
public class Exame {

    protected String nomePaciente;
    protected String tipoSanguineo;
    protected int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    // Será sobrescrito nas subclasses
    public String classificarResultado() {
        return "";
    }

    public void mostrarResultado() {
        String resultado = "Nome do Paciente: " + nomePaciente
                + "\nTipo Sanguíneo: " + tipoSanguineo
                + "\nAno de Nascimento: " + anoNascimento;

        JOptionPane.showMessageDialog(null, resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
}
