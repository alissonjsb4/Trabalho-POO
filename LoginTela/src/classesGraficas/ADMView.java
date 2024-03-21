package classesGraficas;


import classesLogicas.Recursos.Filme;
import classesLogicas.Recursos.Sala;
import classesLogicas.Recursos.Ticket;
import classesLogicas.Sistema.repo.FilmeVector;
import classesLogicas.Sistema.repo.SalaVector;
import classesLogicas.Sistema.repo.SessaoVector;
import classesLogicas.Sistema.repo.TicketVector;
import classesLogicas.Sistema.repo.UsuarioVector;
import classesLogicas.Usuarios.AdminUser;

/*
 * @author josef
 */
public class ADMView extends javax.swing.JFrame {
    private AdminUser user;
    private transient TicketVector tickets;
    private String tipo;
    private int normal, pequeno, medio, grande;
    
    public ADMView(){
        FilmeVector filmesV = new FilmeVector();
        SalaVector salasV = new SalaVector();
        SessaoVector sessoesV = new SessaoVector();
        UsuarioVector usuariosV = new UsuarioVector();
        user = new AdminUser(filmesV, salasV, sessoesV, usuariosV);
        
        tickets = new TicketVector();
        Ticket[] ticketsA = tickets.listar();
        for(Ticket ticket : ticketsA){
            tipo = ticket.getTipo();
            switch(tipo){
                case "Normal":
                    normal++;
                    break;
                case "CPequeno":
                    pequeno++;
                    break;
                case "CMedio":
                    medio++;
                    break;
                case "CGrande":
                    grande++;
                    break;
            }
        }
        
        jPanel1 = new javax.swing.JPanel();
        CatalogoBotão = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotãoSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AdicionarFilme = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        CódigoFilme = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SinopseFilme = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ClassificaçãoFilme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        GêneroFilme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TítuloFilme = new javax.swing.JTextField();
        DuraçãoFilme = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SalaSessao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        HorarioSessao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CodigoSessao = new javax.swing.JTextField();
        CodigoFSessao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        AdicionarSessão = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CatalogoBotão.setBackground(new java.awt.Color(0, 0, 0));
        CatalogoBotão.setForeground(new java.awt.Color(0, 255, 255));
        CatalogoBotão.setText("CATÁLOGO");
        CatalogoBotão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoBotãoActionPerformed(evt);
            }
        });

        jLabel1.setText("BEM VINDO ADMINISTRADOR");

        BotãoSair.setBackground(new java.awt.Color(0, 0, 0));
        BotãoSair.setForeground(new java.awt.Color(0, 255, 255));
        BotãoSair.setText("SAIR");
        BotãoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addComponent(CatalogoBotão, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(CatalogoBotão, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BotãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 450, 270));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("ADICIONAR CAPA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 100, -1));

        AdicionarFilme.setBackground(new java.awt.Color(0, 0, 0));
        AdicionarFilme.setForeground(new java.awt.Color(0, 255, 255));
        AdicionarFilme.setText("ADICIONAR FILME");
        AdicionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarFilmeActionPerformed(evt);
            }
        });
        jPanel2.add(AdicionarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, 48));

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 51, 51));
        jToggleButton1.setText("+");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 292, 438));
        jPanel2.add(CódigoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 320, -1));

        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("CÓDIGO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("DURAÇÃO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));
        jPanel2.add(SinopseFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 320, -1));

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("SINOPSE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));
        jPanel2.add(ClassificaçãoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 320, -1));

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CLASSIFICAÇÃO INDICATIVA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        jPanel2.add(GêneroFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 320, -1));

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("GÊNERO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TÍTULO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        TítuloFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TítuloFilmeActionPerformed(evt);
            }
        });
        jPanel2.add(TítuloFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 320, -1));
        jPanel2.add(DuraçãoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 320, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/LOGOCTADM.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 250, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 1090, 500));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("FINANÇAS");

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("TICKET NORMAL:" + normal);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setText("TICKET + COMBO PEQUENO:" + pequeno);

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 255, 255)); // I18N
        jTextField12.setText("TOTAL ARRECADADO:" + (15*normal + 20*pequeno + 24*medio + 31*grande));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 255));
        jLabel16.setText("TICKET + COMBO GRANDE:" + grande);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("TICKET + C. MÉDIO:" + medio);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(104, 104, 104))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 450, 500));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("SALA");

        SalaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaSessaoActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("HORÁRIO DE EXIBIÇÃO");

        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("CÓDIGO");

        jLabel19.setForeground(new java.awt.Color(0, 255, 255));
        jLabel19.setText("CÓDIGO DO FILME");

        AdicionarSessão.setBackground(new java.awt.Color(0, 0, 0));
        AdicionarSessão.setForeground(new java.awt.Color(0, 255, 255));
        AdicionarSessão.setText("ADICIONAR SESSÃO");
        AdicionarSessão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarSessãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HorarioSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(SalaSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(CodigoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoFSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(AdicionarSessão, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalaSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorarioSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoFSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdicionarSessão, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 450, 270));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 640, -1));

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CatalogoBotão = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotãoSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AdicionarFilme = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        CódigoFilme = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SinopseFilme = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ClassificaçãoFilme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        GêneroFilme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TítuloFilme = new javax.swing.JTextField();
        DuraçãoFilme = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SalaSessao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        HorarioSessao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CodigoSessao = new javax.swing.JTextField();
        CodigoFSessao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        AdicionarSessão = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CatalogoBotão.setBackground(new java.awt.Color(0, 0, 0));
        CatalogoBotão.setForeground(new java.awt.Color(0, 255, 255));
        CatalogoBotão.setText("CATÁLOGO");
        CatalogoBotão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoBotãoActionPerformed(evt);
            }
        });

        jLabel1.setText("BEM VINDO ADMINISTRADOR");

        BotãoSair.setBackground(new java.awt.Color(0, 0, 0));
        BotãoSair.setForeground(new java.awt.Color(0, 255, 255));
        BotãoSair.setText("SAIR");
        BotãoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addComponent(CatalogoBotão, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(CatalogoBotão, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BotãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 450, 270));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("ADICIONAR CAPA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 100, -1));

        AdicionarFilme.setBackground(new java.awt.Color(0, 0, 0));
        AdicionarFilme.setForeground(new java.awt.Color(0, 255, 255));
        AdicionarFilme.setText("ADICIONAR FILME");
        AdicionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarFilmeActionPerformed(evt);
            }
        });
        jPanel2.add(AdicionarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, 48));

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 51, 51));
        jToggleButton1.setText("+");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 292, 438));
        jPanel2.add(CódigoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 320, -1));

        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("CÓDIGO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("DURAÇÃO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));
        jPanel2.add(SinopseFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 320, -1));

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("SINOPSE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));
        jPanel2.add(ClassificaçãoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 320, -1));

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CLASSIFICAÇÃO INDICATIVA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        jPanel2.add(GêneroFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 320, -1));

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("GÊNERO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TÍTULO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        TítuloFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TítuloFilmeActionPerformed(evt);
            }
        });
        jPanel2.add(TítuloFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 320, -1));
        jPanel2.add(DuraçãoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 320, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LOGOCTADM.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 250, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 1090, 500));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("FINANÇAS");

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("TICKET NORMAL:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setText("TICKET + COMBO PEQUENO:");

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 255, 255));
        jTextField12.setText("TOTAL ARRECADADO:");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 255));
        jLabel16.setText("TICKET + COMBO GRANDE:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("TICKET + COMBO MÉDIO:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(104, 104, 104))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 450, 500));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("SALA");

        SalaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaSessaoActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("HORÁRIO DE EXIBIÇÃO");

        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("CÓDIGO");

        jLabel19.setForeground(new java.awt.Color(0, 255, 255));
        jLabel19.setText("CÓDIGO DO FILME");

        AdicionarSessão.setBackground(new java.awt.Color(0, 0, 0));
        AdicionarSessão.setForeground(new java.awt.Color(0, 255, 255));
        AdicionarSessão.setText("ADICIONAR SESSÃO");
        AdicionarSessão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarSessãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HorarioSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(SalaSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(CodigoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoFSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(AdicionarSessão, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalaSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorarioSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoFSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdicionarSessão, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 450, 270));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TítuloFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TítuloFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TítuloFilmeActionPerformed

    private void CatalogoBotãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogoBotãoActionPerformed
        CatalogoView TelaCatalogo = new CatalogoView(user.getLogin(), user.getNome(), user.getIdade(), user.getCredito());
        this.setVisible(false);
        TelaCatalogo.setVisible(true);
    }//GEN-LAST:event_CatalogoBotãoActionPerformed

    private void AdicionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarFilmeActionPerformed
        String codigo = CódigoFilme.getText();
        String titulo = TítuloFilme.getText();
        String genero = GêneroFilme.getText();
        int classificacao = Integer.parseInt(ClassificaçãoFilme.getText());
        String sinopse = SinopseFilme.getText();
        int duracao = Integer.parseInt(DuraçãoFilme.getText());
        String check = user.criarFilme(codigo, titulo, "unknown", genero, classificacao, sinopse, duracao);
        if(!check.equals("criado")){
            ErroView erro = new ErroView(check);
            erro.setVisible(true);
        }
    }//GEN-LAST:event_AdicionarFilmeActionPerformed

    private void AdicionarSessãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarSessãoActionPerformed
        int salaID = -329;
        try{
            salaID = Integer.parseInt(SalaSessao.getText());
        } catch(NumberFormatException ex){}
        
        String codigo = CodigoSessao.getText();
        Filme filme = user.getRepoFilme().procurarFilme(CodigoFSessao.getText());
        String horario = HorarioSessao.getText();
        Sala sala = user.getRepoSala().procurarSala(salaID);
        String check = user.criarSessao(codigo, filme, false, "Dublado", horario, sala, 15);
        if(!check.equals("criado")){
            ErroView erro = new ErroView(check);
            erro.setVisible(true);
        }        
    }//GEN-LAST:event_AdicionarSessãoActionPerformed

    private void SalaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaSessaoActionPerformed
 
    }//GEN-LAST:event_SalaSessaoActionPerformed

    private void BotãoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoSairActionPerformed
        LoginView TelaLogin = new LoginView();
        this.setVisible(false);
        TelaLogin.setVisible(true);
    }//GEN-LAST:event_BotãoSairActionPerformed

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
            java.util.logging.Logger.getLogger(ADMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarFilme;
    private javax.swing.JButton AdicionarSessão;
    private javax.swing.JButton BotãoSair;
    private javax.swing.JButton CatalogoBotão;
    private javax.swing.JTextField ClassificaçãoFilme;
    private javax.swing.JTextField CodigoFSessao;
    private javax.swing.JTextField CodigoSessao;
    private javax.swing.JTextField CódigoFilme;
    private javax.swing.JTextField DuraçãoFilme;
    private javax.swing.JTextField GêneroFilme;
    private javax.swing.JTextField HorarioSessao;
    private javax.swing.JTextField SalaSessao;
    private javax.swing.JTextField SinopseFilme;
    private javax.swing.JTextField TítuloFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
