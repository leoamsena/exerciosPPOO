/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public abstract class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return String.format("Nome: %s%nCPF: %s%nSalário: %.2f%n", getNome(),getCpf(),calcularSalario());
    }
    
    @Override
    public int compareTo(Funcionario f){
        if(calcularSalario() > f.calcularSalario())
            return 1;
        else if(calcularSalario() < f.calcularSalario())
            return -1;
        return 0;
    }
    
    
    
    
}
