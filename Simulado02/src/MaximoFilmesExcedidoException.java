public class MaximoFilmesExcedidoException extends RuntimeException {
 private int nroFilmes;
 private Cliente cliente;
 public MaximoFilmesExcedidoException(Cliente cliente, int nroFilmes) {
  super("Cliente " + cliente.getNome() + " não pode levar " + nroFilmes + " filmes.");
  this.cliente = cliente;
  this.nroFilmes = nroFilmes;
 }
 public Cliente getCliente() {
  return cliente;
 }
 public int getNroFilmes() {
  return nroFilmes;
 }
}