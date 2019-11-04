import java.util.ArrayList;
public class Agencia{
  private String numero;
  private String nome;
  private ArrayList<Conta> contas;
  
  public Agencia(String numero, String nome){
    contas = new ArrayList<>();
    this.numero = numero;
    this.nome = nome;
  }
  
  public void criarConta(){
    contas.add(new Conta(contas.size()+1));
  }
  
  public String getRelatorio(){
    String res = "Lista de Contas Bancarias:";
    
    if(contas.size() > 0){
      for(Conta c: contas){
        res += "\n\nNumero: " + c.getNumero() + "\nSaldo: " + c.getSaldo();
      }
    }else{
      res += "\nNao ha contas cadastradas nesta agencia!";
    }
    
    return res;
  }
  
  public void depositar(int numeroConta, double valor) throws RuntimeException{
    Conta contaDestino = getConta(numeroConta);
    if(contaDestino != null){
      contaDestino.depositar(valor);
    }
    else{
		throw new RuntimeException("Conta destino não existe!");
    }
  }

  public void sacar(int numeroConta, double valor) throws RuntimeException{
    Conta contaDestino = getConta(numeroConta);
    if(contaDestino != null){
      contaDestino.sacar(valor);
    }
    else{
      throw new RuntimeException("Conta que deseja sacar não existe!");
    }
  }
  
  public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) throws RuntimeException{
    Conta contaOrigem = getConta(numeroContaOrigem);
    Conta contaDestino = getConta(numeroContaDestino);
    
    if(contaOrigem != null){
        if(contaDestino!=null)
            contaOrigem.transferir(contaDestino, valor);
        else
            throw new RuntimeException("Conta destino não existe!");
    }
    else{
        throw new RuntimeException("Conta origem não existe!");
    } 
  }
  

  public Conta getConta(int numeroConta){
    for(Conta c: contas){
      if(c.getNumero() == numeroConta){
	return c;
      }
    }
    return null;
  }

    


}
