import java.util.Vector;

public class Usuario extends UsuarioAbstrato {

  public Usuario(String login, String nome, String senha, int idade, float credito){
    super(login, nome, senha, idade, credito);
  }
  
  public void comprarTicket(Sessao sessao, Usuario usuario) {
    if (sessao.getFilme().getClassificacao() <= usuario.idade) {
      this.historico.add(sessao);
      System.out.println("Compra realizada com sucesso!");
    } else {
      System.out.println("Compra não realizada, filme não disponível para essa idade!");
    }
  }
  
  public void cancelarCompra() {

  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public Vector<Sessao> getHistorico() {
    return historico;
  }

  public void setHistorico(Vector<Sessao> historico) {
    this.historico = historico;
  }
}
