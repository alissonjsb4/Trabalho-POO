package classesGraficas;

import classesLogicas.Sistema.repo.SessaoVector;
import classesLogicas.Sistema.repo.UsuarioVector;
import classesLogicas.Sistema.repo.SalaVector;
import classesLogicas.Usuarios.UsuarioAbstrato;
import classesLogicas.Recursos.Sessao;
import classesLogicas.Sistema.repo.FilmeVector;
import classesLogicas.Usuarios.AdminUser;

public class CatalogoView extends javax.swing.JFrame {
    private AdminUser user;
    private final String login;
    private final String nome;
    private double credito;
    private final int idade;
    private String opcaoTicket;
    private Sessao sessaoEscolhida;
    
    
    public CatalogoView(String login, String nome, int idade, double credito) {
        this.login = login;
        this.nome = nome;
        this.credito = credito;
        this.idade = idade;
        
        FilmeVector filmesV = new FilmeVector();
        SalaVector salasV = new SalaVector();
        SessaoVector sessoesV = new SessaoVector();
        UsuarioVector usuariosV = new UsuarioVector();
        user = new AdminUser(filmesV, salasV, sessoesV, usuariosV);
        
        jPanel1 = new javax.swing.JPanel();
        CreditosMostrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PainelCavi = new javax.swing.JButton();
        BotãoTicketNormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotãoTicketP = new javax.swing.JButton();
        BotãoTicketM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotãoTicketG = new javax.swing.JButton();
        BotãoComprar = new javax.swing.JButton();
        BotãoVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Filme1 = new javax.swing.JToggleButton();
        Filme2 = new javax.swing.JToggleButton();
        Filme3 = new javax.swing.JToggleButton();
        Filme4 = new javax.swing.JToggleButton();
        Filme5 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        DuracaoF1 = new javax.swing.JLabel();
        GeneroF1 = new javax.swing.JLabel();
        ClassF1 = new javax.swing.JLabel();
        NomeF1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GeneroF2 = new javax.swing.JLabel();
        GeneroF3 = new javax.swing.JLabel();
        GeneroF4 = new javax.swing.JLabel();
        GeneroF5 = new javax.swing.JLabel();
        DuracaoF2 = new javax.swing.JLabel();
        DuracaoF3 = new javax.swing.JLabel();
        ClassF2 = new javax.swing.JLabel();
        ClassF3 = new javax.swing.JLabel();
        DuracaoF4 = new javax.swing.JLabel();
        DuracaoF5 = new javax.swing.JLabel();
        ClassF4 = new javax.swing.JLabel();
        ClassF5 = new javax.swing.JLabel();
        Cadeiras2 = new javax.swing.JLabel();
        Cadeira4 = new javax.swing.JLabel();
        Cadeira3 = new javax.swing.JLabel();
        Cadeira5 = new javax.swing.JLabel();
        Cadeiras1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        CreditosMostrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreditosMostrar.setForeground(new java.awt.Color(0, 255, 204));
        CreditosMostrar.setText("CRÉDITOS: " + credito);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        PainelCavi.setText("\n");
        PainelCavi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        PainelCavi.setContentAreaFilled(false);
        PainelCavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PainelCaviActionPerformed(evt);
            }
        });

        BotãoTicketNormal.setText("15.00");
        BotãoTicketNormal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketNormalStateChanged(evt);
            }
        });
        BotãoTicketNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketNormalActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("TICKET NORMAL");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("TICKET + COMBO PEQUENO");

        BotãoTicketP.setText("20.00");
        BotãoTicketP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketPStateChanged(evt);
            }
        });
        BotãoTicketP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketPActionPerformed(evt);
            }
        });

        BotãoTicketM.setText("24.00");
        BotãoTicketM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketMStateChanged(evt);
            }
        });
        BotãoTicketM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketMActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TICKET + COMBO MÉDIO");

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("TICKET + COMBO GRANDE");

        BotãoTicketG.setText("31.00");
        BotãoTicketG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketGStateChanged(evt);
            }
        });
        BotãoTicketG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketGActionPerformed(evt);
            }
        });

        BotãoComprar.setBackground(new java.awt.Color(0, 0, 0));
        BotãoComprar.setForeground(new java.awt.Color(0, 255, 255));
        BotãoComprar.setText("COMPRAR");
        BotãoComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoComprarActionPerformed(evt);
            }
        });

        BotãoVoltar.setBackground(new java.awt.Color(0, 0, 0));
        BotãoVoltar.setForeground(new java.awt.Color(0, 255, 255));
        BotãoVoltar.setText("VOLTAR");
        BotãoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotãoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotãoComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotãoTicketM)
                                    .addComponent(BotãoTicketG, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BotãoTicketNormal)
                                        .addComponent(BotãoTicketP))))))
                    .addComponent(PainelCavi, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PainelCavi, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketG, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotãoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreditosMostrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreditosMostrar)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CATÁLOGO");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Filme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/CAPA FILME.jpg"))); // NOI18N
        Filme1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme1StateChanged(evt);
            }
        });
        Filme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme1ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        Filme2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/capa filme 2.jpg"))); // NOI18N
        Filme2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme2.setContentAreaFilled(false);
        Filme2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme2StateChanged(evt);
            }
        });
        Filme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme2ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 10, -1, 430));

        Filme3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/capa filme 3.5.jpg"))); // NOI18N
        Filme3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme3.setContentAreaFilled(false);
        Filme3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme3StateChanged(evt);
            }
        });
        Filme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme3ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 11, 260, 430));

        Filme4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/paulinho gogo capa filme.jpg"))); // NOI18N
        Filme4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme4.setContentAreaFilled(false);
        Filme4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme4StateChanged(evt);
                
            }
        });
        Filme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme4ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 10, -1, 430));

        Filme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/capa filme 100.jpg"))); // NOI18N
        Filme5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme5StateChanged(evt);
            }
        });
        Filme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme5ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 8, 270, 433));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("FILME: Capitão América: GC");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 470, 290, 30));

        DuracaoF1.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF1.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF1.setText("DURAÇÃO: 1h 59min");
        jPanel3.add(DuracaoF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 290, 30));

        GeneroF1.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF1.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF1.setText("GÊNERO(S): Ação");
        jPanel3.add(GeneroF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 290, 20));

        ClassF1.setBackground(new java.awt.Color(0, 0, 0));
        ClassF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF1.setForeground(new java.awt.Color(0, 255, 255));
        ClassF1.setText("CLASSIFICAÇÃO: 16 anos");
        jPanel3.add(ClassF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        NomeF1.setBackground(new java.awt.Color(0, 0, 0));
        NomeF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        NomeF1.setForeground(new java.awt.Color(0, 255, 255));
        NomeF1.setText("FILME: Infiltrado");
        jPanel3.add(NomeF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 290, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("FILME: O Protetor");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 260, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("FILME: Eu Acredito, com Deus Tudo É Possível");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 290, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("FILME: O Porteiro");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 290, 30));

        GeneroF2.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF2.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF2.setText("GÊNERO(S): Religioso");
        jPanel3.add(GeneroF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 290, 20));

        GeneroF3.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF3.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF3.setText("GÊNERO(S): Ação, Thriller");
        jPanel3.add(GeneroF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 260, 20));

        GeneroF4.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF4.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF4.setText("GÊNERO(S): Comédia");
        jPanel3.add(GeneroF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 280, 20));

        GeneroF5.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF5.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF5.setText("GÊNERO(S): Ação e Fantasia");
        jPanel3.add(GeneroF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 510, 260, 20));

        DuracaoF2.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF2.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF2.setText("DURAÇÃO: 1h 29min");
        jPanel3.add(DuracaoF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 290, 30));

        DuracaoF3.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF3.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF3.setText("DURAÇÃO: 2h 12min");
        jPanel3.add(DuracaoF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 290, 30));

        ClassF2.setBackground(new java.awt.Color(0, 0, 0));
        ClassF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF2.setForeground(new java.awt.Color(0, 255, 255));
        ClassF2.setText("CLASSIFICAÇÃO: 12 anos");
        jPanel3.add(ClassF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        ClassF3.setBackground(new java.awt.Color(0, 0, 0));
        ClassF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF3.setForeground(new java.awt.Color(0, 255, 255));
        ClassF3.setText("CLASSIFICAÇÃO: 16 anos");
        jPanel3.add(ClassF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, -1, -1));

        DuracaoF4.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF4.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF4.setText("DURAÇÃO: 1h 47min");
        jPanel3.add(DuracaoF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 290, 30));

        DuracaoF5.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF5.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF5.setText("DURAÇÃO: 2h 28min");
        jPanel3.add(DuracaoF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 540, 290, 30));

        ClassF4.setBackground(new java.awt.Color(0, 0, 0));
        ClassF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF4.setForeground(new java.awt.Color(0, 255, 255));
        ClassF4.setText("CLASSIFICAÇÃO: 14 anos");
        jPanel3.add(ClassF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, -1, -1));

        ClassF5.setBackground(new java.awt.Color(0, 0, 0));
        ClassF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF5.setForeground(new java.awt.Color(0, 255, 255));
        ClassF5.setText("CLASSIFICAÇÃO: 12 anos");
        jPanel3.add(ClassF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 580, 250, -1));

        Cadeiras2.setBackground(new java.awt.Color(0, 0, 0));
        Cadeiras2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeiras2.setForeground(new java.awt.Color(0, 255, 255));
        Cadeiras2.setText("CADEIRAS VAGAS: " + user.getRepoSessao().procurarSessao("IBelieve1600").getVagas() + " / " + user.getRepoSessao().procurarSessao("IBelieve1600").getSala().getCapacidade());
        jPanel3.add(Cadeiras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, -1, -1));

        Cadeira4.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira4.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira4.setText("CADEIRAS VAGAS: " + user.getRepoSessao().procurarSessao("Porteiro2000").getVagas() + " / " + user.getRepoSessao().procurarSessao("Porteiro2000").getSala().getCapacidade());
        jPanel3.add(Cadeira4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, -1, -1));

        Cadeira3.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira3.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira3.setText("CADEIRAS VAGAS: " + user.getRepoSessao().procurarSessao("Protetor1800").getVagas() + " / " + user.getRepoSessao().procurarSessao("Protetor1800").getSala().getCapacidade());
        jPanel3.add(Cadeira3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, -1));

        Cadeira5.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira5.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira5.setText("CADEIRAS VAGAS: " + user.getRepoSessao().procurarSessao("CivWa2200").getVagas() + " / " + user.getRepoSessao().procurarSessao("CivWa2200").getSala().getCapacidade());
        jPanel3.add(Cadeira5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 620, 240, -1));

        Cadeiras1.setBackground(new java.awt.Color(0, 0, 0));
        Cadeiras1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeiras1.setForeground(new java.awt.Color(0, 255, 255));
        Cadeiras1.setText("CADEIRAS VAGAS: " + user.getRepoSessao().procurarSessao("Infiltrado1400").getVagas() + " / " + user.getRepoSessao().procurarSessao("Infiltrado1400").getSala().getCapacidade());
        jPanel3.add(Cadeiras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1544, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreditosMostrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PainelCavi = new javax.swing.JButton();
        BotãoTicketNormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotãoTicketP = new javax.swing.JButton();
        BotãoTicketM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotãoTicketG = new javax.swing.JButton();
        BotãoComprar = new javax.swing.JButton();
        BotãoVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Filme1 = new javax.swing.JToggleButton();
        Filme2 = new javax.swing.JToggleButton();
        Filme3 = new javax.swing.JToggleButton();
        Filme4 = new javax.swing.JToggleButton();
        Filme5 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        DuracaoF1 = new javax.swing.JLabel();
        GeneroF1 = new javax.swing.JLabel();
        ClassF1 = new javax.swing.JLabel();
        NomeF1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GeneroF2 = new javax.swing.JLabel();
        GeneroF3 = new javax.swing.JLabel();
        GeneroF4 = new javax.swing.JLabel();
        GeneroF5 = new javax.swing.JLabel();
        DuracaoF2 = new javax.swing.JLabel();
        DuracaoF3 = new javax.swing.JLabel();
        ClassF2 = new javax.swing.JLabel();
        ClassF3 = new javax.swing.JLabel();
        DuracaoF4 = new javax.swing.JLabel();
        DuracaoF5 = new javax.swing.JLabel();
        ClassF4 = new javax.swing.JLabel();
        ClassF5 = new javax.swing.JLabel();
        Cadeiras2 = new javax.swing.JLabel();
        Cadeira4 = new javax.swing.JLabel();
        Cadeira3 = new javax.swing.JLabel();
        Cadeira5 = new javax.swing.JLabel();
        Cadeiras1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        CreditosMostrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreditosMostrar.setForeground(new java.awt.Color(0, 255, 204));
        CreditosMostrar.setText("CRÉDITOS:");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        PainelCavi.setText("\n");
        PainelCavi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        PainelCavi.setContentAreaFilled(false);
        PainelCavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PainelCaviActionPerformed(evt);
            }
        });

        BotãoTicketNormal.setText("15.00");
        BotãoTicketNormal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketNormalStateChanged(evt);
            }
        });
        BotãoTicketNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketNormalActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("TICKET NORMAL");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("TICKET + COMBO PEQUENO");

        BotãoTicketP.setText("20.00");
        BotãoTicketP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketPStateChanged(evt);
            }
        });
        BotãoTicketP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketPActionPerformed(evt);
            }
        });

        BotãoTicketM.setText("24.00");
        BotãoTicketM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketMStateChanged(evt);
            }
        });
        BotãoTicketM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketMActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TICKET + COMBO MÉDIO");

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("TICKET + COMBO GRANDE");

        BotãoTicketG.setText("31.00");
        BotãoTicketG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotãoTicketGStateChanged(evt);
            }
        });
        BotãoTicketG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoTicketGActionPerformed(evt);
            }
        });

        BotãoComprar.setBackground(new java.awt.Color(0, 0, 0));
        BotãoComprar.setForeground(new java.awt.Color(0, 255, 255));
        BotãoComprar.setText("COMPRAR");
        BotãoComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoComprarActionPerformed(evt);
            }
        });

        BotãoVoltar.setBackground(new java.awt.Color(0, 0, 0));
        BotãoVoltar.setForeground(new java.awt.Color(0, 255, 255));
        BotãoVoltar.setText("VOLTAR");
        BotãoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotãoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotãoComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotãoTicketM)
                                    .addComponent(BotãoTicketG, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BotãoTicketNormal)
                                        .addComponent(BotãoTicketP))))))
                    .addComponent(PainelCavi, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PainelCavi, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoTicketG, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotãoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreditosMostrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreditosMostrar)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CATÁLOGO");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Filme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemTeste/CAPA FILME.jpg"))); // NOI18N
        Filme1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme1StateChanged(evt);
            }
        });
        Filme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme1ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        Filme2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemTeste/capa filme 2.jpg"))); // NOI18N
        Filme2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme2.setContentAreaFilled(false);
        Filme2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme2StateChanged(evt);
            }
        });
        Filme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme2ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 10, -1, 430));

        Filme3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemTeste/capa filme 3.5.jpg"))); // NOI18N
        Filme3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme3.setContentAreaFilled(false);
        Filme3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme3StateChanged(evt);
            }
        });
        Filme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme3ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 11, 260, 430));

        Filme4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemTeste/paulinho gogo capa filme.jpg"))); // NOI18N
        Filme4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme4.setContentAreaFilled(false);
        Filme4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme4StateChanged(evt);
            }
        });
        Filme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme4ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 10, -1, 430));

        Filme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemTeste/capa filme 100.jpg"))); // NOI18N
        Filme5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Filme5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filme5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Filme5StateChanged(evt);
            }
        });
        Filme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme5ActionPerformed(evt);
            }
        });
        jPanel3.add(Filme5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 8, 270, 433));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("FILME: Capitão América: GC");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 470, 290, 30));

        DuracaoF1.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF1.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF1.setText("DURAÇÃO: 1h 59min");
        jPanel3.add(DuracaoF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 290, 30));

        GeneroF1.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF1.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF1.setText("GÊNERO(S): Ação");
        jPanel3.add(GeneroF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 290, 20));

        ClassF1.setBackground(new java.awt.Color(0, 0, 0));
        ClassF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF1.setForeground(new java.awt.Color(0, 255, 255));
        ClassF1.setText("CLASSIFICAÇÃO: 16 anos");
        jPanel3.add(ClassF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        NomeF1.setBackground(new java.awt.Color(0, 0, 0));
        NomeF1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        NomeF1.setForeground(new java.awt.Color(0, 255, 255));
        NomeF1.setText("FILME: Infiltrado");
        jPanel3.add(NomeF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 290, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("FILME: O Protetor");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 260, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("FILME: Eu Acredito, com Deus Tudo É Possível");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 290, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("FILME: O Porteiro");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 290, 30));

        GeneroF2.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF2.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF2.setText("GÊNERO(S): Religioso");
        jPanel3.add(GeneroF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 290, 20));

        GeneroF3.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF3.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF3.setText("GÊNERO(S): Ação, Thriller");
        jPanel3.add(GeneroF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 260, 20));

        GeneroF4.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF4.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF4.setText("GÊNERO(S): Comédia");
        jPanel3.add(GeneroF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 280, 20));

        GeneroF5.setBackground(new java.awt.Color(0, 0, 0));
        GeneroF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GeneroF5.setForeground(new java.awt.Color(0, 255, 255));
        GeneroF5.setText("GÊNERO(S): Ação e Fantasia");
        jPanel3.add(GeneroF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 510, 260, 20));

        DuracaoF2.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF2.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF2.setText("DURAÇÃO: 1h 29min");
        jPanel3.add(DuracaoF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 290, 30));

        DuracaoF3.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF3.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF3.setText("DURAÇÃO: 2h 12min");
        jPanel3.add(DuracaoF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 290, 30));

        ClassF2.setBackground(new java.awt.Color(0, 0, 0));
        ClassF2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF2.setForeground(new java.awt.Color(0, 255, 255));
        ClassF2.setText("CLASSIFICAÇÃO: 12 anos");
        jPanel3.add(ClassF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        ClassF3.setBackground(new java.awt.Color(0, 0, 0));
        ClassF3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF3.setForeground(new java.awt.Color(0, 255, 255));
        ClassF3.setText("CLASSIFICAÇÃO: 16 anos");
        jPanel3.add(ClassF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, -1, -1));

        DuracaoF4.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF4.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF4.setText("DURAÇÃO: 1h 47min");
        jPanel3.add(DuracaoF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 290, 30));

        DuracaoF5.setBackground(new java.awt.Color(0, 0, 0));
        DuracaoF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        DuracaoF5.setForeground(new java.awt.Color(0, 255, 255));
        DuracaoF5.setText("DURAÇÃO: 2h 28min");
        jPanel3.add(DuracaoF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 540, 290, 30));

        ClassF4.setBackground(new java.awt.Color(0, 0, 0));
        ClassF4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF4.setForeground(new java.awt.Color(0, 255, 255));
        ClassF4.setText("CLASSIFICAÇÃO: 14 anos");
        jPanel3.add(ClassF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, -1, -1));

        ClassF5.setBackground(new java.awt.Color(0, 0, 0));
        ClassF5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        ClassF5.setForeground(new java.awt.Color(0, 255, 255));
        ClassF5.setText("CLASSIFICAÇÃO: 12 anos");
        jPanel3.add(ClassF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 580, 250, -1));

        Cadeiras2.setBackground(new java.awt.Color(0, 0, 0));
        Cadeiras2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeiras2.setForeground(new java.awt.Color(0, 255, 255));
        Cadeiras2.setText("CADEIRAS VAGAS:");
        jPanel3.add(Cadeiras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, -1, -1));

        Cadeira4.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira4.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira4.setText("CADEIRAS VAGAS:");
        jPanel3.add(Cadeira4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, -1, -1));

        Cadeira3.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira3.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira3.setText("CADEIRAS VAGAS:");
        jPanel3.add(Cadeira3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, -1));

        Cadeira5.setBackground(new java.awt.Color(0, 0, 0));
        Cadeira5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeira5.setForeground(new java.awt.Color(0, 255, 255));
        Cadeira5.setText("CADEIRAS VAGAS:");
        jPanel3.add(Cadeira5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 620, 240, -1));

        Cadeiras1.setBackground(new java.awt.Color(0, 0, 0));
        Cadeiras1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        Cadeiras1.setForeground(new java.awt.Color(0, 255, 255));
        Cadeiras1.setText("CADEIRAS VAGAS:");
        jPanel3.add(Cadeiras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1544, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoComprarActionPerformed
        CompraRealizadaView Confirmed;
        ErroView error = null;
        String checador = "Erro Desconhecido!";
        UsuarioVector usuariosV = new UsuarioVector();
        UsuarioAbstrato[] usuarios = usuariosV.listar();
        for (UsuarioAbstrato usuario : usuarios){
            if(usuario.getLogin().equals(login)){
                if(this.opcaoTicket.equals("Normal")){
                    usuario.setTipoTicket("nulo");
                    checador = usuario.comprarTicket(sessaoEscolhida);
                    this.credito = usuario.getCredito();
                    usuariosV.addCredito(login, usuario.getCredito());
                }else{
                    checador = usuario.comprarTicket(sessaoEscolhida, this.opcaoTicket);
                    this.credito = usuario.getCredito();
                    usuariosV.addCredito(login, usuario.getCredito());
                }break;
            }
        }
        if(checador.equals("Sucesso")){
            user.getRepoSessao().cadeiraComprada(sessaoEscolhida.getCodigoSessao());
            Confirmed = new CompraRealizadaView();
            Confirmed.setVisible(true);
        }
        else{
            error = new ErroView("Falha na Compra!" + checador);
            error.setVisible(true);
        }
    }//GEN-LAST:event_BotãoComprarActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        ADMView TelaAdmin = new ADMView();
        MenuInicial TelaCatalogo = new MenuInicial(login, nome, idade, credito);      
        if(login.equals("AdminCinema"))
            TelaAdmin.setVisible(true);
        else
            TelaCatalogo.setVisible(true);            
        this.setVisible(false);
    }//GEN-LAST:event_BotãoVoltarActionPerformed
    
    private void BotãoTicketNormalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotãoTicketNormalStateChanged

    }//GEN-LAST:event_BotãoTicketNormalStateChanged

    private void BotãoTicketPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotãoTicketPStateChanged

    }//GEN-LAST:event_BotãoTicketPStateChanged

    private void BotãoTicketMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotãoTicketMStateChanged

    }//GEN-LAST:event_BotãoTicketMStateChanged

    private void BotãoTicketGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotãoTicketGStateChanged

    }//GEN-LAST:event_BotãoTicketGStateChanged

    private void BotãoTicketNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoTicketNormalActionPerformed
        this.opcaoTicket = "Normal";
    }//GEN-LAST:event_BotãoTicketNormalActionPerformed

    private void Filme5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Filme5StateChanged

    }//GEN-LAST:event_Filme5StateChanged

    private void Filme4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Filme4StateChanged

    }//GEN-LAST:event_Filme4StateChanged

    private void Filme3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Filme3StateChanged

    }//GEN-LAST:event_Filme3StateChanged

    public void setSessaoEscolhida(String codigo) {
        Sessao[] sessoes = new SessaoVector().listar();
        for (Sessao sessao : sessoes){
            if(sessao.getCodigoSessao().equals(codigo)){
                this.sessaoEscolhida = sessao;
            }
        }
    }
    
    private void Filme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme2ActionPerformed
        String codigo = "IBelieve1600";
        PainelCavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/capa filme 2.jpg")));
        this.setSessaoEscolhida(codigo);
    }//GEN-LAST:event_Filme2ActionPerformed

    private void Filme2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Filme2StateChanged

    }//GEN-LAST:event_Filme2StateChanged

    private void Filme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme1ActionPerformed
        String codigo = "Infiltrado1400";
        PainelCavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/CAPA FILME.jpg")));
        this.setSessaoEscolhida(codigo);
    }//GEN-LAST:event_Filme1ActionPerformed

    private void Filme1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Filme1StateChanged

    }//GEN-LAST:event_Filme1StateChanged

    private void PainelCaviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PainelCaviActionPerformed
        
    }//GEN-LAST:event_PainelCaviActionPerformed

    private void Filme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme3ActionPerformed
        String codigo = "Protetor1800";
        PainelCavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/CAPA FILME 3.5.jpg")));
        this.setSessaoEscolhida(codigo);
    }//GEN-LAST:event_Filme3ActionPerformed

    private void Filme4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme4ActionPerformed
        String codigo = "Porteiro2000";
        PainelCavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/paulinho gogo capa filme.jpg")));
        this.setSessaoEscolhida(codigo);
    }//GEN-LAST:event_Filme4ActionPerformed

    private void Filme5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme5ActionPerformed
        String codigo = "CivWa2200";
        PainelCavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covers/capa filme 100.jpg")));
        this.setSessaoEscolhida(codigo);
    }//GEN-LAST:event_Filme5ActionPerformed

    private void BotãoTicketPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoTicketPActionPerformed
        this.opcaoTicket = "CPequeno";
    }//GEN-LAST:event_BotãoTicketPActionPerformed

    private void BotãoTicketMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoTicketMActionPerformed
        this.opcaoTicket = "CMedio";
    }//GEN-LAST:event_BotãoTicketMActionPerformed

    private void BotãoTicketGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoTicketGActionPerformed
        this.opcaoTicket = "CGrande";
    }//GEN-LAST:event_BotãoTicketGActionPerformed


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatalogoBView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoBView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoBView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoBView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoView("a", "b", 12, 1f).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoComprar;
    private javax.swing.JButton BotãoTicketG;
    private javax.swing.JButton BotãoTicketM;
    private javax.swing.JButton BotãoTicketNormal;
    private javax.swing.JButton BotãoTicketP;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JLabel Cadeira3;
    private javax.swing.JLabel Cadeira4;
    private javax.swing.JLabel Cadeira5;
    private javax.swing.JLabel Cadeiras1;
    private javax.swing.JLabel Cadeiras2;
    private javax.swing.JLabel ClassF1;
    private javax.swing.JLabel ClassF2;
    private javax.swing.JLabel ClassF3;
    private javax.swing.JLabel ClassF4;
    private javax.swing.JLabel ClassF5;
    private javax.swing.JLabel CreditosMostrar;
    private javax.swing.JLabel DuracaoF1;
    private javax.swing.JLabel DuracaoF2;
    private javax.swing.JLabel DuracaoF3;
    private javax.swing.JLabel DuracaoF4;
    private javax.swing.JLabel DuracaoF5;
    private javax.swing.JToggleButton Filme1;
    private javax.swing.JToggleButton Filme2;
    private javax.swing.JToggleButton Filme3;
    private javax.swing.JToggleButton Filme4;
    private javax.swing.JToggleButton Filme5;
    private javax.swing.JLabel GeneroF1;
    private javax.swing.JLabel GeneroF2;
    private javax.swing.JLabel GeneroF3;
    private javax.swing.JLabel GeneroF4;
    private javax.swing.JLabel GeneroF5;
    private javax.swing.JLabel NomeF1;
    private javax.swing.JButton PainelCavi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
