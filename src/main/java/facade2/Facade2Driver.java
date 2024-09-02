package facade2;

/** FacadeDriver è una classe Client che invoca i metodi del Facade Registro */
public class Facade2Driver {

  private static Libro l1 = new Libro(1);
  private static Libro l2 = new Libro(2);
  private static String nome = "Alessio";
  private static Registro r = new Registro();

  public static void main(String[] args) {
    presta(l1);
    presta(l2);
    leggi(l1);
  }

  public static void presta(Libro lib) {
    if (r.prestaLibro(nome, lib))
      System.out.println("Prestito registrato");
  }

  public static void leggi(Libro lib) {
    if (r.leggiLibro(lib))
      System.out.println(nome+" legge "+lib.getTitolo());
  }

}
