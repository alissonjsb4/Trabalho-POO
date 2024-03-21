package classesLogicas.Sistema.Excecoes.SessaoExceptions;

public class UNEException extends Exception {
  public UNEException(String login) {
    super("Usuario com o login: " + login + "não foi encontrado.");
  }
}

