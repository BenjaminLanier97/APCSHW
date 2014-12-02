import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordGrid{
    private Random R1 = new Random();
    private char[][]data;
    private int rows, cols;
    private ArrayList<String> WordAddition = new ArrayList<String>();

    public WordGrid(){
    	this.WordGrid(10,8);
    
    }
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	data[i][z] = ' ';
}
}
	
	
    }

    private void clear(){
	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	data[i][z] = ' ';
}
}
    }

    //check

public void fillEmptySpaces() {
    for (int i = 0; i < this.rows; i ++) {
	for (int z = 0; z < this.cols; z ++) {
	    if (this.data_[i][z] = ' ') {
		this.data_[i][z] = R1.nextInt(26);
	    }

	}
    }
}

public void setSeed(int seed) {
    this.R1.setSeed(seed);
}

    public String toString(){
	String Contains = ""
 	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	Contains += data[i][z] + " "
}
Contains += "/n"
}
	return Contains
    }

public void loadFromFile(String filename, boolean fillEmptySpaces) {
    data.clear();
    File fl;
    Scanner scnr;
    try {
	fl = new File(filename);
	scnr = new Scanner(fl);
    } catch (Exception e) {
	System.out.println("ERROR: File was not found.");
	return;
    }
  
    int counter = 0;
    while (scnr.hasNextLine()) {
	String line = scnr.nextLine();
	this.WordAddition.add(counter, line);
	counter ++;
	
    }
    for (int i = 0; i < WordAddition.size(); i++) {
	boolean added = false;
	int placement, rowTry, colTry;
	for (int z = 0; z < 100; z++) {
	    placement = this.R1.nextInt(8);
	    rowTry = this.R1.nextInt(this.rows);
	    colTry = this.R1.nextInt(this.cols);
	    if(placement == 0) {
			added = this.addWordVerticalNegative(WordAddition.get(i), rowTry, colTry);
	    } else if(placement == 1){
			added = this.addWordDiagonalLeftNegative(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 2){
			added = this.addWordHorizontalPositive(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 3){
			added = this.addWordDiagonalLeftPositive(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 4){
			added = this.addWordDiagonalRightPositive(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 5){
			added = this.addWordDiagonalRightNegative(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 6){
			added = this.addWordHorizontalNegative(WordAddition.get(i), rowTry, colTry);
	    }else if(placement == 7){
		      	added = this.addWordVerticalPositive(WordAddition.get(i), rowTry, colTry);
	    }
	    if(added){
		break;
	    } else if (z == 99) {
	       WordAddition.set(i, "H-54");
	    }
	}
    }
    if (fillEmptySpaces) {
	data.fillEmptySpaces();
    }
}

   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+i] == (word.charAt(i)) || (data[row][col+i] == ' ')) {
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row][col + i] = word.charAt(i);
}
return true;
}
   }

   public boolean addWordVerticalNegative(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col- i] == word.charAt(i) || (data[row][col+i] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row][col - i] = word.charAt(i);
}
return true;
}
   }



   public boolean addWordHorizontalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row + i][col] == (word.charAt(i)) || (data[row][col+i] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row + i][col] = word.charAt(i);
}
return true;
       }
   }

   public boolean addWordHorizontalNegative(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row - i][col] == (word.charAt(i)) || (data[row-i][col] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col] = word.charAt(i);
}
return true;
}
   }

   public boolean addWordDiagonalRightPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row + i ][col+ i] == (word.charAt(i)) || (data[row][col+1] == ' '){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row + i][col + i] = word.charAt(i);
}
return true;
}
   }



   public boolean addWordDiagonalLeftPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row - i][col+i] == (word.charAt(i)) || (data[row - i][col+i] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col + i] = word.charAt(i);
}
return true;
   }


  public boolean addWordDiagonalLeftNegative(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row - i][col-i] == (word.charAt(i)) || (data[row - i][col-i] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col -i] = word.charAt(i);
}
return true;
   }







  public boolean addWordDiagonalRightNegative(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row + i][col-i] == (word.charAt(i)) || (data[row + i][col-i] == ' ')){
    			 	return false;
    			 }
			}
		}
		    catch (Exception e) {
			return false;
		    }
}
for (int i = 0; i < word.length(); ++i) {
this.data[row +i][col -i] = word.charAt(i);
}
return true;
   } 


