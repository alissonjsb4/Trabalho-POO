package classesLogicas.Sistema.repo;
/**
 *
 * @author Siqueira
 */
import java.util.Vector;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import classesLogicas.Recursos.Filme;
import classesLogicas.Sistema.Excecoes.RepoExceptions.FEException;

public class FilmeVector implements Serializable{
  private Vector<Filme> filmes;

  public FilmeVector() {
    filmes = new Vector<Filme>();
    this.desserializar();
  }

private void serializar() {
    File path = new File("./src/classesLogicas/Sistema/repo/arquivo/movies");
    path.mkdirs();
    for (Filme filme : this.filmes) {
      try {
        String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/movies/" + filme.getCodigo() + ".bin";
        FileOutputStream gravador = new FileOutputStream(nomeArquivo);
        ObjectOutputStream conversor = new ObjectOutputStream(gravador);
        conversor.writeObject(filme);
        conversor.close();
        gravador.close();
      } catch (IOException e) {
         System.out.println("Erro Serializar");
        e.printStackTrace();
      }
    }
  }

private void desserializar() {
    File diretorio = new File("./src/classesLogicas/Sistema/repo/arquivo/movies");
    if (diretorio.exists() && diretorio.canRead()) {
      File[] arquivos = diretorio.listFiles();
      if (arquivos != null) {
        this.filmes.clear();
        for (File arquivo : arquivos) {
          try {
            FileInputStream ler = new FileInputStream(arquivo);
            ObjectInputStream lerObj = new ObjectInputStream(ler);
            Filme filme = (Filme) lerObj.readObject();
            this.filmes.add(filme);
            ler.close();
            lerObj.close();
          } catch (Exception e) {
            System.out.println("Erro Desserializar");
            e.printStackTrace();
          }
        }
      }
    }
  }

private void deletarBin(String codigo){
    File path = new File("./src/classesLogicas/Sistema/repo/arquivo/sessoes");
    path.mkdirs();
    for (Filme filme : this.filmes) {
        if(filme.getCodigo().equals(codigo)){
            String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/movies/" + filme.getCodigo() + ".bin";
            File file = new File(nomeArquivo);
            file.delete();
        }
    }
}

  public Filme procurarFilme(String codigo) {
    for (Filme filme : this.filmes) {
      if (filme.getCodigo().equals(codigo)) {
        return filme;
      }
    }
    return null;
  }

  public boolean existeFilme(String codigo) { 
    return procurarFilme(codigo) != null;
  }

  public void adicionarFilme(Filme filme) throws FEException{
    if(filme != null){
      if(!this.existeFilme(filme.getCodigo())){
        this.filmes.add(filme);
      }
    }else{
      throw new FEException(filme.getCodigo());
    }
    this.serializar();
  }

  public void removerFilme(String codigo) {
    if (this.existeFilme(codigo)) {
      this.filmes.remove(procurarFilme(codigo));
      this.deletarBin(codigo);
    }
    this.serializar();
  }
  
  public int getSize(){
      return filmes.size();
  }
  public Filme getFilme(int i){
      return filmes.get(i);
  }
}