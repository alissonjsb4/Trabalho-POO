package classesLogicas.Usuarios;
/**
 *
 * @author Rocha
 */
public class Usuario extends UsuarioAbstrato{
    
    public Usuario(String login, String nome, String senha, int idade){
        super(login, nome, senha, idade, false);
    }
}
