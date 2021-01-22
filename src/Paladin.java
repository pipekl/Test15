public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin() {
        super.health = 100;
        super.physAtt = 15;
        super.physDef = 0.5f;
        super.magicDef = 0.8f;
    }

    @Override
    public void healHimself() {
        health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
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
