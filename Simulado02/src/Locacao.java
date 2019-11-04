
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Locacao {
    private Date dataLocacao;
    private Date dataExpiracao;
    private ArrayList<Video> videos;
    private Cliente cliente;

    public Locacao(Date dataLocacao, Date dataExpiracao, Cliente cliente) {
        this.dataLocacao = dataLocacao;
        this.dataExpiracao = dataExpiracao;
        this.cliente = cliente;
        this.videos = new ArrayList<>();
    }
    public void adicionarVideo(Video v){
        if(videos.size() >= 5 ){
            throw new MaximoFilmesExcedidoException(cliente, videos.size()+1);
        }else{
            videos.add(v);
        }
    }


    @Override
    public String toString() {
        String str = "";
        double preco = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        for(Video v: videos){
            str += String.format("\t%s (%d) (R$ %.2f)%n",v. getTitulo(),v.getAnoLancamento(),v.getPreco());
            preco += v.getPreco();
        }
        return String.format("Cliente: %s (%s)%nLocação: %s à %s%nVídeos:%n%sValor da locação: R$ %.2f", cliente.getNome(),formatter.format(cliente.getNascimento()),formatter.format(dataLocacao),formatter.format(dataExpiracao),str,preco);
        
    }
    
    
}
