import java.util.ArrayList;
import java.util.List;

public abstract class ElementalPokemon extends Pokemon {
    private final List<String> attacks = new ArrayList<>();

    public ElementalPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        attacks.addAll(getDefaultAttacks());
    }

    protected abstract List<String> getDefaultAttacks();

    protected void performAttack(Pokemon attacker, Pokemon defender, int damage, String attackName, String bonusTargetType) {
        attacks.add(attackName);

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " + attackName);

        if (attackName.equalsIgnoreCase("rainDance")) {
            if(defender.getType().equalsIgnoreCase("electric")) {
                damage = 0;
                System.out.println(defender.getName() + " took " + damage + " damage");
                System.out.println("Rain Dance has no effect on " + defender.getName());
            }
            else if (defender.getType().equalsIgnoreCase("grass")) {
                defender.setHp(defender.getHp() + damage);
                System.out.println("Rain Dance healed " + defender.getName() + " for " + damage + "hp!");
                System.out.println(defender.getName() + " has " + defender.getHp() + " life points remaining");
            }
            else {
                System.out.println(defender.getName() + " took " + damage + " damage");
                defender.setHp(defender.getHp() - damage);
                System.out.println(defender.getName() + " has " + defender.getHp() + " life points remaining");
            }
        }

        else if (attackName.equalsIgnoreCase("thunder") && defender.getType().equalsIgnoreCase("electric")) {
            defender.setHp(defender.getHp() + damage);
            System.out.println("Thunder healed " + defender.getName() + " for " + damage + "hp!");
            System.out.println(defender.getName() + " has " + defender.getHp() + " life points remaining");
        }

        else if (attackName.equalsIgnoreCase("leechSeed")) {
            defender.setHp(defender.getHp() - damage);
            attacker.setHp(attacker.getHp() + damage);
            System.out.println(attacker.getName() + " Leeched " + damage + "hp from " + defender.getName());
            System.out.println(attacker.getName() + " has " + attacker.getHp() + " life points remaining");
            System.out.println(defender.getName() + " has " + defender.getHp() + " life points remaining");
        }

        else {
            if (defender.getType().equalsIgnoreCase(bonusTargetType)) {
                System.out.println("10 bonus damage due to " + bonusTargetType + " element!");
                damage += 10;
            }

            System.out.println(defender.getName() + " took " + damage + " damage");
            defender.setHp(defender.getHp() - damage);
            System.out.println(defender.getName() + " has " + defender.getHp() + " life points remaining");
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
