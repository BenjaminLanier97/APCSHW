import java.util.Random;

public class Wizard extends Adventurer {
  private Random rand2 = new Random();
  private int mana2;

    
  
  public Wizard(String name, int mana, int INT) {
    super(name);
    this.setMana(mana);
    this.setINT(INT);
  }

  public Wizard() {
    this("Ryze");
  }
  
  public Wizard(String name) {
    this(name, 30, 10);
  }

  public void setMana(int mana) {
    this.mana2 = mana;
  }
  
  public String getStats() {
    return super.getStats() + "\tMana: " + this.getMana();
  }
  
  public int getMana() {
    return this.mana2;
  }


  
 public void specialAttack(Adventurer targetedFighter) {
     System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
     int Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
 }
     int damage = this.getINT() + 3 * (rand2.nextInt(this.getINT()) - 2);
    if ((damage > 0) && Greg)  
    {if (this.getMana() > damage) {
        targetedFighter.setHP(targetedFighter.getHP() - damage);
        this.setMana(this.getMana() - damage);
        System.out.println(targetedFighter.getName() + " recieved " + damage + " damage from " + this.getName() + " from a fireball.");
      } else {
        System.out.println(this + " does not have enough mana!");
        this.attack(targetedFighter);
      }
    } else {
      System.out.println(targetedFighter.getName() +  " was almost bombarded by but " + this.getName() + "  missed.");
    }
 }


 public Adventurer Clone(){
	Adventurer ans = new Wizard();
      	ans.setName(this.getName());
	ans.setHP(this.getHP());

        ans.setMana(this.getMana());
       	ans.setINT(this.getINT());


	return ans;
	
   }

}
