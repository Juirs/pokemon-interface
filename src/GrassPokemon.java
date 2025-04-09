import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("Grass");
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("leafStorm");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("solarBeam");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("leechSeed");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        attacks.add("leaveBlade");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

