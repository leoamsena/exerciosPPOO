/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nModelo: %s%nAno de Fabricação: %s", getMarca(),getModelo(),getAnoFabricacao());
    }
    
    
}
