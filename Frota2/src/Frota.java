import java.util.*;
public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }
    
    public void gerarRelatorio() {
     for (Veiculo v: veiculos) {
      System.out.println(v);
      System.out.println("-----------------");
     }
    }
    public void inserirVeiculo(Veiculo v){
        veiculos.add(v);
    }
}