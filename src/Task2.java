public class Task2 {

    public static void main(String[] args) {
        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Magician mag = new Magician();
        Shaman sha = new Shaman();

	System.out.println("Git test")
        war.physicalAttack(pal);
        System.out.println("Паладин: " + pal.health);

        pal.physicalAttack(mag);
        System.out.println("Маг: " + mag.health);

        sha.healTeammate(mag);
        System.out.println("Маг: " + mag.health);

        mag.magicalAttack(pal);
        System.out.println("Паладин: " + pal.health);

        sha.physicalAttack(war);
        System.out.println("Воин: " + war.health);

        pal.healHimself();
        System.out.println("Паладин: " + pal.health);

        for (int i = 0; i < 5; i++) {
            war.physicalAttack(mag);
            System.out.println("Маг: " + mag.health);
        }
    }
}
