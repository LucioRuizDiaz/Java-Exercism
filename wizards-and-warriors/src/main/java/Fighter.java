class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {

        int damage = fighter.isVulnerable() ? 10 : 6;
        return damage;
    }
}

class Wizard extends Fighter {

    private boolean spell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    boolean prepareSpell() {
        this.spell = true;
        return spell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {

        int damage = spell ? 12 : 3;
        return damage;
    }

}
