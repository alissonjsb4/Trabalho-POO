public abstract class Usuario{
  private String login;
  private String senha;
  private int Idade;
  private Sessao[] historico;

  public void comprarTicket(){}
  public void comprarTicket(int quantidade){}
  public void cancelarCompra(){}
  public Sessao verHistorico(String login){}
}
