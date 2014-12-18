public class BubbleSort{

    public void BubbleSort(){
	int temp = 0;
	for (int i = 0;i <List.length;i++){
	    for (int j = i; j < List.length;j++){
		if (List[i] > List[j]){
		    temp = List[i];
		    List[i] = List[j];
		}}}}
	
public void InsertionSort(){
    OrderedSuperArray c = new OrderedSuperArray();
    String b;
    for(int i = 0; i < this.size(); i++){
	If (!(c[i] < c[i +1]) && ([i] > c[i-1])){
	    b =  c.remove(i);
	    for(int z = 0; z < this.size(); z++){
		If  ((c[z]  < c[z +1]) && (c[z] > c[z-1])){
		    c.add(b);
			    
			}
	    }
		
		

	    

	}


    }
	return c;
}	
	
	
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
    }}	
	
}
