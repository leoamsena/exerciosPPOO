
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    public void exibirVeiculos(){
        for(Veiculo v: veiculos){
            System.out.println(v.toString());
        }
    }
    
    
}
