import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends ElementalPokemon {
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("water");
    }

    @Override
    protected List<String> getDefaultAttacks() {
        return Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 20, "surf", "fire");
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 35, "hydroPump", "fire");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 15, "hydroCanon", "fire");
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 32, "rainDance", "fire");
    }
}
