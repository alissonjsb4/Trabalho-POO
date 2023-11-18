public class Sala{
  private int salaID;
  private int capacidade;
  private boolean[][] mapaAssentos;
  /*R18.11: (para falar durante a reunião) No método ReservarCadeira, há um sout para printar as coordenadas da cadeira reservada. Contudo, poderíamos colocar
  isso na função acessível ao usuário que chamará esse método, adaptando as coordenadas para uma numérica e outra "alfabética" (posso pensar em como escrever
  isso, qualquer coisa).
  */
  public Sala (int salaID, int filas, int colunas) {
    this.salaID = salaID;
    this.capacidade = filas * colunas;
    this.mapaAssentos = new boolean[filas][colunas];
  }

  public void setTodosAssentosLivres() {
    for (int i = 0; i < mapaAssentos.length; i++) {
      for (int j = 0; j < mapaAssentos[i].length; j++) {
        mapaAssentos[i][j] = false;
      }
    }
  }
  
  public boolean getStatusAssento(int fila, int coluna) {
    if (fila >= 0 && fila < mapaAssentos.length && coluna >= 0 && coluna < mapaAssentos[0].length) {
      return mapaAssentos[fila][coluna];
    } else {
      // Caso os índices sejam invalidos, retorna falso
      return false;
    }
  }
  
  public boolean isSalaLotada() {
    int assentosOcupados = 0;
    for (int i = 0; i < mapaAssentos.length; i++) {
      for (int j = 0; j < mapaAssentos[i].length; j++) {
        if (mapaAssentos[i][j]) {
          assentosOcupados++;
        }
      }
    }
    if (assentosOcupados == capacidade)
      return true;
    else 
      return false;
  }
  
  public void reservarAssento(int fila, int coluna) {
    if (fila >= 0 && fila < mapaAssentos.length && coluna >= 0 && coluna < mapaAssentos[0].length) {
      if (!mapaAssentos[fila][coluna]) {
        mapaAssentos[fila][coluna] = true; // Reserva da cadeira
        System.out.println("Assento na fila " + fila + ", coluna " + coluna + " reservado com sucesso.");
      } else {
        System.out.println("Assento na fila " + fila + ", coluna " + coluna + " já está ocupado.");
      }
    } else {
      // Caso os índices sejam invalidos
      System.out.println("Índices de assento inválidos.");
    }
  }
}
