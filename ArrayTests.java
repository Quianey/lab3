import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedTwo() {
    int[] input1 = { 4, 5, 6 };
    assertArrayEquals(new int[]{ 6, 5, 4 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedSame() {
    int[] input1 = { 4, 4, 4, 4 };
    assertArrayEquals(new int[]{ 4, 4, 4, 4 }, ArrayExamples.reversed(input1));
  }
}
