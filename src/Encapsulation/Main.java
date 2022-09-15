package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.fullName = "Tim"; // Can be Accessed directly while EnchancedPlayer's Info must be declared within Constructor.
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player2 = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player2.getHealth());
    }
}
