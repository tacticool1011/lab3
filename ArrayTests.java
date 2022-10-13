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
	public void testReverseInPlaceBug() {
    int[] input1 = { 3, 5, 7, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{8, 7, 5, 3}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedBug() {
    int[] input1 = {3, 5, 7 };
    assertArrayEquals(new int[]{ 7, 5, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestBug() {
    double[] input1 = {3.0, 3.0, 5.0, 7.0};
    double ans = 5.0;
    assertEquals(ans, ArrayExamples.averageWithoutLowest(input1), 0.0005);
  }
  
}
