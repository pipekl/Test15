public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int magicAtt;

    public Shaman() {
        super.health = 100;
        super.physAtt = 10;
        super.physDef = 0.8f;
        super.magicDef = 0.8f;
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.magicalDefense(magicAtt);
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
