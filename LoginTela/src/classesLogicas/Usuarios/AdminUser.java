package classesLogicas.Usuarios;



import classesLogicas.Sistema.Interfaces.IAdmin;
import classesLogicas.Recursos.Filme;
import classesLogicas.Recursos.Sala;
import classesLogicas.Recursos.Sessao;
import classesLogicas.Sistema.repo.FilmeVector;
import classesLogicas.Sistema.repo.SalaVector;
import classesLogicas.Sistema.repo.SessaoVector;
import classesLogicas.Sistema.repo.UsuarioVector;
import classesLogicas.Sistema.Excecoes.RepoExceptions.FEException;
import classesLogicas.Sistema.Excecoes.RepoExceptions.SEException;
import classesLogicas.Sistema.Excecoes.RepoExceptions.SessaoEException;
import classesLogicas.Sistema.Excecoes.RepoExceptions.UEException;

public class AdminUser  extends UsuarioAbstrato implements IAdmin{
  private final static String[] horarios = {"14:00", "16:00", "18:00", "20:00", "22:00"};
  private FilmeVector repoFilme;
  private SalaVector repoSala;
  private SessaoVector repoSessao;
  private UsuarioVector publico;
  private UsuarioAbstrato novaPessoa;

  public AdminUser(FilmeVector repoFilme, SalaVector repoSala, SessaoVector repoSessao, UsuarioVector publico) {
    super("AdminCinema", "AdminCinema", "123AdminCinema789", 35, false);
    this.repoFilme = repoFilme;
    this.repoSala = repoSala;
    this.repoSessao = repoSessao;
    this.publico = publico;
  }

  public String criarFilme(String codigo, String titulo, String diretor, String genero, int classificacao, String sinopse, int duracao) {
    try{
      if (!this.repoFilme.existeFilme(codigo)) {
        Filme filme = new Filme(codigo, titulo, diretor, genero, classificacao, sinopse, duracao);
        this.repoFilme.adicionarFilme(filme);
        return "criado";
      } else {
        throw new FEException(codigo);
      }
    } catch(FEException e){
        return e.getMessage();
    }
  }

  public String criarSessao(String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, float preco) {
      try {
          if (this.repoFilme.existeFilme(filme.getCodigo()) 
              && this.repoSala.existeSala(sala.getSalaID()) 
              && this.dentroDoHorario(horario)
              && !this.repoSessao.existeSessao(codigo)) {
              Sessao sessao = new Sessao(codigo, filme, is3D, audio, horario, sala, preco);
              this.repoSessao.adicionarSessao(sessao);
              return "criado";
          } else {
              throw new SessaoEException(codigo);
          }
      } catch (SessaoEException e) {
          return e.getMessage();
      }
  }

  public void criarSala(int salaID, int filas, int colunas) {
      try {
          if (!this.repoSala.existeSala(salaID)) {
              Sala sala = new Sala(salaID, filas, colunas);
              this.repoSala.adicionarSala(sala);
          } else {
              throw new SEException(salaID);
          }
      } catch (SEException e) {
          System.out.println("Erro ao criar sala: " + e.getMessage());
      }
  }

  public boolean criarUsuario(String login, String nome, String senha, int idade, boolean premium) {
      try {
          if (!this.publico.existeUsuario(login)) {
              if(premium)
                novaPessoa = new UsuarioPremium(login, nome, senha, idade);
              else
                novaPessoa = new Usuario(login, nome, senha, idade);
              this.publico.adicionarUsuario(novaPessoa);
              return true;
          } else {
              throw new UEException(login);
          }
      } catch (UEException e) {
          return false;
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
  
  public FilmeVector getRepoFilme(){
      return repoFilme;
  }
  public SalaVector getRepoSala(){
      return repoSala;
  }
  public SessaoVector getRepoSessao(){
      return repoSessao;
  }
  public UsuarioVector getPublico(){
      return publico;
  }
}
