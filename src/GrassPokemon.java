import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends ElementalPokemon {
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("grass");
    }

    @Override
    protected List<String> getDefaultAttacks() {
        return Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 20, "leafStorm", "electric");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 35, "solarBeam", "electric");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 22, "leechSeed", "electric");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 32, "leaveBlade", "electric");
    }
}

