
public class WordGrid{
    private char[][]data;
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

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String Contains = ""
 	for (int i = 0; i < data.length; i ++){
	for (int z = 0; z < data[i].length; z++){
	Contains += data[i][z];
}
}
	return contains
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
    }

    //vertical + diagonal should be implemented as well.

}
