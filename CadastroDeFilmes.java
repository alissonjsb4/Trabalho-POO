import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDeFilmes {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Filme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setBackground(new Color(255, 165, 0));

        DefaultListModel<Filme> filmeListModel = new DefaultListModel<>();
        JList<Filme> filmeList = new JList<>(filmeListModel);
        JScrollPane filmeScrollPane = new JScrollPane(filmeList);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(9, 2, 10, 10));
        formularioPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        formularioPanel.setBackground(Color.WHITE);

        JTextField codigoField = new JTextField(20);
        codigoField.setBackground(Color.BLACK);
        codigoField.setForeground(Color.WHITE); 

        JTextField tituloField = new JTextField(20);
        tituloField.setBackground(Color.BLACK);
        tituloField.setForeground(Color.WHITE);

        JTextField diretorField = new JTextField(20);
        diretorField.setBackground(Color.BLACK);
        diretorField.setForeground(Color.WHITE);

        JTextField classificacaoField = new JTextField(20);
        classificacaoField.setBackground(Color.BLACK);
        classificacaoField.setForeground(Color.WHITE);

        JCheckBox is3DCheckBox = new JCheckBox("3D");
        is3DCheckBox.setBackground(Color.WHITE);
        is3DCheckBox.setForeground(Color.BLACK);

        JTextArea sinopseArea = new JTextArea(4, 20);
        sinopseArea.setBackground(Color.BLACK);
        sinopseArea.setForeground(Color.WHITE);

        JRadioButton legendadoRadio = new JRadioButton("Legendado");
        legendadoRadio.setBackground(Color.WHITE);
        legendadoRadio.setForeground(Color.BLACK);

        JRadioButton dubladoRadio = new JRadioButton("Dublado");
        dubladoRadio.setBackground(Color.WHITE);
        dubladoRadio.setForeground(Color.BLACK);

        JTextField duracaoField = new JTextField(20);
        duracaoField.setBackground(Color.BLACK);
        duracaoField.setForeground(Color.WHITE);

        ButtonGroup audioGroup = new ButtonGroup();
        audioGroup.add(legendadoRadio);
        audioGroup.add(dubladoRadio);

        JButton adicionarFilmeButton = new JButton("Adicionar Filme");
        adicionarFilmeButton.setBackground(Color.BLACK);
        adicionarFilmeButton.setForeground(Color.WHITE); 	

        adicionarFilmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = codigoField.getText();
                String titulo = tituloField.getText();
                String diretor = diretorField.getText();
                String classificacao = classificacaoField.getText();
                boolean is3D = is3DCheckBox.isSelected();
                String sinopse = sinopseArea.getText();
                String audio = legendadoRadio.isSelected() ? "Legendado" : "Dublado";
                String duracao = duracaoField.getText();

                
                if (codigo.isEmpty() || titulo.isEmpty() || diretor.isEmpty() || classificacao.isEmpty() || duracao.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    Filme novoFilme = new Filme(codigo, titulo, diretor, classificacao, is3D, sinopse, audio, duracao);
                    filmeListModel.addElement(novoFilme);

                    
                    codigoField.setText("");
                    tituloField.setText("");
                    diretorField.setText("");
                    classificacaoField.setText("");
                    is3DCheckBox.setSelected(false);
                    sinopseArea.setText("");
                    audioGroup.clearSelection();
                    duracaoField.setText("");
                }
            }
        });

        formularioPanel.add(new JLabel("Código:"));
        formularioPanel.add(codigoField);
        formularioPanel.add(new JLabel("Título:"));
        formularioPanel.add(tituloField);
        formularioPanel.add(new JLabel("Diretor:"));
        formularioPanel.add(diretorField);
        formularioPanel.add(new JLabel("Classificação:"));
        formularioPanel.add(classificacaoField);
        formularioPanel.add(new JLabel("3D:"));
        formularioPanel.add(is3DCheckBox);
        formularioPanel.add(new JLabel("Sinopse:"));
        formularioPanel.add(new JScrollPane(sinopseArea));
        formularioPanel.add(new JLabel("Áudio:"));
        formularioPanel.add(legendadoRadio);
        formularioPanel.add(new JLabel(""));
        formularioPanel.add(dubladoRadio);
        formularioPanel.add(new JLabel("Duração:"));
        formularioPanel.add(duracaoField);

        frame.setLayout(new BorderLayout());
        frame.add(formularioPanel, BorderLayout.NORTH);
        frame.add(adicionarFilmeButton, BorderLayout.SOUTH);
        frame.add(filmeScrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

class Filme {
    private String codigo;
    private String titulo;
    private String diretor;
    private String classificacao;
    private boolean is3D;
    private String sinopse;
    private String audio;
    private String duracao;

    public Filme(String codigo, String titulo, String diretor, String classificacao, boolean is3D, String sinopse, String audio, String duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.is3D = is3D;
        this.sinopse = sinopse;
        this.audio = audio;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: " + titulo + " | Diretor: " + diretor + " | Classificação: " + classificacao + " | 3D: " + (is3D ? "Sim" : "Não") + " | Duração: " + duracao;
    }
}
