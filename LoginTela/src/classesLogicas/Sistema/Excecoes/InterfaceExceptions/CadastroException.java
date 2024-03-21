package classesLogicas.Sistema.Excecoes.InterfaceExceptions;

/**
 *
 * @author josef
 */
public class CadastroException extends Exception {
    
    public CadastroException(String login, String nome, String senha, int idade) {
        super(verificarEspacos(login, nome, senha, idade));
    }

    private static String verificarEspacos(String login, String nome, String senha, int idade) {
        StringBuilder errorMessage = new StringBuilder();

        if (nome.equals("")) {
            errorMessage.append("Nome não encontrado! ");
        }
        else if (login.equals("")) {
            errorMessage.append("Login não encontrado! ");
        }
        else if (senha.equals("")) {
            errorMessage.append("Senha não encontrada! ");
        }
        else if (idade == 0) {
            errorMessage.append("Idade inválida! ");
        }

        return errorMessage.toString().trim();
    }
}
