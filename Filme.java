public class Filme{
	private String codigo;
	private String titulo;
	private String diretor;
	private int classificacao;
	private boolean tresD;
	private String sinopse;
	private char faixaAudio;
	private int duracao;

	public Filme(String codigo, 
		     String titulo, 
		     String diretor, 
		     int classificacao, 
		     boolean tresD, 
		     String sinopse, 
		     char faixaAudio, 
		     int duracao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.diretor = diretor;
		this.classificacao = classificacao;
		this.tresD = tresD;
		this.sinopse = sinopse;
		this.faixaAudio = faixaAudio;
		this.duracao = duracao;	
	}
	public String getCodigo(){
		return codigo;
	}
	public String getInfo(){
		return "Título: "+getTitulo();
		//terminar esse método
	}
	public String getTitulo(){
		return titulo;
	}
	public String getDiretor(){
		return diretor;
	}
	public int getClassficacao(){
		return classificacao;
	}
	public boolean isTresD(){
		return tresD;
	}
	public String getSinopse(){
		return sinopse;
	}
	public char getFaixaAudio(){
		return faixaAudio;
	}
	public int getDuracao(){
		return duracao;
	}
}
