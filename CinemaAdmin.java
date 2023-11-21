import java.util.Vector;

public class CinemaAdmin implements IAdmin, ICinema {
  private final static String[] horarios = {"14:00", "17:00", "20:00"};
  private Vector<Filme> cartazFilmes;
  private Vector<Sessao> sessoes;
  private Vector<Sala> salas;
  private Vector<UsuarioAbstrato> usuarios;

  public CinemaAdmin() {
    this.cartazFilmes = new Vector<Filme>();
    this.sessoes = new Vector<Sessao>();
    this.salas = new Vector<Sala>();
    this.usuarios = new Vector<UsuarioAbstrato>();
  }

  // Métodos Cabulosos para Filmes:
  public Filme procurarFilme(String codigo){
    for (Filme filme : this.cartazFilmes) {
      if (filme.getCodigo().equals(codigo)) {
        return filme;
      }
    }
    return null;
  }

  public boolean existeFilme(String codigo){
    return procurarFilme(codigo) != null;
  }

  public void adicionarFilme(Filme filme){
    if(filme != null){
      if(!this.existeFilme(filme.getCodigo())){
        this.cartazFilmes.add(filme);
      }
    }
  }

  public void removerFilme(String codigo) {
    if (this.existeFilme(codigo)) {
      this.cartazFilmes.remove(procurarFilme(codigo));
    }
  }
  
  public void criarFilme(String codigo, String titulo, String diretor, int classificacao, String sinopse, int duracao) {
    if (!this.existeFilme(codigo)) {
      Filme filme = new Filme(codigo, titulo, diretor, classificacao, sinopse, duracao);
      this.adicionarFilme(filme);
    }
  }

  // Métodos Cabulosos para Sessões:
  public Sessao procurarSessao(String codigo){
    for (Sessao sessao : this.sessoes) {
      if (sessao.getCodigoSessao().equals(codigo)) {
        return sessao;
      }
    }
    return null;
  }
  public boolean existeSessao(String codigo){
    return this.procurarSessao(codigo) != null;
  }
  public void adicionarSessao(Sessao sessao){
    if (sessao != null) {
      if (!existeSessao(sessao.getCodigoSessao())) {
        this.sessoes.add(sessao);
      }
    }
  }
  
  public void removerSessao(String codigo){
    if (this.existeSessao(codigo)) {
      this.sessoes.remove(procurarSessao(codigo));
    }
  }
  
  public void criarSessao(String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, float preco) {
    if (this.existeFilme(filme.getCodigo()) 
        && this.existeSala(sala.getSalaID()) 
        && this.dentroDoHorario(horario)
        && !this.existeSessao(codigo)) {
      Sessao sessao = new Sessao(codigo, filme, is3D, audio, horario, sala, preco);
      adicionarSessao(sessao);
    }
  }

  // Métodos Cabulosos para Salas:
  public Sala procurarSala(int salaID){
    for (Sala sala : this.salas) {
      if (sala.getSalaID() == salaID) {
        return sala;
      }
    }
    return null;
  }
  public boolean existeSala(int salaID){
    if(procurarSala(salaID) != null)
      return true;
    return false;
  }
  public void adicionarSala(Sala sala){
    if (sala != null) {
      if (!existeSala(sala.getSalaID())) {
        this.salas.add(sala);
      }
    }
  }
  public void removerSala(int salaID){
    if (this.existeSala(salaID)) {
      this.salas.remove(procurarSala(salaID));
    }
  }
  public void criarSala(int salaID, int filas, int colunas){
     /*verifica se o código ja existe*/ 
    if (!this.existeSala(salaID)){
      Sala sala = new Sala(salaID, filas, colunas);
      this.adicionarSala(sala);
    }
  }

  public boolean dentroDoHorario(String horario) {
    // Este método verifica se um horário está dentro da lista de horarios do cinema
    for(String hora : horarios) {
      if (hora.equals(horario)) {
        return true;
      }
    }
    return false;
  }
}

/*
import br.ufc.poo.classeslogicas.recursos.Filme;
import br.ufc.poo.classeslogicas.recursos.Sessao;
import br.ufc.poo.classeslogicas.recursos.Sala;*/
