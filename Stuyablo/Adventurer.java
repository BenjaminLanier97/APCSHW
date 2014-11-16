import java.util.Random;

public abstract class Adventurer {
  private String name1;
  private int staminaOrig1;
  private int mana2;
  private int rage1, rageLevels1;
  private int HP1, STR1, DEX1, INT1;
  private Random rand2 = new Random();
  
  public Adventurer() {
    this("Eirabourn");
  }
    
  public Adventurer(String name, int HP,
      int STR, int DEX, int INT) {
    this.setName(name);
    this.setHP(HP);
    this.setSTR(STR);
    this.setDEX(DEX);
    this.setINT(INT);
  }

  public Adventurer(String name) {
    this(name, 30, 0, 0, 0);
  }


  public int getHP() {
    return this.HP1;
  }

  public void setSTR(int STR) {
    this.STR1 = STR;
  }

  public int getDEX() {
    return this.DEX1;
  }
  
  public void setDEX(int DEX) {
    this.DEX1 = DEX;
  }

  public int getINT() {
    return this.INT1;
  }
 public void setINT(int INT) {
    this.INT1 = INT;
  }

  public void setHP(int HP) {
    this.HP1 = HP;
  }

  public int getSTR() {
    return this.STR1;
  }
  public String getName() {
    return this.name1;
  }

  public void setName(String name) {
    this.name1 = name;
  }


  public String toString() {
    return getName();
  }
 
  public void setMana(int mana) {
    this.mana2 = mana;
  }
  

  public int getMana() {
    return this.mana2;
  }

  public int getRage() {
    return rage1;
  }

  public void setRage(int rageLevels) {
    this.rage1 = rageLevels;
  }
 
  public void setStamina(int stamina) {
    this.staminaOrig1 = stamina;
  }
  public int getStamina() {
    return this.staminaOrig1;
  }
  
  public String getStats() {
    return this.getName() + 
        "\tHP: " + this.getHP() +
        "\tSTR: " + this.getSTR() +
        "\tDEX: " + this.getDEX() +
        "\tINT: " + this.getINT();
  }
  
  public void attack(Adventurer targetedFighter) {
                 System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
    int damage = rand2.nextInt(3);
    double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
    }
    if (damage > 0 && Greg) {
      targetedFighter.setHP(targetedFighter.getHP() - damage);
      System.out.println(targetedFighter.getName() + " recieved " + damage + " damage from " + this.getName());  
    } else {
      System.out.println(targetedFighter.getName() + " dodged the attack of " + this.getName());  
    }
  }
  
  public void specialAttack(Adventurer targetedFighter) {
                 System.out.println(this.getHP());
     System.out.println(targetedFighter.getHP());
    int damage = rand2.nextInt(7);
     double Ben = (this.getHP())/(targetedFighter.getHP());
     int John = rand2.nextInt(15);
     boolean Greg = false;
    if ((Ben * 30)  >= John){
     Greg = true;
    }
    if (damage > 0 && Greg) {
      targetedFighter.setHP(targetedFighter.getHP() - damage);
      System.out.println(targetedFighter.getName() + " recieved " + damage + " damage from " + (this.getName()) + " in a furious assault.");
    } else {
	System.out.println(targetedFighter.getName() + " was almost murdered by " + this.getName() +  " but the attempt failed.");  
    }
  }

    abstract Adventurer Clone();
}
