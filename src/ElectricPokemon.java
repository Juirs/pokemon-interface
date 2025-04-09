import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("Thunder Punch");
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("Electro Ball");
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("Thunder");
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("Volt Tackle");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
