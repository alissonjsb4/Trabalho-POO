package classesLogicas.Sistema.Excecoes.UsuarioExcecoes;
/**
 *
 * @author Rocha
 */
// Idade Insuficiente
public class IIException extends Exception{

  private int idade;
  private int classificacao;

  public IIException(int idade, int classificacao){
    super ("Idade insuficiente!" + "\nClassificação Indicativa: " + classificacao + "\nIdade do usuário: " + idade);
    this.idade = idade;
    this.classificacao = classificacao;
  }


  public int getIdade(){
    return idade;
  }
  public int getClassificacao(){
    return classificacao;
  }
}
