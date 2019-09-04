
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Prova {
    private Questao questoes[];
    private int tentativas[];
    private static int qtdAceitaveis = 2;
    private Correcao correcao[];

    public Prova() {
        questoes = new Questao[5];
        correcao = new Correcao[5];
        for(int i=0;i<5;i++){
            questoes[i] = new Questao();
        }
        tentativas = new int[5];
        
    }
    public void aplicar(){
        int i=0;
        for(Questao questao: questoes){
            boolean acertou = false;
            while(!acertou && tentativas[i]<qtdAceitaveis){
                if(tentativas[i] != 0)
                    System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                else{      
                    System.out.println("######################");
                    System.out.println(questao.getEnunciado());
                    System.out.print("Digite sua resposta: ");
                }
                Scanner sc = new Scanner(System.in);
                int resposta = sc.nextInt();
                tentativas[i]++;
                if(questao.verificarResosta(resposta)){
                    acertou = true;
                    correcao[i] = new Correcao(questao,"acertou",tentativas[i]);
                    System.out.println("Muito bem, você acertou!");
                    System.out.println("Você tentou "+tentativas[i]+" vez(es) e acertou a questão.");
                }else{
                    System.out.println("Infelizmente você errou!");
                    if(tentativas[i]>=qtdAceitaveis){
                        correcao[i] = new Correcao(questao,"errou",tentativas[i]);
                        System.out.println("Você tentou "+tentativas[i]+" vez(es) e errou a questão.");
                    }
                }
            }
            i++;
        }
    }
    public void gerarRelatorio(){
        System.out.println("Questão \t Situação\tNúmero de tentativas");
        for(Correcao c: correcao){
            System.out.println(c.getIdQuestao()+" \t\t "+c.getSituacao()+" \t\t "+c.getNumeroDeTentativas());
        }
    }
    
}
