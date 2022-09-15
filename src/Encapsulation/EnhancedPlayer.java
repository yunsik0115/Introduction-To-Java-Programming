package Encapsulation;

public class EnhancedPlayer {

    // All fields Access Modifier has changed from public to private
    // Compared to Original Player Class
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player Knocked out");
            // reduce the nubmer of lives remain for the player
        }
    }

    public int getHealth(){
        return hitPoints;
    }


}
