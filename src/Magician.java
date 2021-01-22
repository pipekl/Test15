public class Magician extends Hero  implements PhysAttack, MagicAttack {
    private int magicAtt;

    public Magician() {
        super.health = 100;
        super.physAtt = 5;
        super.physDef = 1.0f;
        super.magicDef = 0.2f;
        this.magicAtt = 20;
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
