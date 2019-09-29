/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Caminhao extends Veiculo{
    private int numeroEixos;
    private int capacidadeCarga;

    public Caminhao( String marca, int ano, String cor,int numeroEixos, int capacidadeCarga) {
        super(marca, ano, cor);
        this.numeroEixos = numeroEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nAno: %d%nCor: %s%nNúmero de Eixos: %d%nCapacidade de carga: %s%n",getMarca(),getAno(),getCor(),getNumeroEixos(),getCapacidadeCarga());
    }
    
    
}
