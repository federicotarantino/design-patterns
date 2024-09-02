package facade2;

/**
 * Registro implementa il ruolo Facade per il sottosistema formato da Prestiti,
 * Permessi e Socio. Registro verifica se una certa azione su libro (presta o leggi)
 * è autorizzata e registra i dati rilevanti
 */
public class Registro {

  private final Permessi perm = new Permessi();
  private final Socio so = new Socio();
  private static final Prestiti prt = new Prestiti();

  // notare che prestaLibro() chiama i metodi delle classi del sottosistema
  public boolean prestaLibro(String nome, Libro libro) {
    System.out.println("Registro: richiesta prestito");
    if (so.verificaId(nome) && perm.sePrestabile(nome)) {
      System.out.println("Registro: prestabile a "+nome);
      prt.registra(nome, libro.getTitolo());
      return true;
    }
    return false;
  }

  public boolean leggiLibro(Libro libro) {
    System.out.println("Registro: leggi");
    final String nomePers = prt.trovaPersona(libro.getTitolo());
    System.out.println("Registro: persona che ha in prestito il libro " + nomePers);
    return (so.verificaId(nomePers) && perm.seLeggibile(nomePers));
  }

}
