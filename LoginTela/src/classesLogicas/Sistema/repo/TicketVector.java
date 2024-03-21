package classesLogicas.Sistema.repo;
/**
 *
 * @author Siqueira
 */
import java.util.Vector;


import classesLogicas.Recursos.Ticket;
import classesLogicas.Recursos.Sessao;
import classesLogicas.Usuarios.UsuarioAbstrato;
import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class TicketVector implements Serializable{
  private static final long serialVersionUID = 1L;
  private Vector<Ticket> ticketsVendidos;

    private static final String CAMINHO_ARQUIVO = "./src/classesLogicas/Sistema/repo/arquivo/tickets";

    public TicketVector() {
        this.ticketsVendidos = new Vector<Ticket>();
        this.desserializar();
    }

    private void serializar() {
        File path = new File(CAMINHO_ARQUIVO);
        path.mkdirs();
        for (Ticket ticket : this.ticketsVendidos) {
            try {
                String nomeArquivo = getCaminhoArquivo(ticket);
                FileOutputStream gravador = new FileOutputStream(nomeArquivo);
                ObjectOutputStream conversor = new ObjectOutputStream(gravador);
                conversor.writeObject(ticket);
                conversor.close();
                gravador.close();
            } catch (IOException e) {
                System.out.println("Erro ao serializar");
                e.printStackTrace();
            }
        }
    }

    public Ticket[] listar(){
      Ticket[] ticketsLista = new Ticket[this.ticketsVendidos.size()];
      for (int i = 0; i < this.ticketsVendidos.size(); i++) {
        ticketsLista[i] = ticketsVendidos.get(i);
      }
      return ticketsLista;
    }
    
    private void desserializar() {
        File diretorio = new File(CAMINHO_ARQUIVO);
        if (diretorio.exists() && diretorio.canRead()) {
            File[] arquivos = diretorio.listFiles();
            if (arquivos != null) {
                this.ticketsVendidos.clear();
                for (File arquivo : arquivos) {
                    try {
                        FileInputStream ler = new FileInputStream(arquivo);
                        ObjectInputStream lerObj = new ObjectInputStream(ler);
                        Ticket ticket = (Ticket) lerObj.readObject();
                        this.ticketsVendidos.add(ticket);
                        ler.close();
                        lerObj.close();
                    } catch (Exception e) {
                        System.out.println("Erro ao desserializar");
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private String getCaminhoArquivo(Ticket ticket) {
        return CAMINHO_ARQUIVO + File.separator +
               ticket.getSessao().getCodigoSessao() + "." + ticket.getComprador().getNome() + ".bin";
    }

  public Ticket procurarTicket(UsuarioAbstrato proprietario, Sessao sessao){
    for (Ticket ticket : this.ticketsVendidos) {
      if (proprietario.getLogin().equals(ticket.getComprador().getLogin())) {
        if(sessao.getCodigoSessao().equals(ticket.getSessao().getCodigoSessao())){
          return ticket;
        }
      }
    }
    return null;
  }
  
  public boolean existeTicket(UsuarioAbstrato proprietario, Sessao sessao) {
    return this.procurarTicket(proprietario, sessao) != null;
  }

  public void adicionarTicket(Ticket ticket) {
    if (ticket != null) {
      if (!existeTicket(ticket.getComprador(), ticket.getSessao())) {
        this.ticketsVendidos.add(ticket);
      }
    }
    this.serializar();
  }

  public void removerTicket(UsuarioAbstrato proprietario, Sessao sessao) {
    if (this.existeTicket(proprietario, sessao)) {
      this.ticketsVendidos.remove(procurarTicket(proprietario, sessao));
    }
    this.serializar();
  }

  public void sessaoFinalizada(Sessao sessao){
    for(Ticket ticket : this.ticketsVendidos){
      if(ticket.getSessao().equals(sessao))
        removerTicket(ticket.getComprador(), ticket.getSessao());
    }
  }

  public Vector<Ticket> getTicketsVendidos() {
    return ticketsVendidos;
  }

  public void setTicketsVendidos(Vector<Ticket> ticketsVendidos) {
    this.ticketsVendidos = ticketsVendidos;
  }
  
  public int getSize(){
      return ticketsVendidos.size();
  }
}
