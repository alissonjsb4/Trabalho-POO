package classesLogicas.Recursos;
import java.io.Serializable;
/**
 *
 * @author Rocha
 */
public class Filme implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private final String codigo;
  private final String titulo;
  private final String diretor;
  private final String genero;
  private final int classificacao;
  private final String sinopse;
  private final int duracao;

  public Filme(String codigo, String titulo, String diretor, String genero, int classificacao, String sinopse, int duracao) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.diretor = diretor;
    this.genero = genero;
    this.classificacao = classificacao;
    this.sinopse = sinopse;
    this.duracao = duracao;	
  }

  public String getInfo(){
    String tituloI = "\nTítulo: " + getTitulo();
    String diretorI = "\nDiretor: " + getDiretor();
    String classificacaoI = "\nClassificação: " + getClassificacao();
    String duracaoI = "\nDuração: " + getDuracao();
    String sinopseI = "\n\nSinopse:\n" + getSinopse();
    
    String info = tituloI + diretorI + classificacaoI + duracaoI + sinopseI;
    
    return info;
    //R21.11: Acho ter terminado.
  }

  public String getCodigo() {
    return codigo;
  }
  public String getTitulo(){
    return titulo;
  }
  public String getDiretor(){
    return diretor;
  }
  public String getGenero(){
      return genero;
  }
  public int getClassificacao(){
    return classificacao;
  }
  public String getSinopse(){
    return sinopse;
  }
  public int getDuracao(){
    return duracao;
  }
}
