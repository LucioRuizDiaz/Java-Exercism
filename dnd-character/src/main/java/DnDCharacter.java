import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private int strength = this.ability(this.rollDice());
    private int dexterity = this.ability(this.rollDice());
    private int constitution = this.ability(this.rollDice());
    private int intelligence = this.ability(this.rollDice());
    private int wisdom = this.ability(this.rollDice());
    private int charisma = this.ability(this.rollDice());

    int ability(List<Integer> scores) {
        List<Integer> arrayDados = new ArrayList<>(scores);
        Collections.sort(arrayDados);
        int ability = 0;
        for (int i = 1; i < arrayDados.size(); i++) {
            ability += arrayDados.get(i);
        }
        return ability;

    }

    List<Integer> rollDice() {
        Random random = new Random();
        int dado1 = 1 + random.nextInt(5);
        int dado2 = 1 + random.nextInt(5);
        int dado3 = 1 + random.nextInt(5);
        int dado4 = 1 + random.nextInt(5);
        List<Integer> dados = List.of(dado1, dado2, dado3, dado4);

        return dados;
    }

    int modifier(int input) {
        return (int) Math.floorDiv((input - 10), 2);
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
        return 10 + this.modifier(this.constitution);
    }
}
