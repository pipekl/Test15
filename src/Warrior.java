public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.health = 100;
        super.physAtt = 30;
        super.physDef = 0.2f;
        super.magicDef = 1.0f;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.physicalDefense(physAtt);
    }

    @Override
    public void physicalDefense(int phAtt) {
        setHealth(health - (int)(phAtt*physDef));
    }

    @Override
    public void magicalDefense(int magAtt) {
        setHealth(health - (int)(magAtt*magicDef));
    }
}
