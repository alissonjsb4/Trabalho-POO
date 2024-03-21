package classesLogicas.Usuarios;
/**
 *
 * @author Rocha
 */
import classesLogicas.Recursos.Sessao;

public class UsuarioPremium extends UsuarioAbstrato{
  private int BonusFilme = 0;
  
  public UsuarioPremium(String login, String nome, String senha, int idade) {
          super(login, nome, senha, idade, true);
      }
//polimorfismo sobreposição
  public String comprarTicket(Sessao sessao) {
    String retorno;
    if (BonusFilme >= 10) {
      super.setCredito(this.credito += sessao.getPreco());
      retorno = super.comprarTicket(sessao);
      setBonus(0);
    } else {
      retorno = super.comprarTicket(sessao);
      if(retorno == "Sucesso")
        BonusFilme++;
    }
    return retorno;
  }

  public String comprarTicket(Sessao sessao, String tipo) {
    String retorno;
    if (BonusFilme >= 10) {
      super.setCredito(this.credito += sessao.getPreco());
      retorno = super.comprarTicket(sessao, tipo);
      setBonus(0);
    } else {
      retorno = super.comprarTicket(sessao, tipo);
      if(retorno == "Sucesso")
          BonusFilme++;
    }
    return retorno;
  }

  public void setBonus(int bonus){
    this.BonusFilme = bonus;
  }
  public int getBonus(){
    return BonusFilme;
  }

}