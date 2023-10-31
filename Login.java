import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Login extends JFrame {
    private TextField campoUser;
    private JPasswordField campoSenha;
    private Color CorBotao = new Color(0, 32, 55);
    private List<Usuario> usuariosCadastrados;

    public Login() {
        super("CineFlop");

        setLayout(new BorderLayout());
        usuariosCadastrados = new ArrayList<>();

        campoUser = new TextField(10);
        campoSenha = new JPasswordField(10);
        JButton botaoLogin = new JButton("Login");
        JButton botaoCadastro = new JButton("Cadastro");

        JPanel painel = new JPanel(new GridLayout(4, 2));
        painel.add(new JLabel("Usuário: "));
        painel.add(campoUser);
        painel.add(new JLabel("Senha: "));
        painel.add(campoSenha);
        painel.add(new JLabel(""));
        painel.add(botaoLogin);
        painel.add(new JLabel(""));
        painel.add(botaoCadastro);

        painel.setBackground(Color.getHSBColor(12, -117, -243));
        botaoLogin.setBackground(CorBotao);
        botaoLogin.setForeground(Color.getHSBColor(12, -117, -243));
        botaoCadastro.setBackground(CorBotao);
        botaoCadastro.setForeground(Color.getHSBColor(12, -117, -243));

        add(painel, BorderLayout.CENTER);

        botaoLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = campoUser.getText();
                char[] senha = campoSenha.getPassword();

                if (user.isEmpty() || senha.length == 0) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else {
                    if (login(user, String.valueOf(senha))) {
                        JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Login falhou. Tente novamente.");
                    }

                    campoUser.setText("");
                    campoSenha.setText("");
                }
            }
        });

        botaoCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abre a janela de cadastro
                new Cadastro();
            }
        });

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public boolean cadastrarUsuario(String nome, String senha, int idade) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getNome().equals(nome)) {
                return false; // Já existe um usuário com esse nome
            }
        }

        Usuario novoUsuario = new Usuario(nome, senha, idade);
        usuariosCadastrados.add(novoUsuario);
        return true;
    }

    public boolean login(String nome, String senha) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                return true; // Login bem-sucedido
            }
        }
        return false; // Login falhou
    }

    public static void main(String[] args) {
        new Login();
    }
}

class Usuario {
    private String nome;
    private String senha;
    private int idade;

    public Usuario(String nome, String senha, int idade) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }
}

class Cadastro extends JFrame {
    private JTextField campoNovoUser;
    private JPasswordField campoNovaSenha;
    private JTextField campoIdade;

    public Cadastro() {
        super("Cadastro");

        setLayout(new BorderLayout());

        campoNovoUser = new JTextField(10);
        campoNovaSenha = new JPasswordField(10);
        campoIdade = new JTextField(10);
        JButton botaoCadastrar = new JButton("Cadastrar");

        JPanel painelCadastro = new JPanel(new GridLayout(4, 2));
        painelCadastro.add(new JLabel("Novo Usuário: "));
        painelCadastro.add(campoNovoUser);
        painelCadastro.add(new JLabel("Nova Senha: "));
        painelCadastro.add(campoNovaSenha);
        painelCadastro.add(new JLabel("Idade: "));
        painelCadastro.add(campoIdade);
        painelCadastro.add(new JLabel(""));
        painelCadastro.add(botaoCadastrar);

        add(painelCadastro, BorderLayout.CENTER);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String novoUser = campoNovoUser.getText();
                char[] novaSenha = campoNovaSenha.getPassword();
                String idadeStr = campoIdade.getText();

                if (novoUser.isEmpty() || novaSenha.length == 0 || idadeStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else {
                    try {
                        int idade = Integer.parseInt(idadeStr);

                        if (cadastrarNovoUsuario(novoUser, String.valueOf(novaSenha), idade)) {
                            JOptionPane.showMessageDialog(null, "Cadastro bem-sucedido!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Cadastro falhou. Tente novamente.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Idade inválida. Preencha com um número.");
                    }

                    campoNovoUser.setText("");
                    campoNovaSenha.setText("");
                    campoIdade.setText("");
                }
            }
        });

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public boolean cadastrarNovoUsuario(String nome, String senha, int idade) {
        for (Usuario usuario : Login.usuariosCadastrados) {
            if (usuario.getNome().equals(nome)) {
                return false; // Já existe um usuário com esse nome
            }
        }

        Usuario novoUsuario = new Usuario(nome, senha, idade);
        Login.usuariosCadastrados.add(novoUsuario);
        return true;
    }
}
