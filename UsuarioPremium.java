import java.util.Vector;

  public class UsuarioPremium extends UsuarioAbstrato {
      private int BonusFilme = 0;

      public UsuarioPremium(String login, String nome, String senha, int idade, float credito) {
          super(login, nome, senha, idade, credito);
      }

      public void comprarTicket(Sessao sessao) {
          try {
              if (sessao.getFilme().getClassificacao() <= this.idade) {
                  if (BonusFilme == 10) {
                      this.historico.add(sessao);
                      BonusFilme = 0;
                  } else {
                      this.historico.add(sessao);
                      credito -= sessao.getPreco();
                      BonusFilme++;
                  }
                  System.out.println("Compra realizada com sucesso!");
              } else {
                  throw new IllegalArgumentException("Compra não realizada, filme não disponível para essa idade!");
              }
          } catch (NullPointerException e) {
              // Tratar a exceção caso Sessao.getFilme() retorne null
              System.out.println("Erro: A sessão ou filme é inválido.");
          }
      }

      public void comprarTicket(Sessao sessao, String tipo) {
          try {
              if (tipo.equals("meia")) {
                  if (sessao.getFilme().getClassificacao() <= this.idade) {
                      if (BonusFilme == 10) {
                          this.historico.add(sessao);
                          BonusFilme = 0;
                          System.out.println("Compra utilizando o bônus realizada com sucesso!");
                      } else {
                          this.historico.add(sessao);
                          credito -= (sessao.getPreco() / 2);
                          BonusFilme++;
                          System.out.println("Compra de meia realizada com sucesso!");
                      }
                  } else {
                      throw new IllegalArgumentException("Compra não realizada, filme não disponível para essa idade!");
                  }
              } else if (tipo.equals("inteira")) {
                  if (sessao.getFilme().getClassificacao() <= this.idade) {
                      if (BonusFilme == 10) {
                          this.historico.add(sessao);
                          BonusFilme = 0;
                          System.out.println("Compra utilizando o bônus realizada com sucesso!");
                      } else {
                          this.historico.add(sessao);
                          credito -= sessao.getPreco();
                          BonusFilme++;
                          System.out.println("Compra de inteira realizada com sucesso!");
                      }
                  } else {
                      throw new IllegalArgumentException("Compra não realizada, filme não disponível para essa idade!");
                  }
              } else {
                  throw new IllegalArgumentException("Tipo de ingresso inválido. Escolha 'meia' ou 'inteira'.");
              }
          } catch (NullPointerException e) {
              // Tratar a exceção caso Sessao.getFilme() retorne null
              System.out.println("Erro: A sessão ou filme é inválido.");
          }
      }
  }
