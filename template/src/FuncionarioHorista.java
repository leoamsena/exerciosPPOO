/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class FuncionarioHorista extends Funcionario{
    private double salarioHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double salarioHora, double horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    

    public double getSalarioHora() {
        return salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * getSalarioHora();
    }
    
}
