package classesLogicas.Sistema.repo;

/**
 *
 * @author Siqueira
 */
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import classesLogicas.Usuarios.UsuarioAbstrato;

public class UsuarioVector implements Serializable{
  private Vector<UsuarioAbstrato> usuarios;
  
  public UsuarioVector() {
    usuarios = new Vector<UsuarioAbstrato>();
    this.desserializar();
  }

 private void serializar() {
    File path = new File("./src/classesLogicas/Sistema/repo/arquivo/users");
    path.mkdirs();
    for (UsuarioAbstrato user : this.usuarios) {
      try {
        String nomeArquivo = "./src/classesLogicas/Sistema/repo/arquivo/users/" + user.getNome() + ".bin";
        FileOutputStream gravador = new FileOutputStream(nomeArquivo);
        ObjectOutputStream conversor = new ObjectOutputStream(gravador);
        conversor.writeObject(user);
        conversor.close();
        gravador.close();
      } catch (IOException e) {
         System.out.println("Erro Serializar");
        e.printStackTrace();
      }
    }
  }

 private void desserializar() {
    File diretorio = new File("./src/classesLogicas/Sistema/repo/arquivo/users");
    if (diretorio.exists() && diretorio.canRead()) {
      File[] arquivos = diretorio.listFiles();
      if (arquivos != null) {
        this.usuarios.clear();
        for (File arquivo : arquivos) {
          try {
            FileInputStream ler = new FileInputStream(arquivo);
            ObjectInputStream lerObj = new ObjectInputStream(ler);
            UsuarioAbstrato user = (UsuarioAbstrato) lerObj.readObject();
            this.usuarios.add(user);
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
 
  public UsuarioAbstrato[] listar () {
      UsuarioAbstrato[] usuariosLista = new UsuarioAbstrato[this.usuarios.size()];
      for (int i = 0; i < this.usuarios.size(); i++) {
        usuariosLista[i] = usuarios.get(i);
      }
      return usuariosLista;
  }
  
  public UsuarioAbstrato procurarUsuario(String login) {
    for (UsuarioAbstrato usuario : this.usuarios) {
      if (usuario.getLogin().equals(login)) {
        return usuario;
      }
    }
    return null;
  }

  public boolean existeUsuario(String login) {
    return this.procurarUsuario(login) != null;
  }

  public void adicionarUsuario(UsuarioAbstrato usuario) {
    if (usuario != null) {
      if (!existeUsuario(usuario.getLogin())) {
        this.usuarios.add(usuario);
      }
    }
    this.serializar();
  }
  
  public void removerUsuario(String login) {
    if (this.existeUsuario(login)) {
     this.usuarios.remove(procurarUsuario(login));
    } 
    this.serializar();
  }
  
  public void addCredito(String login, double credito) {
      if(this.procurarUsuario(login).getCredito() + credito > 9999)
          this.procurarUsuario(login).setCredito(9999);
      this.procurarUsuario(login).setCredito(credito);
      this.serializar();
  }

  public Vector<UsuarioAbstrato> getUsuarios(){
      return usuarios;
  }
  
  public int getSize(){
      return usuarios.size();
  }
  
  public UsuarioAbstrato getUsuario(int i){
      return usuarios.get(i);
  }
  
}
