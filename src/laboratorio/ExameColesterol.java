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
public class ExameColesterol extends Exame {

    private double quantidadeLDL;
    private double quantidadeHDL;
    private char riscoPaciente;

    public ExameColesterol(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeLDL, double quantidadeHDL, char riscoPaciente) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.riscoPaciente = riscoPaciente;
    }

    @Override
    public String classificarResultado() {
        String classificacaoHDL = "HDL - BOM";

        if (anoNascimento > 19 && quantidadeHDL <= 45) {
            classificacaoHDL = "HDL - RUIM";
        } else if (anoNascimento <= 19 && quantidadeHDL <= 40) {
            classificacaoHDL = "HDL - RUIM";
        }

        String classificacaoLDL;
        if (riscoPaciente == 'B') {
            classificacaoLDL = "LDL - BOM";
        } else if (riscoPaciente == 'M') {
            if (quantidadeLDL < 70) {
                classificacaoLDL = "LDL - BOM";
            } else {
                classificacaoLDL = "LDL - RUIM";
            }
        } else {
            if (quantidadeLDL < 50) {
                classificacaoLDL = "LDL - BOM";
            } else {
                classificacaoLDL = "LDL - RUIM";
            }
        }
        return "Resultado: " + classificacaoHDL + " | " + classificacaoLDL;
    }
}
