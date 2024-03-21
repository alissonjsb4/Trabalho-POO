package classesLogicas.Sistema.Excecoes.InterfaceExceptions;

/**
 *
 * @author josef
 */
public class SenhaFracaException extends Exception {
    public SenhaFracaException(String senha){
        super(verificarSenha(senha));
    }
    private static String verificarSenha(String senha){
        if (senha.length() < 8) {
            return("A senha deve ter no mínimo 8 caracteres.");
        }

        // Verificar se a senha contém pelo menos uma letra maiúscula
        if (!senha.matches(".*[A-Z].*")) {
            return("A senha deve conter pelo menos uma letra maiúscula.");
        }

        // Verificar se a senha contém pelo menos uma letra minúscula
        if (!senha.matches(".*[a-z].*")) {
            return("A senha deve conter pelo menos uma letra minúscula.");
        }

        // Verificar se a senha contém pelo menos um número
        if (!senha.matches(".*\\d.*")) {
            return("A senha deve conter pelo menos um número.");
        }
        return("");
    }
    
}
