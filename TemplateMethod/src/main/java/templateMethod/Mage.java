package templateMethod;

public class Mage extends EnemyTemplate{

    @Override
    public void setSkills() {
        System.out.println("Health 100, Mana 100, Stamina 50");
    }

    @Override
    public void attack() {
        System.out.println("mage attack");

    }

    @Override
    public void protect() {
        System.out.println("mage protect");

    }

    @Override
    public void result() {
        System.out.println("mage has survived");

    }
}
