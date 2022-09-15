package Encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player Knocked Out");
            // reduce the number of lives remain for the player.
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
