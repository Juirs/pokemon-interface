import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends ElementalPokemon {
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("Fire");
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, "Inferno", "Grass");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, "Pyro Ball", "Grass");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, "Fire Lash", "Grass");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, "Flame Thrower", "Grass");
    }
}

