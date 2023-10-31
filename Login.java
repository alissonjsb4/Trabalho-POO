import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private TextField campoUser;
    private JPasswordField campoSenha;
    private Color CorBotao = new Color(0, 32, 55);
    
    public Login(){
        super("CineFlop");

        setLayout(new BorderLayout());
        

        campoUser = new TextField(10);
        campoSenha = new JPasswordField(10);
        JButton botaologin = new JButton("Login");

        JPanel painel = new JPanel(new GridLayout(3, 2));
        painel.add(new JLabel("Usuário: "));
        painel.add(campoUser);
        painel.add(new JLabel("Senha: "));
        painel.add(campoSenha);
        painel.add(new JLabel(""));
        painel.add(botaologin);
        
        painel.setBackground(Color.getHSBColor(12, -117, -243));
        botaologin.setBackground(CorBotao);
        botaologin.setForeground(Color.getHSBColor(12, -117, -243));
        

        add(painel, BorderLayout.CENTER);

        botaologin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = campoUser.getText();
                char[] senha = campoSenha.getPassword();

                if (user.equals("usuario") && String.valueOf(senha).equals("senha")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login falhou. Tente novamente.");
                }

                campoUser.setText("");
                campoSenha.setText("");
            }
        });

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login();
            }
        });
    }
}
