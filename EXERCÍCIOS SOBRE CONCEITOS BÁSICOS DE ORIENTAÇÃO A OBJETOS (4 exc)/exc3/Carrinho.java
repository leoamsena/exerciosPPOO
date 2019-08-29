public class Carrinho {
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;

    public Carrinho(String cliente, int dia, int mes, int ano) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }
    
    public Carrinho(String cliente, int dia, int mes, int ano,int qtd) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[qtd];
        contadorItens = 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void inserirItem(String produto) {
        carrinho[contadorItens] = produto;
        contadorItens++;
    }

    public void exibir() {
        System.out.println("Cliente: " + this.cliente);
        System.out.printf("Data da compra: %d/%d/%d\n", this.dia, this.mes, this.ano);
        System.out.print("Itens do carrinho:");
        for (String item : this.carrinho) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }
}