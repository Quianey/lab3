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

  @Test
  public void testAverageZeroElement() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
  
  @Test
  public void testAverageOneElement() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testAverageTwoElement() {
    double[] input1 = { 1, 2 };
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testAverageMultipleElement() {
    double[] input1 = { 2, 7, 8, 8, 5, 2, 6, 7, 9};
    assertEquals((7+8+8+5+2+6+7+9)/8.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testAverageFourElement() {
    double[] input1 = { 8, 8, 5, 9};
    assertEquals((8+8+9)/3.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

}
