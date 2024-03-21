package classesLogicas.Recursos;
import java.io.Serializable;

import classesLogicas.Usuarios.UsuarioAbstrato;
/**
 *
 * @author Rocha
 */
public class Ticket implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private Sessao sessao; 
  private UsuarioAbstrato comprador;
  private String tipo;
  
  public Ticket(Sessao sessao, UsuarioAbstrato comprador, String tipo){
    this.comprador = comprador;
    this.sessao = sessao;
    this.tipo = tipo;
  } 

  public Sessao getSessao() {
    return sessao;
  }

  public void setSessao(Sessao sessao) {
    this.sessao = sessao;
  }

  public UsuarioAbstrato getComprador() {
    return comprador;
  }

  public void setComprador(UsuarioAbstrato comprador) {
    this.comprador = comprador;
  }
  
  public String getTipo(){
      return tipo;
  }
}