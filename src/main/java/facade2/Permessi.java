package facade2;

import java.util.Arrays;
import java.util.List;

/**
 * Permessi implementa le regole per la convalida dei prestiti e delle letture di libri.
 * Permessi è una classe del sottosistema
 */
public class Permessi {
  // autorizzati alla lettura
  private final List<String> lettura = Arrays.asList("Alessio", "Bruno", "Chiara", "Daniela");
  // autorizzati ai prestiti
  private final List<String> prestito = Arrays.asList("Alessio", "Bruno");

  public boolean seLeggibile(String nomePers) {
    System.out.println("Permessi: verifica regola lettura");
    return lettura.contains(nomePers);
  }

  public boolean sePrestabile(String nomePers) {
    System.out.println("Permessi: verifica regole prestito");
    return prestito.contains(nomePers);
  }
}
