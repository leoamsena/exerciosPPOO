
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Elon Musk", new GregorianCalendar(1971, Calendar.JUNE, 28).getTime());
        Locacao locacao = new Locacao(new GregorianCalendar(2017, Calendar.SEPTEMBER, 11).getTime(),new GregorianCalendar(2017, Calendar.SEPTEMBER, 13).getTime(),cliente);
        Video video = new Video("Piratas do Vale do Silício",2010,3.9);
        locacao.adicionarVideo(video);
        video = new Video("The Big Bang Theory - Primeira Temporada",2008,9.0);
        locacao.adicionarVideo(video);
        
        System.out.println(locacao);
    }
    

    
}
