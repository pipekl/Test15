public abstract class Hero implements Defense {
    protected int health;
    protected int physAtt;
    protected float physDef;
    protected float magicDef;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 100)
            this.health = 100;
        else if (health < 0)
            this.health = 0;
        else
            this.health = health;
    }
}
