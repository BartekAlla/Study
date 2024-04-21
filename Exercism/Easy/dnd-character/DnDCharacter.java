import java.util.*;

class DnDCharacter {
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }
    int ability(List<Integer> scores) {
        Integer min = Collections.min(scores);
        Integer result = 0;
        for (Integer i : scores) {
            result += i;
        }
        return result - min;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            rolls.add(rand.nextInt(6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return modifier(getConstitution()) + 10;
    }
}
