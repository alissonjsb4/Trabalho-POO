package classesLogicas.Sistema.Interfaces;

import classesLogicas.Recursos.Filme;
import classesLogicas.Recursos.Sala;

/*
 * @author Rocha
 */
public interface IAdmin {

  public String criarFilme(String codigo, String titulo, String diretor, String genero, int classificacao, String sinopse, int duracao);

  public String criarSessao(String codigo, Filme filme, boolean is3D, String audio, String horario, Sala sala, float preco);

  public void criarSala(int salaID, int filas, int colunas);
  
  public boolean criarUsuario(String login, String nome, String senha, int idade, boolean premium);
  
  public boolean dentroDoHorario(String horario);
}