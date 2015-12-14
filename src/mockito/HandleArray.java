package mockito;

public class HandleArray {
	
	private int[] intArr;
	
	public HandleArray(int[] arr) {
		intArr = arr;
	}
	
	public int addValues() {
		int sum = 0;
		for(int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		return sum;
	}
	
	
	public String getString() {
		String str = "";
		for(int i = 0; i < intArr.length; i++) {
			str += intArr[i] + " ";
		}
		return str;
	}
}