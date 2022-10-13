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
  public void testReversedWithNumbers(){
    int[] input = {1,2,3};
    int[] answer = {3,2,1};

    assertArrayEquals(answer,ArrayExamples.reversed(input));


  }

  @Test
  public void testReverseInPlaceWithNumbers(){
    int[] input = {1,2,3,4,5,6,7,8};
    int[] answer = {8,7,6,5,4,3,2,1};

    ArrayExamples.reverseInPlace(input);

    assertArrayEquals(answer,input);

  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = {2,2,3.2,4.4,5};
    double answer = 4.2;

    assertEquals(answer,ArrayExamples.averageWithoutLowest(input),0.001);

  }


}
