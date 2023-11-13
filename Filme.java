public class Filme{
	private String codigo;
	private String titulo;
	private String diretor;
	private int classificacao;
	private boolean is3D;
	private String sinopse;
	private String audio;
	private int duracao;

	public Filme(String codigo, 
		     String titulo, 
		     String diretor, 
		     int classificacao, 
		     boolean is3D, 
		     String sinopse, 
		     String audio, 
		     int duracao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.diretor = diretor;
		this.classificacao = classificacao;
		this.tresD = tresD;
		this.sinopse = sinopse;
		this.faixaAudio = audio;
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
	public boolean is3D(){
		return is3D;
	}
	public String getSinopse(){
		return sinopse;
	}
	public char getAudio(){
		return audio;
	}
	public int getDuracao(){
		return duracao;
	}
}
