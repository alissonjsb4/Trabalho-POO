package classesLogicas.Recursos;
import java.io.Serializable;

import java.util.Vector;

import classesLogicas.Usuarios.UsuarioAbstrato;
import classesLogicas.Sistema.Excecoes.SessaoExceptions.UNEException;
/**
 *
 * @author Rocha
 */
public class Sessao implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private String codigoSessao;
  private Filme filme;
  private boolean is3D;
  private String faixaDeAudio;
  private String horario;
  private Sala sala;
  private int vagas;
  private double preco;
  private Vector<UsuarioAbstrato> publico;
  private boolean sessaoInvalidadaADM;

  
  public Sessao (String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, double preco) {
    this.codigoSessao = codigo;
    this.filme = filme;
    this.is3D = is3D;
    this.faixaDeAudio = audio;
    this.horario = horario;
    this.sala = sala;
    this.preco = preco;
    this.vagas = sala.getCapacidade();
    this.publico = new Vector<UsuarioAbstrato>(vagas);
    this.sessaoInvalidadaADM = false;
    
  }

  public UsuarioAbstrato procurarPessoa(String login) {
      try {
          for (UsuarioAbstrato pessoa : this.publico) {
              if (pessoa.getLogin().equals(login)) {
                  return pessoa;
              }
          }
          throw new UNEException(login);
      } catch (UNEException e) {
          System.out.println("Erro ao procurar usuário: " + e.getMessage());
          return null;
      }
  }

  public void cadeiraComprada(){
      vagas--;
  }
  
  public boolean existePessoa(String login) {
    return (login != null && this.procurarPessoa(login) != null);
  }

  public boolean isSessaoDisponivel(){
    if (vagas > 0 && !sessaoInvalidadaADM) {
      return true;
    }
    return false;
  }
  
  public void adicionarPessoa(UsuarioAbstrato pessoa){
    if (pessoa != null) {
      if (this.isSessaoDisponivel() && !this.existePessoa(pessoa.getLogin())) {
        this.publico.add(pessoa);
        vagas--;
      }
    }
  }

  public String getCodigoSessao() {
  	return codigoSessao;
  
  }
  
  public void setCodigoSessao(String codigoSessao) {
  	this.codigoSessao = codigoSessao;
  }
  
  public Filme getFilme() {
  	return filme;
  }
  
  public void setFilme(Filme filme) {
  	this.filme = filme;}
      
  public String getHorario(){
      return horario;
  }
  
  public double getPreco() {
    return this.preco;
  }

  public void setSessaoInvalidadaADM(boolean validade) {
    this.sessaoInvalidadaADM = validade;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }

  public int getVagas(){
      return vagas;
  }
  
  public Sala getSala(){
      return sala;
  }
  
}
