public class Sala{
  private int salaID;
  private int capacidade;
  private boolean[][] mapaAssentos;

  public Sala (int salaID, int filas, int colunas) {
    this.salaID = salaID;
    this.capacidade = filas * colunas;
    this.mapaAssentos = new boolean[filas][colunas];
  }

  public void setTodosAssentosLivres(){
  }
  public boolean getStatusASsento(){}
  public boolean isSalaLotada(){}
  public void reservarAssento(int[][] cadeira){}
}
