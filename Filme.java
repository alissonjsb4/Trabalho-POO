public class Filme {
  private String codigo;
  private String titulo;
  private String diretor;
  private int classificacao;
  private String sinopse;
  private String faixaAudio;
  private int duracao;

  public Filme(String codigo, 
         String titulo, 
         String diretor, 
         int classificacao,  
         String sinopse, 
         int duracao) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.diretor = diretor;
    this.classificacao = classificacao;
    this.sinopse = sinopse;
    this.duracao = duracao;	
  }

  public String getInfo(){
    String tituloI = "\nTítulo: " + getTitulo();
    String diretorI = "\nDiretor: " + getDiretor();
    String classificacaoI = "\nClassificação: " + getClassificacao();
    String duracaoI = "\nDuração: " + getDuracao();
    String sinopseI = "\n\nSinopse : " + getSinopse();
    
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
