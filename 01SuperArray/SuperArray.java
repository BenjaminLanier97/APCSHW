public class SuperArray{
    private int StorageNum;
    private  Object[] Array1;

    public SuperArray(){
StorageNum = 10;
Array1 = new Object[]{5, "you"," Dylan", "Bob", 1 ,2, 3, 4 ,5, 10};


    }
    public SuperArray(int size){
StorageNum = size;
Array1 = new Object[size];


    }
    public SuperArray(Object[] e){
	Array1 = e;



    }

  
  public static void out(String str) {
    System.out.println(str);
  }


     public static void main(String[] args){
	 SuperArray Test1 = new SuperArray();
	out(Test1.toString());
	Test1.add("Joe");
      	out(Test1.toString());
	Test1.Resize(5);
      	out(Test1.toString());
	Test1.add(3,"Crispin");
      	out(Test1.toString());
      	Test1.add(12,"Crispin");
      	out(Test1.toString());


     }






  

    public void Resize(int NewCapacity){
	Object[] Copy = this.Copy(Array1);
	Object[] Final = new Object[NewCapacity];
	for (int i = 0; i < NewCapacity;i++){
	    Final[i] = Copy[i];

	}
	Array1 = Final;


    }


public String toString(){
String ConcecatedString = "[";
for (int i = 0; i < Array1.length;i++){

    ConcecatedString += Array1[i] + " ";
}
ConcecatedString += "]";
return (ConcecatedString);
   

}

    public int size(){
	int length1 = 0;
      	for (int i = 0; i < Array1.length;i++){
	    length1++;
	}
	return length1;


    }

    public Object[] Copy(Object[] input1){
		Object[] final1 = new Object[input1.length];
		for (int i = 0; i < input1.length;i++){
		    final1[i] = input1[i];
		}
		return final1;
	


    }

    public void add(Object e){
	Object[] Initial = this.Copy(Array1);
	int size = Array1.length;
	Object[] Final = new Object[size + 1];

	for (int i = 0; i < Initial.length;i++){
		    Final[i] = Initial[i];
	}
	Final[Final.length-1] = e;
	Array1 = Final;
	
       

    }


    public void clear(){
  	for (int i = 0; i < Array1.length;i++){
	    Array1[i] = null;
		}
    }

    public Object get(int index){
	if (index > Array1.length - 1){
	    out("Error:Index out of range.");
	    return null;
	} else {
	return Array1[index];
	}
	
    }


    public void add(int index, Object o){
	Object[] FinalType;

	if (index < Array1.length){
	    FinalType = new Object[Array1.length + 1];
	     FinalType[index] = o;
	   
		for (int i =0; i<index;i++){
		    FinalType[i] = Array1[i];
		}
		for (int i = index + 1; i<=Array1.length ;i++){
		    FinalType[i] = Array1[i-1];
		}
		Array1 = FinalType;
	}else{
	    FinalType = new Object[index + 1];
	     FinalType[index] = o;
	   
		for (int i =0; i<;i++){
		    FinalType[i] = Array1[i];
		}
		Array1 = FinalType;
	    
		    

	}
    }



 
    public Object set(int index, Object o){
		if (index > Array1.length - 1){
	    out("Error:Index out of range.");
	    return null;
		} else {
	  Object finalType2 = Array1[index];
	Array1[index] = o;
	return finalType2;
		}
    }

											    

    public Object remove(int index){
		if (index > Array1.length - 1){
	    out("Error:Index out of range.");
	    return null;
		} else {
		    Object finalType = Array1[index];
		    Array1[index] = null;
		    return finalType;
		}

    }
}
