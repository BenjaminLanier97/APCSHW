public class OrderedSuperArray extends SuperArray{
    private int StorageNum;
    private String[] Array1;
    public SuperArray(){
	StorageNum = 10;
	Array1 = new String[]{"Bob", " Dylan","you",};
    }
    public SuperArray(int size){
    StorageNum = size;
    Array1 = new String[size];
    }
    public SuperArray(String[] e){
	Array1 = e;
    }

    public void add(String e){
	for (int i = 0; i, Array1.size(); i ++){
	    if (e.compareTo(Array1[i]) > 0) {
		e.add(i);
		}
	}
    }

  public void InsertionSort(){
		    OrderedSuperArray c = new OrderedSuperArray();
		    String b;
		    for(int i = 0; i < this.size(); i++){
			If (!(c[i] < c[i +1]) && ([i] > c[i-1])){
			    b =  c.remove(i);
			    for(int z = 0; z < this.size(); z++){
				If  ((c[z]  < c[z +1]) && (c[z] > c[z-1])){
				    c.add(b);
			    
				
			    
				}}}
		

	return c;
}
public int find(String target){
    OrderedSuperArray c = new OrderedSuperArray();
     for(int i = 0; i < this.size(); i++){
	 if (c[i].equals(target)) {
	     return i;
	 }
	 else{
	     return -1;

	 }
    
    



     }
}
 


}

public void SelectionSort(){
    String MinValue;
    
    for (int i = 0; i <SuperArray.size(); i++){
	 MinValue = superArray[i];
	 for (int j = 0; j <SuperArray.size(); j++){
	     if (SuperArray[i] < SuperArray[j]){
		 SuperArray[i] = SuperArray [j]
		     }
	     MinValue = SuperArray[j];
	 }
    }
	     
	 




    }



}
