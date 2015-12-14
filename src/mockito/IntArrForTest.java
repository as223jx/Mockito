package mockito;

public class IntArrForTest {
	
	public int[] intArr;
	
	public IntArrForTest(int a, int b, int c, int d) {
		intArr = new int[] { a, b, c, d };
	}
	
	public int[] getIntArr() {
		return intArr;
	}
}