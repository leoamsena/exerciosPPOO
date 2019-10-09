/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Carro extends Veiculo implements Tributavel{
    private String categoria;

    public Carro(String marca, String modelo, int anoFabricacao,String categoria) {
        super(marca, modelo, anoFabricacao);
        this.categoria = categoria;
    }

    
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("%s%nCategoria: %s%nIPVA: %.2f", super.toString(),getCategoria(),calcularIPVA());
    }

    @Override
    public double calcularIPVA() {
        if(getCategoria().equals("passeio")){
            return 1500/(2019 - super.getAnoFabricacao() );
        }else if(getCategoria().equals("utilitario")){
            return 1000 / (2019 - super.getAnoFabricacao());
        }
        return 0;
    }
    
    
}
