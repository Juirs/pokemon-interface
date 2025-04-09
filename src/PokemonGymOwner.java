import java.util.List;

public class PokemonGymOwner {
    private final String town;
    private final String name;
    private final List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.town = town;
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
