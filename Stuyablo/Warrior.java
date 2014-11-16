import java.util.Random;

public class Warrior extends Adventurer {
    private Random rand2 = new Random();
     private int rage1, rageLevels1;


  public Warrior() {
    this("Garen");
  }
  public Warrior(String name, int rageLevels, int STR) {
    super(name);
    this.setRage(rageLevels);
    this.setSTR(STR);
  }
  public Warrior(String name) {
    this(name, 30, 7);
  }
  
  public int getRage() {
    return rage1;
  }

  public void setRage(int rageLevels) {
    this.rage1 = rageLevels;
  }
  
  public String getStats() {
    return super.getStats() + "\tRage: " + this.getRage();
  }

  public void attack(Adventurer targetedFighter) {
           System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
       double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
    }
    int damage = rand2.nextInt(this.getSTR()) - 2;
    if (damage > 0 && Greg) {
      targetedFighter.setHP(targetedFighter.getHP() - damage);
       System.out.println(targetedFighter.getName() + " was hit by an uppercut from " +
this.getName() + " and took " + damage + " damage.");
    } else {
      System.out.println(targetedFighter.getName() + " was missed by " + this.getName());
    }

  }
  
  public void specialAttack(Adventurer targetedFighter) {
                 System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
     int damage = this.getSTR() + rand2.nextInt(this.getSTR()) - 2;
     double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
    }
    if (damage > 0 && Greg) {
      if (this.getRage() > damage) {
        targetedFighter.setHP(targetedFighter.getHP() - damage);
        this.setRage(this.getRage() - damage);
        System.out.println( targetedFighter.getName() + " was hit with a deadly throat punch, inflicting " + damage + " damage by " + this.getName());
      } else {
	  System.out.println(this.getName() + " does not have enough rage!");
        this.attack(targetedFighter);
      }
    } else {
	System.out.println( targetedFighter.getName() + " dogded the decapitation move of " + this.getName());
    }
  }

 public Adventurer Clone(){
	Adventurer ans = new Warrior();
      	ans.setName(this.getName());
	ans.setHP(this.getHP());
       	ans.setRage(this.getRage());
       	ans.setSTR(this.getSTR());

	return ans;
	
   }  
}
