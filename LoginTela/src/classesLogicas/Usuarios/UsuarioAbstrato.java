package classesLogicas.Usuarios;

import java.util.Vector;
import java.io.Serializable;
import classesLogicas.Recursos.Sessao;
import classesLogicas.Recursos.Ticket;
import classesLogicas.Sistema.repo.TicketVector;
import classesLogicas.Sistema.Excecoes.UsuarioExcecoes.SIException;
import classesLogicas.Sistema.Excecoes.UsuarioExcecoes.IIException;
/**
 *
 * @author Rocha
 */
public abstract class UsuarioAbstrato implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private String login;
  private String nome;
  private String senha;
  private int idade;
  private boolean premium;
  private transient TicketVector tickets;
  private transient String tipoTicket;
  protected double credito;
  protected Vector<Sessao> historico;
  
  public UsuarioAbstrato(String login, String nome, String senha, int idade, boolean premium) {
    this.login = login;
    this.nome = nome;
    this.senha = senha;
    this.idade = idade;
    this.credito = 0.0;
    this.historico = new Vector<Sessao>();
    this.historico.clear();
    this.premium = premium;
    this.tipoTicket = "nulo";
    
    this.tickets = new TicketVector();
    Ticket[] ticketsA = tickets.listar();
    for(Ticket ticket : ticketsA){
        if(ticket.getComprador().getLogin().equals(this.login))
            this.historico.add(ticket.getSessao());
    }
  }

  public String comprarTicket(Sessao sessao){
    try{
      if(sessao.getFilme().getClassificacao() <= this.idade){
        if(this.credito >= sessao.getPreco()){
            this.credito -= sessao.getPreco();
            TicketVector tickets = new TicketVector();
            if(tipoTicket.equals("nulo"))
                tipoTicket = "Normal";
            Ticket ticket = new Ticket(sessao, this, tipoTicket);
            tickets.adicionarTicket(ticket);
            return "Sucesso";
        }else
          throw new SIException(this.credito, sessao.getPreco());
      }else
        throw new IIException(this.idade, sessao.getFilme().getClassificacao());
    }catch(IIException | SIException exc){
      return exc.getMessage();
    }
  }
  //polimorfismo sobrecarga
  public String comprarTicket(Sessao sessao, String tipo){
    String retorno = "";
    try {
        switch (tipo) {
            case "CPequeno":
                sessao.setPreco(sessao.getPreco() + 5);
                tipoTicket = tipo;
                retorno = this.comprarTicket(sessao);
                sessao.setPreco(sessao.getPreco() - 5);
                break;
            case "CMedio":
                sessao.setPreco(sessao.getPreco() + 9);
                tipoTicket = tipo;
                retorno = this.comprarTicket(sessao);
                sessao.setPreco(sessao.getPreco() - 9);
                break;
            case "CGrande":
                sessao.setPreco(sessao.getPreco() + 16);
                tipoTicket = tipo;
                retorno = this.comprarTicket(sessao);
                sessao.setPreco(sessao.getPreco() - 16);
                break;
        }
      } catch (NullPointerException e) {
          // Tratar a exceção caso Sessao.getFilme() retorne null
          return "Sessão sem filme cadastrado!";
      }
    return retorno;
  }
  
  public Vector<Sessao> verHistorico(String login){
    if(this.historico.size() == 0)
      return null;
    return this.historico;
  }

  public String getLogin() {
    return login;
}
  public String getNome() {
    return nome;
}
  public String getSenha() {
    return senha;
}
  public int getIdade() {
    return idade;
}
  public double getCredito(){
    return credito;
  }
  public void setLogin(String login) {
    this.login = login;
}
  public void setNome(String nome) {
    this.nome = nome;
}
  public void setSenha(String senha) {
    this.senha = senha;
}
  public void setIdade(int idade) {
    this.idade = idade;
}
  public void setCredito(double credito){
    this.credito = credito;
  }
  public boolean getPremium(){
      return premium;
  }
  public void setTipoTicket(String tipo){
      this.tipoTicket = tipo;
  }
}