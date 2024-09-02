package adapter;

public class DVD {
    boolean dvdPlaying;

    public DVD() {
        dvdPlaying = false;
    }

    public void playDVD() {
        dvdPlaying = true;
        System.out.println("DVD is playing on the TV");
    }
}
