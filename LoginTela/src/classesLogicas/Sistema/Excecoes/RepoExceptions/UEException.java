package classesLogicas.Sistema.Excecoes.RepoExceptions;
/**
 *
 * @author Lessa
 */

//Usuário Existente
public class UEException extends Exception {
  public UEException(String login) {
    super("Usuario com o login: " + login + "já existe.");
  }
}