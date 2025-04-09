import java.util.ArrayList;
import java.util.List;

public abstract class ElementalPokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public ElementalPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // Shared attack behavior
    protected void performAttack(Pokemon attacker, Pokemon defender, String attackName, String bonusTargetType) {
        attacks.add(attackName);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " + attackName);
        if (defender.getType().equalsIgnoreCase(bonusTargetType)) {
            System.out.println("Bonus damage due to " + bonusTargetType + " type!");
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
