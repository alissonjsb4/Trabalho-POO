package classesLogicas.Sistema.Excecoes.RepoExceptions;
/**
 *
 * @author Lessa
 */
//Filme Existente 
public class FEException extends Exception {
  public FEException(String codigo) {
      super("Filme com o código: " + codigo + "já existe.");
  }
}

