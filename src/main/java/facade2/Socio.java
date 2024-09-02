package facade2;

import java.util.Arrays;
import java.util.List;

/**
 * Socio verifica se un utente è registrato. Socio è una classe del sottosistema
 */
public class Socio {

  private final List<String> listaSoci = Arrays.asList("Alessio", "Daniela");

  public boolean verificaId(String nome) {
    System.out.println("Socio: controlla id "+nome);
    return listaSoci.contains(nome);
  }

}
