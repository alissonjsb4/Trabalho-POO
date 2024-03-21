package classesLogicas.Sistema.Excecoes.RepoExceptions;

/*
 * @author Lessa
 */
public class SEException extends Exception{
  public SEException(int id) {
      super("Sala com o ID: " + id + "já existe.");
  }
}
