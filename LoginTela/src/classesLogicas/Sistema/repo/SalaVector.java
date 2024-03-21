package classesLogicas.Sistema.repo;
/**
 *
 * @author Siqueira
 */

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.io.ObjectInputStream;
import classesLogicas.Recursos.Sala;

public class SalaVector {
  private Vector<Sala> salas;

  public SalaVector() {
    this.salas = new Vector<Sala>();
    this.desserializar();
  }
  
private void serializar() {
    File path = new File("./src/classesLogicas/Sistema/repo/arquivo/rooms");
    path.mkdirs();
    for (Sala sala : this.salas) {
      try {
        String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/rooms/" + sala.getSalaID() + ".bin";
        FileOutputStream gravador = new FileOutputStream(nomeArquivo);
        ObjectOutputStream conversor = new ObjectOutputStream(gravador);
        conversor.writeObject(sala);
        conversor.close();
        gravador.close();
      } catch (IOException e) {
         System.out.println("Erro Serializar");
        e.printStackTrace();
      }
    }
  }
private void desserializar() {
    File diretorio = new File("./src/classesLogicas/Sistema/repo/arquivo/rooms");
    if (diretorio.exists() && diretorio.canRead()) {
      File[] arquivos = diretorio.listFiles();
      if (arquivos != null) {
        this.salas.clear();
        for (File arquivo : arquivos) {
          try {
            FileInputStream ler = new FileInputStream(arquivo);
            ObjectInputStream lerObj = new ObjectInputStream(ler);
            Sala sala = (Sala) lerObj.readObject();
            this.salas.add(sala);
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
  
  public Sala procurarSala(int salaID){
    for (Sala sala : this.salas) {
      if (sala.getSalaID() == salaID) {
        return sala;
      }
    }
    return null;
  }

  public boolean existeSala(int salaID) {
    return this.procurarSala(salaID) != null;
  }

  public void adicionarSala(Sala sala) {
    if (sala != null) {
      if (!existeSala(sala.getSalaID())) {
        this.salas.add(sala);
      }
    }
    this.serializar();
  }

  public void removerSala(int salaID) {
    if (this.existeSala(salaID)) {
      this.salas.remove(procurarSala(salaID));
    }
    this.serializar();
  }

}
