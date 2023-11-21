import java.util.Vector;
/*
    TH: Criar getters e setters por gentileza
    JL: cala a boca thiago
    TH: eu joguei uma macumba la fora todo mundo vai morrer
    TH: No alto daquele cume
        Plantei uma roseira
        O vento no cume bate
        A rosa no cume cheira

MR: Vai fazer alguma coisa, Thiago...
*/

public abstract class UsuarioAbstrato {
  protected String login;
  protected String nome;
  protected String senha;
  protected int idade;
  protected float credito = 8001;
  protected Vector<Sessao> historico;

  public UsuarioAbstrato(String login, String nome, String senha, int idade, float credito) {
    this.login = login;
    this.nome = nome;
    this.senha = senha;
    this.idade = idade;
    this.historico = new Vector<Sessao>();
    this.credito = credito;
  }


  public void comprarTicket(Sessao sessao){
    if(sessao.getFilme().getClassificacao() <= this.idade){
      this.historico.add(sessao);
      System.out.println("Compra realizada com sucesso!");
    }

  }
  
  public void cancelarCompra(){

  }
  public void verHistorico(String login){

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
}
