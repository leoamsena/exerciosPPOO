/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import java.util.Random;
public class Questao{
    private String enunciado;
    private int gabarito;
    private int idQuestao;
    private static int ultimoId = 0;
    public Questao() {
        Random rd = new Random();
        ultimoId++;
        idQuestao = ultimoId;
        int num1 = rd.nextInt(10);
        int num2 = rd.nextInt(10);
        enunciado = "Questão "+idQuestao+":\nQuanto é "+num1+" * "+num2;
        gabarito = num1*num2;
    }

    public String getEnunciado() {
        return enunciado;
    }
    public boolean verificarResosta(int resposta){
        return resposta == gabarito;
    }         

    public int getIdQuestao() {
        return idQuestao;
    }
    
    
}
