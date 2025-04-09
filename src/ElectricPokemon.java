import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends ElementalPokemon {
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("electric");
    }

    @Override
    protected List<String> getDefaultAttacks() {
        return Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 20, "thunderPunch", "water");
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 35, "electroBall", "water");
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 15, "thunder", "water");
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        performAttack(pokemon, gymPokemon, 32, "voltTackle", "water");
    }
}
