import java.util.Random;

public class Rogue extends Adventurer {
  private Random rand2 = new Random();
  private int staminaOrig1;
 

  public Rogue(String name, int stamina, int DEX) {
    super(name);
    this.setDEX(DEX);
    this.setStamina(stamina);
  }
   public Rogue(String name) {
    this(name, 30, 5);
  }
  
  public Rogue() {
    this("Brynhilde");
  } 
 
   public String getStats() {
    return super.getStats() + "\tStamina: " + this.getStamina();
  }

  public void setStamina(int stamina) {
    this.staminaOrig1 = stamina;
  }
  public int getStamina() {
    return this.staminaOrig1;
  }
  
  public void attack(Adventurer targetedFighter) {
       System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
      double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
    int damage = rand2.nextInt(this.getDEX());
    if (damage > 0 && Greg) {
      targetedFighter.setHP(targetedFighter.getHP() - damage);
      System.out.println(targetedFighter.getName() + " recieved " + damage + " damage from" + this.getName());
    } else {
      System.out.println(targetedFighter.getName() + " was almost slashed by " + "  but " + this.getName() + " missed.");
    }

    }}
  
  public void specialAttack(Adventurer targetedFighter) {
         System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
    int damage = this.getDEX() + rand2.nextInt(this.getDEX()) - 2;
    double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
     if ((damage > 0) && Greg) {
      if (this.getStamina() > damage) {
        if (rand2.nextInt(40) < this.getDEX()) {
          damage += 3 * this.getDEX();
        }
        targetedFighter.setHP(targetedFighter.getHP() - damage);
        this.setStamina(this.getStamina() - 8);
        System.out.println(this.getName() + "used a katana to inflict" + damage +
            " damage on " + targetedFighter.getName());

      } else {
	  System.out.println(this.getName() + " does not have enough stamina!");
        this.attack(targetedFighter);
      }
  } else {
      System.out.println(this.getName() + " tried to amputate " +
          targetedFighter.getName() + " but missed.");
    }
    }}
 public Adventurer Clone(){
	Adventurer ans = new Rogue();
      	ans.setName(this.getName());
	ans.setHP(this.getHP());

       	ans.setStamina(this.getStamina());
      	ans.setDEX(this.getDEX());

	return ans;
	
   }

}
