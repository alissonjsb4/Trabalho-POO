public interface ICinema {
  public Filme procurarFilme(String codigo);
  public Sessao procurarSessao(String codigo);
  public Sala procurarSala(int SalaID);
  public boolean existeFilme(String codigo);
  public boolean existeSessao(String codigo);
  public boolean existeSala(int SalaID);
}
