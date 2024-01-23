/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Roger Cheruti RA 1827106-5
 */
public class Principal {

    public static void main(String[] args) {
        // Pegando a data atual
        Date date = new Date();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
       
        
        // Input dos dados gerais do paciente
        String nomePaciente = JOptionPane.showInputDialog(null, "Digite o nome do paciente:", "Paciente", JOptionPane.INFORMATION_MESSAGE);
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento:", "Paciente", JOptionPane.INFORMATION_MESSAGE));
        String tipoSanguineo = JOptionPane.showInputDialog(null, "Digite o tipo sanguíneo:", "Paciente", JOptionPane.INFORMATION_MESSAGE);

        // Objetos para cada tipo de exame
        ExameGlicemia exameGlicemia = criarExameGlicemia(nomePaciente, tipoSanguineo, anoNascimento);
        ExameColesterol exameColesterol = criarExameColesterol(nomePaciente, tipoSanguineo, anoNascimento);
        ExameTriglicerideos exameTriglicerideos = criarExameTriglicerideos(nomePaciente, tipoSanguineo, anoNascimento);

        // Chama os métodos para classificar os resultados
        exameGlicemia.classificarResultado();
        exameColesterol.classificarResultado();
        exameTriglicerideos.classificarResultado();

        //Gera uma string para exibir todos resultados em um unico dialog
        StringBuilder resultados = new StringBuilder();

        resultados.append("Nome do paciente: ").append(nomePaciente).append("\n");
        resultados.append("Idade: ").append(getLocalDate.getYear() - anoNascimento).append("\n");
        resultados.append("Data nascimento: ").append(anoNascimento).append("\n");
        resultados.append("Tipo sanguíneo: ").append(tipoSanguineo).append("\n\n");

        resultados.append("Exame de Glicemia:\n");
        resultados.append(exameGlicemia.classificarResultado()).append("\n\n");

        resultados.append("Exame de Colesterol:\n");
        resultados.append(exameColesterol.classificarResultado()).append("\n\n");

        resultados.append("Exame de Triglicerídeos:\n");
        resultados.append(exameTriglicerideos.classificarResultado()).append("\n\n");

        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    // Funções para criar os objetos dos exames
    private static ExameGlicemia criarExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        double quantidadeGlicose = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de glicose por mg/l:", "Glicemia", JOptionPane.INFORMATION_MESSAGE));
        return new ExameGlicemia(nomePaciente, tipoSanguineo, anoNascimento, quantidadeGlicose);
    }

    private static ExameColesterol criarExameColesterol(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        double quantidadeLDL = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de LDL por mg/l:", "Colesterol", JOptionPane.INFORMATION_MESSAGE));
        double quantidadeHDL = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de HDL por mg/l:", "Colesterol", JOptionPane.INFORMATION_MESSAGE));
        char riscoPaciente = JOptionPane.showInputDialog(null, "Digite o risco do paciente (B - baixo, M - médio, A - alto):", "Colesterol", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        return new ExameColesterol(nomePaciente, tipoSanguineo, anoNascimento, quantidadeLDL, quantidadeHDL, riscoPaciente);
    }

    private static ExameTriglicerideos criarExameTriglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        double quantidadeTriglicerideos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de triglicerídeos por mg/l:", "Triglicerídeos", JOptionPane.INFORMATION_MESSAGE));
        return new ExameTriglicerideos(nomePaciente, tipoSanguineo, anoNascimento, quantidadeTriglicerideos);
    }

}
