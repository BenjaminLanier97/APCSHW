import java.io.*;
import java.util.*;

public class WordGrid{
    private Random R1 = new Random();
    private char[][]data;
    private int rows, cols;

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
		    if !(data[row][col-1] == word.charAt(i) || (data[row][col+i] == ' ')){
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
		    if !(data[row][col+1] == (word.charAt(i)) || (data[row][col+1] == ' '){
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

   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }   public boolean addWordVerticalPositive(String word,int row, int col){
       try{
    	int size  = word.length();
    	    	if (size > col){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
		    if !(data[row][col+1].equals(word.charAt(i)){
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
   }


