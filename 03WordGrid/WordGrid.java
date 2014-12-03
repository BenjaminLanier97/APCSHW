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
    	this(10,8);
    
    }
    public WordGrid(int rows,int cols){
	this.rows = rows;
	this.cols = cols;
	data = new char[rows][cols];
	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	data[i][z] = ' ';
}
}
	
	this.clear();	
    }
public String wordsInPuzzle() {
    String WordString = "";
    for (int i = 0; i < WordAddition.size(); i++) {
	WordString += WordAddition.get(i) + "\t";
	if (i % 5 == 0 && i > 0) {
	    WordString += "\n";
	}
}
return WordString;
}
 public  void clear(){
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
	    if (data[i][z] == ' ') {
		data[i][z] = (char)(this.R1.nextInt(26) + 65);
	    }

	}
    }
}

public void setSeed(int seed) {
    this.R1.setSeed(seed);
}

    public String toString(){
	String Contains = "";
 	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	    Contains += data[i][z] + " ";
}
	Contains += "\n";
}
	return Contains;
    }

public void loadFromFile(String filename, boolean fillEmptySpaces) {
   this.clear();
    File fl;
    Scanner scnr;
    try {
	fl = new File(filename);
	scnr = new Scanner(fl);
    } catch(Exception e){
	System.out.println("ERROR: File was not found.");
	return;
    }
  
    int counter = 0;
    while (scnr.hasNextLine()) {
	String line = scnr.nextLine();
	this.WordAddition.add(counter, line);
	counter ++;
	
    }
    System.out.print(WordAddition.toString());
    for (int i = 0; i < WordAddition.size(); i++) {
	boolean added = false;
	int placement, rowTry, colTry;
      
	  System.out.println(WordAddition.toString());
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
	    //System.out.println(added);
	    if(added){
		break;
	    } else if (z == 99) {
		System.out.print("Joe");
	       WordAddition.set(i, null);
	    }
	}
    }
    System.out.print(WordAddition.toString());
    System.out.print("Bob");
    if (fillEmptySpaces) {
	this.fillEmptySpaces();
    }
}



 public boolean addWordVerticalNegative(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row][col- i] == word.charAt(i) || (data[row][col+i] == ' '))){
    			 	return false;
		    }
		

		}
       } catch (Exception e) {
			return false;
		    }
       
for (int i = 0; i < word.length(); ++i) {
this.data[row][col - i] = word.charAt(i);
}
return true;
   }




   public boolean addWordHorizontalPositive(String word,int row, int col){
       try{
	   System.out.println(row.parseInt(), col.parseInt());
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row + i][col] == (word.charAt(i)) || (data[row][col+i] == ' '))){
		
    			 	return false;
    			 }
			}
		
       }
		    catch (Exception e) {
			//System.out.println("Bobby");
			return false;
		    }
   
for (int i = 0; i < word.length(); ++i) {
this.data[row + i][col] = word.charAt(i);
}
return true;
   }
   

   public boolean addWordHorizontalNegative(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row - i][col] == (word.charAt(i)) || (data[row-i][col] == ' '))){
    			 	return false;
    			 }
			}
		
       }
		    catch (Exception e) {
			return false;
		    }
   
for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col] = word.charAt(i);
}
return true;
}
   
public boolean addWordDiagonalRightPositive(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row + i ][col+ i] == (word.charAt(i)) || (data[row][col+1] == ' '))){
    			 	return false;
			}
		}}
			
				
		    catch (Exception e) {
			return false;
		    }
for (int i = 0; i < word.length(); ++i) {
this.data[row + i][col + i] = word.charAt(i);
}
return true;
       }

   


   public boolean addWordDiagonalLeftPositive(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row - i][col+i] == (word.charAt(i)) || (data[row - i][col+i] == ' '))){
    			 	return false;
    			 
			}
		}}
		    catch (Exception e) {
			return false;
		    }

for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col + i] = word.charAt(i);
}
return true;
   }


  public boolean addWordDiagonalLeftNegative(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row - i][col-i] == (word.charAt(i)) || (data[row - i][col-i] == ' '))){
    			 	return false;
    			 }
			
		}}
		    catch (Exception e) {
			return false;
		    }
  
for (int i = 0; i < word.length(); ++i) {
this.data[row - i][col -i] = word.charAt(i);
}
return true;
   }







  public boolean addWordDiagonalRightNegative(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row + i][col-i] == (word.charAt(i)) || (data[row + i][col-i] == ' '))){
    			 	return false;
    			 }
			
		}}
		    catch (Exception e) {
			return false;
		    }
  
for (int i = 0; i < word.length(); ++i) {
this.data[row +i][col -i] = word.charAt(i);
}
return true;
  }

   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    
    		for (int i = 0; i < data.length; i ++){
		    if (!(data[row + i][col] == (word.charAt(i)) || (data[row + i][col] == ' '))){
    			 	return false;
		    }
		}
		}
		    catch (Exception e) {
			return false;
		    }
  
for (int i = 0; i < word.length(); ++i) {
this.data[row +i][col] = word.charAt(i);
}
return true;

  }
}
