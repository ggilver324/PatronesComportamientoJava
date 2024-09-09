package strategy;

public class TestStrategy {

    public static void main(String[] args){

        Player player = new Player("Player I");
        Enemy enemy = new Enemy("Enemy I");
        enemy.attack(player);
        System.out.println("============================");
        enemy.setAttackStrategy((new WarriorAttack()));
        enemy.attack(player);
        System.out.println("============================");
        enemy.setAttackStrategy((new MageAttack()));
        enemy.attack(player);
    }
}
