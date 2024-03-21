package classesLogicas.Sistema.Excecoes.InterfaceExceptions;

/**
 *
 * @author josef
 */
public class LoginException extends Exception {
    
    public LoginException(String login, String senha) {
        super(verificarEspacos(login, senha));
    }
    public LoginException(String mensagem) {
        super(mensagem);
    }

    private static String verificarEspacos(String login, String senha) {
        StringBuilder errorMessage = new StringBuilder();

        if (login.equals("")) {
            errorMessage.append("Login não encontrado! ");
        }
        else if (senha.equals("")) {
            errorMessage.append("Senha não encontrada! ");
        }

        return errorMessage.toString().trim();
    }
}
