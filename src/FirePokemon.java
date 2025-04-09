import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public FirePokemon(String name, int atk, int hp, String food, String sound) {
        super(name, atk, hp, food, sound);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("Inferno");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("PyroBall");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("FireLash");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("FlameThrower");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
