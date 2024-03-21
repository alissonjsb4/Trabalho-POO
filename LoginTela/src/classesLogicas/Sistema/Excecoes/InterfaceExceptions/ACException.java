package classesLogicas.Sistema.Excecoes.InterfaceExceptions;

/*
 * @author josef

 */
//adicionarCreditoException
public class ACException extends Exception {
    public ACException(double credito) {
        super("Valor Negativo!");
    }
}
