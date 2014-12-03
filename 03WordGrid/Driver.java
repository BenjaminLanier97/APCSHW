public class Driver{

public static void main(String[] args) {
    if (args.length >  4) {
	System.out.println("Arguments are as follows:");
	  System.out.println("java WordGrid <rows> <cols> <seed> <filled>");
	return;
    }
    try {
	WordGrid w = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	w.setSeed(Integer.parseInt(args[2]));
	if (args.length > 3 && args[3].equals("0")) {
	    w.loadFromFile("words.txt", false);
	} else {
	    w.loadFromFile("words.txt", true);
	}
	System.out.println("Find these words");
	System.out.println(w.wordsInPuzzle());
	System.out.println(w.toString());
    }
    catch (Exception e) {
	System.out.println("Arguments are as follows:");
	  System.out.println("java WordGrid <rows> <cols> <seed> <filled>");
	e.printStackTrace();
    }
}
}
