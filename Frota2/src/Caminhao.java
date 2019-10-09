/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Caminhao extends Veiculo implements Tributavel{
    private int numEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao,int numEixos) {
        super(marca, modelo, anoFabricacao);
        this.numEixos = numEixos;
    }
    
    

    public int getNumEixos() {
        return numEixos;
    }

    @Override
    public String toString() {
        return String.format("%s%nNúmero de Eixos: %d%nIPVA: %.2f", super.toString(),getNumEixos(),calcularIPVA());
    }

    @Override
    public double calcularIPVA() {
        return 200*getNumEixos() / (2019 - super.getAnoFabricacao());
    }
    
}
