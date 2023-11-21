import java.util.Vector;

public class Sessao {
  private String codigoSessao;
  private Filme filme;
  private boolean is3D;
  private String faixaDeAudio;
  private String horario;
  private Sala sala;
  private int vagas;
  private float preco;
  private Vector<UsuarioAbstrato> publico;
  private boolean sessaoInvalidadaADM;

  
  public Sessao (String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, float preco) {
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
    for (UsuarioAbstrato pessoa : this.publico) {
      if (pessoa.getLogin().equals(login)) {
        return pessoa;
      }
      return null;
    }
    return null;
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

  public void removerPessoa(String login){
    if (this.isSessaoDisponivel() && this.existePessoa(login)) {
      this.publico.remove(procurarPessoa(login));
      vagas++;
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
      
  public float getPreco() {
    return this.preco;
  }

  public void setSessaoInvalidadaADM(boolean essaCaraiaNaoTaPodendo) {
    this.sessaoInvalidadaADM = essaCaraiaNaoTaPodendo;
  }

}
