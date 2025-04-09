import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("Water");
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("surf");
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("hydroPump");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("hydroCanon");
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("rainDance");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
