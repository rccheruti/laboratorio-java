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
public class ExameGlicemia extends Exame {
    private double quantidadeGlicose;

    public ExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public String classificarResultado() {
        String classificacao;
        
        if (quantidadeGlicose < 100) {
            classificacao = "Normoglicemia";
        } else if (quantidadeGlicose < 126) {
            classificacao = "Pré-diabetes";
        } else {
            classificacao = "Diabetes estabelecido";
        }
        return "Resultado: " + classificacao;
    }
}
