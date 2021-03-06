package mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class HandleArrayTests {
	int[] testArray = { 1, 2, 3, 4 };
	
	@Test
	public void TestReturnSum() {
		HandleArray ha = Mockito.mock(HandleArray.class);
		ha.addValues();
		
		Mockito.verify(ha, Mockito.times(1)).addValues();
	}
	
	@Test
	public void TestIntArrTestClass() {
		IntArrForTest intArr = new IntArrForTest(1, 2, 3, 4);
		assertArrayEquals(intArr.getIntArr(), testArray);
	}
	
	@Test
	public void TestBothClasses() {
		IntArrForTest intArr = new IntArrForTest(1, 2, 3, 4);
		HandleArray ha = Mockito.mock(HandleArray.class);
		Mockito.when(ha.addValues()).thenReturn(10);
		Mockito.verify(ha, Mockito.never()).getString();
		
		assertEquals(ha.addValues(), 10);
	}
	
	@Test
	public void MockTestIntArr() {
		IntArrForTest intArr = Mockito.mock(IntArrForTest.class);
		Mockito.when(intArr.getIntArr()).thenReturn(testArray);
		HandleArray ha = new HandleArray(intArr.getIntArr());
		Mockito.verify(intArr, Mockito.times(1)).getIntArr();
		
		int[] newArr = { 2, 3, 4, 5 };
		assertArrayEquals(ha.addToElements(1), newArr);
	}
}