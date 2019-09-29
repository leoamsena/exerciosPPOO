/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Carro extends Veiculo{
    private int capacidadePortaMalas;
    private int numeroPortas;

    public Carro(String marca, int ano, String cor,int capacidadePortaMalas, int numeroPortas) {
        super(marca, ano, cor);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.numeroPortas = numeroPortas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nAno: %d%nCor: %s%nCapacidadade do porta malas: %d%nNúmero de portas: %d%n",getMarca(),getAno(),getCor(),getCapacidadePortaMalas(),getNumeroPortas());
    }
    
}
