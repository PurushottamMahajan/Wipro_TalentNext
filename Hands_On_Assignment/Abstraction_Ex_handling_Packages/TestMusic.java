package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        v.play();
        s.play();

        Playable p1 = v;
        Playable p2 = s;
        p1.play();
        p2.play();
    }
}