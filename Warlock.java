public class Warlock extends Character {
    Warlock(String name,int healthPoints,int level,int manaPoints) {
        super(name);
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }

    public void criticalForce(Character turnCharacter, Character enemyCharacter) {
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Critical Force!\n" + enemyCharacter.characterName + " receives 70 damage!");
        int manaCost = 90;
        int damagePoints = 70;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }

    public void frostBite(Character turnCharacter, Character enemyCharacter) {
        System.out.println("\n"+super.characterName + " casts Frostbite to " + enemyCharacter.characterName + "!\n" + enemyCharacter.characterName + " receives 45 damage!");
        int manaCost = 58;
        int damagePoints = 45;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }

    public void theGift(Character turnCharacter) {
        System.out.println("\n"+super.characterName + " used The Gift!\n" + super.characterName + "restores 400mp and 200 hp!");
        recover(turnCharacter);
    }
}