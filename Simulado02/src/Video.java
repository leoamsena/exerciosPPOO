/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Video {
    private String titulo;
    private int anoLancamento;
    private double preco;

    public Video(String titulo, int anoLancamento, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPreco() {
        return preco;
    }
    
}
