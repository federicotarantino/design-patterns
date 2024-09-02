package adapter;

public class AdapterDriver {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        System.out.println("Playing the DVD");
        DVD dvd = new DVD();
        dvdPlayer.playMovie(dvd);

        System.out.println("Playing the VHS");
        VHS vhs = new VHS();
        VHSAdapter adapter = new VHSAdapter(vhs);
        dvdPlayer.playMovie(adapter);
    }
}
