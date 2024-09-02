package facade2;

/* Libro è una classe del sistema */
public class Libro {

  private String titolo;

  public Libro(int x) {
    if (x == 1) titolo = "Inferno";
    else titolo = "Paradiso";
  }

  public String getTitolo() {
    System.out.println("Libro: "+titolo);
    return titolo;
  }

  public String getAutore() {
    return "Dante";
  }

}
