
public class WordGrid{
    private char[][]data;
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

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word,int row, int col){
    	int size  = word.length();
    	int position = 0;
    	if (size > row){
    		return false;
    	} else {
    		for (int i = 0; i < data.length; i ++){
    			 if !(data[i + col][row].equals(word[i])){
    			 	return false;
    			 }

}
return true;
}	

   public boolean addWordVertical(String word,int row, int col){
    	int size  = word.length();
    }
       public boolean addWordDiagonal(String word,int row, int col){
    	int size  = word.length();
    }
    //vertical + diagonal should be implemented as well.

}
