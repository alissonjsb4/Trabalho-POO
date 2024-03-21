package classesLogicas.Sistema.Excecoes.UsuarioExcecoes;
/**
 *
 * @author Rocha
 */
// Saldo Insuficiente
public class SIException extends Exception{
  private double saldo;
  private double preco;


  public SIException(double saldo, double preco){
    super ("Saldo Insuficiente!" + "\nPreço da Sessão: " + preco + "\nSaldo Atual: " + saldo);
    this.saldo = saldo;
    this.preco = preco;
  }

  public double getSaldo(){
    return saldo;}
  public double getPreco(){
    return preco;}
}
