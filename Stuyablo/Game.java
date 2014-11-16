import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    private int HP1, STR1, DEX1, INT1, Round, Decider5, Decider6;
   boolean YouWin = false;
     boolean Pathway = false;
     Random rand = new Random();
    Scanner input = new Scanner(System.in);
     Adventurer[] DataGroup = new Adventurer[3];
    Adventurer player114 = new Rogue();
    Adventurer[] Clones = new Adventurer[3];
    Adventurer OClone = null;
 
    Adventurer player = null;

  
  public static void out(String str) {
    System.out.println(str);
  }
 public void EndGame(){
    if (!YouWin) {
      out("You have been defeated. Your ancestors cower in shame.");
    } else {
      out("The Glory is yours, young charge, may the legend of your victory live long in Stuyablo 2.");
    }
    
    input.close();
    }
  
  public static void out(Adventurer adv) {
    System.out.println(adv.toString());
  }

 public static void main(String[] args) {  
     Game g = new Game();
     g.initializer();
}



  
 public void Combat(Adventurer[] Cris, Adventurer Cris1){
     Round = 0;
     Adventurer[] DataGroup = Cris;
     Adventurer O = Cris1;
     Pathway = true;
     boolean order2 = rand.nextBoolean();
	
	
    if (order2) {
      out("Your opponent attacked you first.");
      int  OAttack1 = rand.nextInt(4);
      if (OAttack1 < 2) {
        O.attack(DataGroup[1]);
      } else {
	 O.specialAttack(DataGroup[1]);
      }
    } else {
      out("You will  attack your opponent first.");
    }



 

     String AttackTechnique = "";
     while(((DataGroup[0]).getHP() > 0 || (DataGroup[1]).getHP() > 0 || (DataGroup[2]).getHP() > 0) && O.getHP() > 0) {
	 Round++;
	 out("Round:" + Round);
	 out(DataGroup[0].getStats());
	 out(DataGroup[1].getStats());
	 out(DataGroup[2].getStats());
	 out(O.getStats());

	out("What player do you choose to attack with?");
	out("a." + (DataGroup[0]).getName());
	out("b." + (DataGroup[1]).getName());
	out("c." + (DataGroup[2]).getName());


	       String PlaySel1 =  input.nextLine();
      while (!PlaySel1.equals("a") && !PlaySel1.equals("b") && PlaySel1.equals("c")) {
       PlaySel1 = input.nextLine();
        if (!PlaySel1.equals("a") && !PlaySel1.equals("b") && !PlaySel1.equals("c")) {
          out("Invalid action.");
        }
      }
      int Selection = -1;
      switch(PlaySel1) {
        case "a":
	    Selection = 0;
	    break;
        case "b":
          Selection = 1;
	   break;
        case "c":
          Selection = 2;
	   break;
      }
	
      out("What move do you choose?");
      out("a. Attack.");
      out("b. Special Attack");
      out("c. Surrender");


        String AttackTechnique1 = "";
      while (!AttackTechnique1.equals("a") && !AttackTechnique1.equals("b") && !AttackTechnique1.equals("c")) {
        AttackTechnique1 = input.nextLine();
        if (!AttackTechnique1.equals("a") && !AttackTechnique1.equals("b") && !AttackTechnique1.equals("c")) {
          out("Invalid action.");
        }
      }
            
      try {
    Thread.sleep(2000);               
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
      
      switch(AttackTechnique1) {
        case "a":
	    (DataGroup[Selection]).attack(O);
          break;
        case "b":
          (DataGroup[Selection]).specialAttack(O);
          break;
        case "c":
          (DataGroup[0]).setHP(0);
	  (DataGroup[1]).setHP(0);
	  (DataGroup[2]).setHP(0);
      }
     AttackTechnique1 = "";
     
     if (((DataGroup[0]).getHP() <= 0 || (DataGroup[1]).getHP() <= 0 || (DataGroup[2]).getHP() <= 0) && O.getHP() <= 0) {


	 if ((DataGroup[0]).getHP() <= 0 || (DataGroup[1]).getHP() <= 0 || (DataGroup[2]).getHP() <= 0){
	     YouWin = true;
	     }else {
	     YouWin = false;
	 }
       	this.EndGame();
        break;
     }
      
      int OAction = rand.nextInt(5);
      if (OAction < 3) {
	  O.specialAttack(DataGroup[Selection]);
      } else {
        O.attack(DataGroup[Selection]);
      }
     }    
 }
       
    public Adventurer UserGen(int AdDecider, String Name3){

	out("Enter each Stat individually, ensuring they are integers that sum to 30");
	out("First enter your hit points. You have 30 stat points remaining.");

	int HP = -1;

	
	String Stat135 = "";
	String Stat136 = "";
	int StatValue5 = -1;
	int StatValue6 = -1;

	
	switch(AdDecider) {
	case 0:
	    Stat135 = "Mana";
	    Stat136 = "Integrity";
	    break;
	case 1:
	    Stat135 = "Rage";
	    Stat136 = "Strength";
	    break;
	case 2:
	    Stat135 = "Stamina";
	    Stat136 = "Dexterity";
	    break;

	}
	

      boolean Jimmy = false;
      while (HP == -1) {
	 String StatSelect  = input.nextLine();
	for (int i = 0;i < 28;  i++) { 
	    if (StatSelect.equals(Integer.toString(i)) && (30 - i) > 0 ){
		 HP  = i;
		 Jimmy = true;
	    }
	}
	if (Jimmy){ break;} else {
	    out("Invalid input.");}
      }
    
	 out("Now enter your " +  Stat135 + ". You have " + (30 - HP) + " stat points remaining.");
	 
	 boolean Benjamin = false;
	    while (StatValue5 == -1) {
	 String StatSelect2  = input.nextLine();
	for (int i = 0;i < 28;  i++) { 
	    if (StatSelect2.equals(Integer.toString(i)) && (30 - (i+HP)) > 0 ){
		 StatValue5  = i;
		 Benjamin = true;
	    }
	}
	if (Benjamin) {break;} else {
	    out("Invalid input.");}
	    }

        
        
	 StatValue6 = (30 - (HP + StatValue5));
	 out("Your " + 	Stat136 + " has been set to " + StatValue6  + " to ensure the sum is 30.");


	 String ClassType = "";
	 Adventurer player = null;
	 switch(AdDecider) {
	case 0:
	    player = new Wizard(Name3, StatValue5, StatValue6);
	    ClassType = "Wizard";
	    Decider5 = 1;
        	Clones[0] = player.Clone();
	    break;
	case 1:
	    player = new Warrior(Name3, StatValue5, StatValue6);
	     ClassType = "Warrior";
	     	Clones[0] = player.Clone();
	     Decider5 = 2;
	    break;
	case 2:
	    player = new Rogue(Name3, StatValue5, StatValue6);
	    ClassType = "Rogue";
	    	Clones[0] = player.Clone();
	    Decider5 = 3;
	    break;

	}

	  

	  out("Welcome to Stuyablo 2 The Arena, " +  ClassType + " " + Name3 + ".");
	   
	  return player;
	      }


 public void initializer(){
    boolean Pathway = true;
    Adventurer player = null;
    // Adventurer[] DataGroup = new Adventurer[3];
    //Adventurer John = new Wizard("-1", 20, 15);
    //DataGroup[0] = John;

      out("Would you like a default Adventurer, a specific Adventurer type, or a Party?");
      out("a. Default");
      out("b.Specific Adventurer Type");
      out("c.Party");
      String class11 = "";

	  while (!class11.equals("a") && !class11.equals("b") && !class11.equals("c")){
      class11 = input.nextLine();
      if (!class11.equals("a") && !class11.equals("b") && !class11.equals("c")) {
        out("Invalid selection.");
      }
	   }
	        int Stat1 = 20 + rand.nextInt(7);
    int Stat2 = 10 + rand.nextInt(3);
 switch(class11){
   

 case "a":
     	   out("Name yourself!");
	  String Name = input.nextLine();
        player = new Warrior(Name, Stat1, Stat2);
	Clones[0] = player.Clone();
        out("Welcome to Stuyablo 2, Warrior " + Name + ".");
	Decider5 = 88;
        break;

 case "b":
     out("Do you want a default or customizable Adventurer?");
    out("a. Default");
    out("b. Customizable");

  
    String class24 = input.nextLine();;
    while (!class24.equals("a") && !class24.equals("b")){
      class24 = input.nextLine();
      if (!class24.equals("a") && !class24.equals("b")) {
        out("Invalid selection.");
      }
    }
    out("Select a class to play as.");
    out("a. Wizard.");
    out("b. Warrior.");
    out("c. Rogue.");
    out("d. Random.");
  
    String class1 = input.nextLine();;
    while (!class1.equals("a") && !class1.equals("b") && !class1.equals("c") && !class1.equals("d") && !class1.equals("e")){
      class1 = input.nextLine();
      if (!class1.equals("a") && !class1.equals("b") && !class1.equals("c") && !class1.equals("d") && !class1.equals("e")) {
        out("Invalid selection.");
      }
    }
    
   
  
  

    int Tri = 0;
    switch (class1) {
      case "a":
	  Tri = 1;
	   out("Name yourself!");
	   Name = input.nextLine();
	  switch(class24){
	  case "a":	
	      player = new Wizard(Name, Stat1, Stat2);
	      Clones[0] = player.Clone();
	      out("Welcome to Stuyablo 2, Wizard " + Name + ".");
	      Decider5 = 6;
	      break;
	  case "b":
	    player =  UserGen(0,Name);
	     Decider5 = 8;
		 break;
	  }
	  break;
      case "b":
	  Tri = 2;
 out("Name yourself!");
 Name = input.nextLine();

  break;
      case "c":
	  Tri = 3;
 out("Name yourself!");
 Name = input.nextLine();


 switch(class24){
 case "a":
       player = new Rogue(Name, Stat1, Stat2);
	Clones[0] = player.Clone();
        out("Welcome to Stuyablo 2, Rogue " + Name + ".");
	Decider5 = 7;
	break;
 case "b" :
 player = UserGen(2,Name);

     break;
 }
 break;
      case "d":
 out("Name yourself!");
 Name = input.nextLine();
        int RandomSelect = rand.nextInt(3);
	switch (RandomSelect) {

        case 0:
	 player = new Wizard(Name, Stat1, Stat2);
	     Clones[0] = player.Clone();
	    out("Welcome to Stuyablo 2, Wizard " + Name + ".");
	    Decider5 = 71;
	    break;
	case 1:
	      player = new Warrior(Name, Stat1, Stat2);
	      	Clones[0] = player.Clone();
	      out("Welcome to Stuyablo 2, Warrior " + Name + ".");
	      Decider5 = 72;
	      break;
	case 2:
	   player = new Rogue(Name, Stat1, Stat2);
        	Clones[0] = player.Clone();
	    out("Welcome to Stuyablo 2, Rogue " + Name + ".");
	    Decider5 = 73;
	    break;
	}
	break;

    }
    break;
 
 
      case "c":
	  out("Would you like a default party or a customizable party?");
	  out("a. Default");
	  out("b.Custom Party");
	   String class2 = "";

	  while (!class2.equals("a") && !class2.equals("b")){
      class2 = input.nextLine();
      if (!class2.equals("a") && !class2.equals("b")) {
        out("Invalid selection.");
      }
	  }
	  

	  switch(class2){
	      case "a":
		   out("Name yourself!");
		  Name = input.nextLine();
		  int Stat3 = 20 + rand.nextInt(7);
		  int Stat4 = 10 + rand.nextInt(3);
		  Wizard player2 = new Wizard("Egmardern", Stat3, Stat4);

		  int Stat5 = 20 + rand.nextInt(7);
		  int Stat6 = 10 + rand.nextInt(3);
		  Warrior player3 = new Warrior("Shadowbane", Stat5, Stat6);
		  
		  
		  int Stat7 = 20 + rand.nextInt(7);
		  int Stat8 = 10 + rand.nextInt(3);
		  Rogue player4 = new Rogue("Saflick", Stat7, Stat8);
		  
		  player2.setHP(30);
		  player3.setHP(30);
		  player4.setHP(30);

		  
		  
		  DataGroup[0] = player2;
		  DataGroup[1] = player3;
		  DataGroup[2] = player4;
	          Clones[0] = player2.Clone();
		  Clones[1] = player3.Clone();
		  Clones[2] = player4.Clone();


		 break;
	  case "b":
	      // Adventurer player2, player3, player4;
		  out(" Who would you want the first member of your party to be?");
		  out("a. Wizard.");
		  out("b. Warrior.");
		  out("c. Rogue.");

		   String class4 = "";
    while (!class4.equals("a") && !class4.equals("b") && !class4.equals("c")){
      class4 = input.nextLine();
      if (!class4.equals("a") && !class4.equals("b") && !class4.equals("c")) {
        out("Invalid selection.");
      }
    }
     out("Name yourself!");
    String Name1 = input.nextLine();
    Adventurer player11 = null;
   
    int Stat11 = 20 + rand.nextInt(7);
    int Stat22 = 10 + rand.nextInt(3); 
    switch (class4) {
      case "a":
	 player11 = new Wizard(Name1, Stat11, Stat22);
              out("Welcome to Stuyablo 2, Wizard " + Name1 + ".");
	      Decider5 = 74;
	      break;

      case "b":
       player11 = new Warrior(Name1, Stat11, Stat22);
               out("Welcome to Stuyablo 2, Warrior " + Name1 + ".");
	       Decider5 = 75;
	       break;
      case "c":
	   player11 = new Rogue(Name1, Stat11, Stat22);
               out("Welcome to Stuyablo 2, Rogue " + Name1 + ".");
	       Decider5 = 76;
	       break;
    }



		  out(" Who would you want the second member of your party to be?");
		  out("a. Wizard.");
		  out("b. Warrior.");
		  out("c. Rogue.");
		  		   String class5 = "";
    while (!class5.equals("a") && !class5.equals("b") && !class5.equals("c")){
      class5 = input.nextLine();
      if (!class5.equals("a") && !class5.equals("b") && !class5.equals("c")) {
        out("Invalid selection.");
      }
    }
     out("Name yourself!");
    String Name13 = input.nextLine();
    Adventurer player113 = null;
    int Stat113 = 20 + rand.nextInt(7);
    int Stat223 = 10 + rand.nextInt(3);
    switch (class5) {
      case "a":
    player113 = new Wizard(Name13, Stat113, Stat223);
        out("Welcome to Stuyablo 2, Wizard " + Name13 + ".");
	Decider5 = 77;
	break;

      case "b":
 player113 = new Warrior(Name13, Stat113, Stat223);
        out("Welcome to Stuyablo 2, Warrior " + Name13 + ".");
	Decider5 = 78;
      	break;
     
      case "c":
      player113 = new Rogue(Name13, Stat113, Stat223);
        out("Welcome to Stuyablo 2, Rogue " + Name13 + ".");
	Decider5 = 79;
	break;
    }

		  out(" Who would you want the third  member of your party to be?");
		  out("a. Wizard.");
		  out("b. Warrior.");
		  out("c. Rogue.");

		  		  		   String class6 = "";
    while (!class6.equals("a") && !class6.equals("b") && !class6.equals("c")){
      class6 = input.nextLine();
      if (!class6.equals("a") && !class6.equals("b") && !class6.equals("c")) {
        out("Invalid selection.");
      }
    }

   out("Name yourself!");
    String Name134 = input.nextLine();
 
    int Stat1134 = 20 + rand.nextInt(7);
    int Stat2234 = 10 + rand.nextInt(3);
    Adventurer player114 = null;
    switch (class6) {
      case "a":
               player114 = new Wizard(Name134, Stat1134, Stat2234);
               out("Welcome to Stuyablo 2, Wizard " + Name134 + ".");
	       Decider5 = 80;
	       break;

      case "b":
               player114 = new Warrior(Name134, Stat1134, Stat2234);
               out("Welcome to Stuyablo 2, Warrior " + Name134 + ".");
	       Decider5 = 81;
	       break;
      case "c":
              player114 = new Rogue(Name134, Stat1134, Stat2234);
               out("Welcome to Stuyablo 2, Rogue " + Name134 + ".");
	       Decider5 = 82;
	       break;
    }

		  player11.setHP(30);
		  player113.setHP(30);
		  player114.setHP(30);
		  	  
		  DataGroup[0] = player11;
		  DataGroup[1] = player113;
		  DataGroup[2] = player114;

		  Clones[0] = player11.Clone();
		  Clones[1] = player113.Clone();
		  Clones[2] = player114.Clone();
		  break;
	  }
	  break;
    
 }

    out("Your opponent has appeared.");
    int OSelect = rand.nextInt(3);
    int OStat1 = 20 + rand.nextInt(7);
    int OStat2 = 10 + rand.nextInt(3);
    Adventurer O = null;
   
    switch (OSelect) {
      case 0:
      O = new Wizard("Gaynor", OStat1, OStat2);
	OClone = O.Clone();
        out("You will now take on the Wizard " + O + ".");
	Decider6 = 5;
        break;
      case 1:
       O = new Warrior("Jzahlaren", OStat1, OStat2);
      	OClone = O.Clone();
        out("You will now take on the Warrior " + O + ".");
	Decider6 = 30;
        break;
      case 2:
     O = new Rogue("Meragrand", OStat1, OStat2);
	OClone = O.Clone();
        out("You will now take on the Rogue " + O + ".");
	Decider6 = 31;
    }
        

    if (Pathway) {
	   this.Combat(DataGroup,O);
        

	}
	    
    else{

	this.SingleCombat(player,O);
	

    }

 

 }

    public void SingleCombat(Adventurer player, Adventurer O ){
	Round = 0;
	this.player = player;



    boolean order = rand.nextBoolean();
    if (order) {
      out("Your opponent attacked you first.");
      int  OAttack = rand.nextInt(4);
      if (OAttack < 2) {
        O.attack(player);
      } else {
	 O.specialAttack(player);
      }
    } else {
      out("You will  attack your opponent first.");
    }
    
    String AttackTechnique = "";
    while(player.getHP() > 0 && O.getHP() > 0) {
      	 Round++;
	 out("Round:" + Round);
	 out(player.getStats());
	 out(O.getStats());
      out("What move do you choose?");
      out("a. Attack.");
      out("b. Special Attack");
      out("c. Surrender");
   
      
      while (!AttackTechnique.equals("a") && !AttackTechnique.equals("b") && !AttackTechnique.equals("c")) {
        AttackTechnique = input.nextLine();
        if (!AttackTechnique.equals("a") && !AttackTechnique.equals("b") && !AttackTechnique.equals("c")) {
          out("Invalid action.");
        }
      }
            try {
    Thread.sleep(2000);               
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
      
      switch(AttackTechnique) {
        case "a":
	    player.attack(O);
          break;
        case "b":
          player.specialAttack(O);
          break;
        case "c":
          player.setHP(0);
	  break;
      }
      
      
      if (O.getHP() <= 0 || player.getHP() <= 0) {
	  if (O.getHP() <= 0)
	      {YouWin =true;
	      }else
	      {YouWin =false;
	      }
        break;
      }
      
      int OAction = rand.nextInt(5);
      if (OAction < 3) {
	  O.specialAttack(player);
      } else {
        O.attack(player);
      }
      
      AttackTechnique = "";
    }

    this.Chooser();

    }


    public void Chooser(){


   out("Would you like to:");
    out("a. Play a new Game?");
    out("b.End the Game?");


      String Decider = "";
    while (!Decider.equals("a") && !Decider.equals("b")){
      Decider = input.nextLine();
      if (!Decider.equals("a") && !Decider.equals("b")) {
        out("Invalid selection.");
      }
    }

    switch(Decider){


    case "a":
    this.EndGame();
    break;

    case "b":
    if (Pathway) {
	   this.Combat(Clones,OClone);
	}
    else{
	this.SingleCombat(Clones[0],OClone);

    }


    }
    }
}
