public class OrderedSuperArray extends SuperArray{
    private int StorageNum;
    private String[] Array1;
    OrderedSuperArray(){
	this.StorageNum = 10;
	Array1 = new String[]{"Bob", " Dylan","you",};
    }
    OrderedSuperArray(int size){
    this.StorageNum = size;
    this.Array1 = new String[size];
    }
    OrderedSuperArray(String[] e){
	this.Array1 = e;
    }

   public void add(String e){
	for (int i = 0; i< Array1.length; i ++){
	    if (e.compareTo(Array1[i]) > 0) {
		e.add(i);
	    }
	}
    }

public static void main(String[] args){
OrderedSuperArray Test1 = new OrderedSuperArray();
super.out(Test1.toString());
Test1.add("Joe");
super.out(Test1.toString());
Test1.Resize(5);
super.out(Test1.toString());
Test1.add("Crispin");
super.out(Test1.toString());
Test1.add("Harold");
super.out(Test1.toString());
}


  public void InsertionSort(){
      String b;
		  for(int i = 0; i < Array1.length; i++){
			if (!(Array1[i] < Array1[i+1]) && (Array1[i] > Array1[i-1])){
			    b =  Array1.remove(i);
			    for(int z = 0; z < Array1.length; z++){
				if ((Array1[z]  < Array1[z +1]) && (Array1[z] > Array1[z-1])){
				    Array1.add(b);
			    
				
			    
				}}}}
}

public int find(String target){
     for(int i = 0; i < Array1.length; i++){
	 if (Array1[i].equals(target)) {
	     return i;
	 }
	 else{
	     return -1;

	 }}}

public void SelectionSort(){
    int MinValue;
    int Substitue;
    MinValue = Array1[i];
    
    for (int i = 0; i <Array1.length; i++){
	  MinValue = Array1[i];
	 for (int j = i; j <Array1.length; j++){
	     if (Array1[j]< MinValue){
		 MinValue = Array1[j];
		 
		     }
	 }
	 Substitute = Array1[i];
	      Array1[i] =MinValue;
	    Array1[j] = Substitute;
    }}}
