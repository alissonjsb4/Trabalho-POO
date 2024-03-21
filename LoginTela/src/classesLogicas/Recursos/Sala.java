package classesLogicas.Recursos;
import java.io.Serializable;
/**
 *
 * @author Rocha
 */
public class Sala implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private final int salaID;
  private final int capacidade;
  
  public Sala (int salaID, int filas, int colunas) {
    this.salaID = salaID;
    this.capacidade = filas * colunas;
  }

  public int getSalaID() {
    return salaID;
  }
  public int getCapacidade() {
    return capacidade;
  }
}
