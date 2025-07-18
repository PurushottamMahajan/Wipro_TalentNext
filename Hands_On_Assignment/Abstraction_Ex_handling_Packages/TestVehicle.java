import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero.getModelName());
        hero.radio();

        Honda honda = new Honda();
        System.out.println(honda.getModelName());
        honda.cdplayer();
    }
}