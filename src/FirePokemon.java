import java.util.Arrays;
import java.util.List;

public class FirePokemon extends ElementalPokemon {
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("fire");
    }

    @Override
    protected List<String> getDefaultAttacks() {
        return Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 20, "inferno", "grass");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 35, "pyroBall", "grass");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 15, "fireLash", "grass");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 32, "flameThrower", "grass");
    }
}

