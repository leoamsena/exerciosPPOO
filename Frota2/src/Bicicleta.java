/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Bicicleta extends Veiculo{
    private int marchas;

    public Bicicleta(String marca, String modelo, int anoFabricacao,int marchas) {
        super(marca, modelo, anoFabricacao);
        this.marchas = marchas;
    }
    

    public int getMarchas() {
        return marchas;
    }

    @Override
    public String toString() {
        return String.format("%s%nMarchas: %d", super.toString(),getMarchas());
    }
    
}
