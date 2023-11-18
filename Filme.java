public class Filme{
	private String codigo;
	private String titulo;
	private String diretor;
	private int classificacao;
	private boolean is3D;
	//R18.11: alterei o nome da variável, uma vez que no construtor ela tinha esse formato.
	private String sinopse;
	private String faixaAudio;
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
		this.is3D = is3D;
		this.sinopse = sinopse;
		this.faixaAudio = audio;
		this.duracao = duracao;	
	}
	public String getCodigo(){
		return codigo;
	}
	public String getInfo(){
		if(is3D()){
		String is3DDisponivel = " ESTÁ ";
		}
		else{
		String is3DDisponivel = " NÃO ESTÁ ";
		}
		String info = ("Título: " + getTitulo() + "\n Diretor(a): " + getDiretor() + "\n Classificação Indicativa: " + getClassificacao() + "\n A sessão em questão" + is3DDisponivel + "com 3D disponível!" + "\n Faixa de Áudio: " + getFaixaAudio() + "\n Tempo de Filme: " + getDuracao() + "\n\n Breve sinopse:\n" + getSinopse();
		return info;
		//R18.11: creio ter terminado, mas ainda se pode mudar
	}
	public String getTitulo(){
		return titulo;
	}
	public String getDiretor(){
		return diretor;
	}
	public int getClassificacao(){
		return classificacao:
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
