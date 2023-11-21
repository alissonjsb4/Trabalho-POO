public interface IAdmin {
  
  public void adicionarFilme(Filme filme);
  public void removerFilme(String codigo);
  public void criarFilme(String codigo, String titulo, String diretor, int classificacao, String sinopse, int duracao);
  public void adicionarSessao(Sessao sessao);
  public void removerSessao(String codigo);
  public void criarSessao(String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, float preco);
  public void adicionarSala(Sala sala);
  public void removerSala(int SalaID);
  public void criarSala(int salaID, int filas, int colunas);
  
}
