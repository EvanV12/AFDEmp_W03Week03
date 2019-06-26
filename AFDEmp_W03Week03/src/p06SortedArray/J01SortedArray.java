package p06SortedArray;

public class J01SortedArray {

	//private int array [];
	private int array [] = new int [10];
	private int arrayLength = 10;
	
//	private int array2 [] = {2, 4};
	
	
	
	// default constructor
	public J01SortedArray() { }
	
	
	// manual constructor
		public J01SortedArray (int array[]) {
			this.array = array;
		//	array [] = array[arrayLength];
		}
	
	// manual constructor
//	public SortedArray (int arrayLength) {
//		this.arrayLength = arrayLength;
	//	array [] = array[arrayLength];
//	}
	
	
	
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}

	public int getArrayLength() {
		return arrayLength;
	}
	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}

	public int findInteger() {
		int userInteger = 0;;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == userInteger) {
				System.out.print("Correct");
			}
		}
	return userInteger;
	}
	
	
	
	public boolean containsElement() {
		boolean b = true;
		int userInteger = 0;;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == userInteger) {
				return false;
			}
		}
		return b;
	}
	
	
}
