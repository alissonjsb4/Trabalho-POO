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
import classesLogicas.Recursos.Sessao;

public class SessaoVector {
  private Vector<Sessao> sessoes;

  public SessaoVector() {
    this.sessoes = new Vector<Sessao>();
    this.desserializar();
  }

private void serializar() {
    File path = new File("./src/classesLogicas/Sistema/repo/arquivo/sessoes");
    path.mkdirs();
    for (Sessao sessao : this.sessoes) {
      try {
        String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/sessoes/" + sessao.getCodigoSessao() + ".bin";
        FileOutputStream gravador = new FileOutputStream(nomeArquivo);
        ObjectOutputStream conversor = new ObjectOutputStream(gravador);
        conversor.writeObject(sessao);
        conversor.close();
        gravador.close();
      } catch (IOException e) {
         System.out.println("Erro Serializar");
        e.printStackTrace();
      }
    }
  }

private void desserializar() {
    File diretorio = new File("./src/classesLogicas/Sistema/repo/arquivo/sessoes");
    if (diretorio.exists() && diretorio.canRead()) {
      File[] arquivos = diretorio.listFiles();
      if (arquivos != null) {
        this.sessoes.clear();
        for (File arquivo : arquivos) {
          try {
            FileInputStream ler = new FileInputStream(arquivo);
            ObjectInputStream lerObj = new ObjectInputStream(ler);
            Sessao sessao = (Sessao) lerObj.readObject();
            this.sessoes.add(sessao);
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
    for (Sessao sessao : this.sessoes) {
        if(sessao.getCodigoSessao().equals(codigo)){
            String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/sessoes/" + sessao.getCodigoSessao() + ".bin";
            File file = new File(nomeArquivo);
            file.delete();
        }
    }
}
    
    public Sessao[] listar() {
      Sessao[] sessaoLista = new Sessao[sessoes.size()];
      for (int i = 0; i < sessoes.size(); i++) {
          sessaoLista[i] = sessoes.get(i);
      }
      return sessaoLista;
  }
  
  public Sessao procurarSessao(String codigo){
    for (Sessao sessao : this.sessoes) {
      if (sessao.getCodigoSessao().equals(codigo)) {
        return sessao;
      }
    }
    return null;
  }

  public void cadeiraComprada(String codigo){
      this.procurarSessao(codigo).cadeiraComprada();
      this.serializar();
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
    this.serializar();
  }

  public void removerSessao(String codigo){
    if (this.existeSessao(codigo)) {
      this.sessoes.remove(procurarSessao(codigo));
      this.deletarBin(codigo);
    }
    this.serializar();
  }
  
  public int getSize(){
      return sessoes.size();
  }
  
  public Sessao getSessao(int i){
      return sessoes.get(i);
  }
}
