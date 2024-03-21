/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesLogicas.Sistema.Excecoes.RepoExceptions;

/**
 *
 * @author Lessa
 */
public class SessaoEException extends Exception{
  public SessaoEException(String codigo) {
      super("Sessão com o código: " + codigo + "já existe.");
  }
}
