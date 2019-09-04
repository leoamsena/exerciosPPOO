/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Correcao {
    private Questao questao;
    private String situacao;
    private int numeroDeTentativas;

    public Correcao(Questao questao, String situacao, int numeroDeTentativas) {
        this.questao = questao;
        this.situacao = situacao;
        this.numeroDeTentativas = numeroDeTentativas;
    }
    
    public int getIdQuestao(){
        return questao.getIdQuestao();
    }

    public String getSituacao() {
        return situacao;
    }

    public int getNumeroDeTentativas() {
        return numeroDeTentativas;
    }
}
