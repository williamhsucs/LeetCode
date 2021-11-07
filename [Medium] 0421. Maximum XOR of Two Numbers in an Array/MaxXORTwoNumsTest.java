import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxXORTwoNumsTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MaxXORTwoNumsTest1() {
    MaxXORTwoNums maxXOR = new MaxXORTwoNums();
    int[] nums = {3,10,5,25,2,8};
    int expect = 28;

    assertEquals(expect, maxXOR.findMaximumXOR(nums));
  }

  @Test
  public void MaxXORTwoNumsTest2() {
    MaxXORTwoNums maxXOR = new MaxXORTwoNums();
    int[] nums = {0};
    int expect = 0;

    assertEquals(expect, maxXOR.findMaximumXOR(nums));
  }

  @Test
  public void MaxXORTwoNumsTest3() {
    MaxXORTwoNums maxXOR = new MaxXORTwoNums();
    int[] nums = {2,4};
    int expect = 6;

    assertEquals(expect, maxXOR.findMaximumXOR(nums));
  }

  @Test
  public void MaxXORTwoNumsTest4() {
    MaxXORTwoNums maxXOR = new MaxXORTwoNums();
    int[] nums = {8,10,2};
    int expect = 10;

    assertEquals(expect, maxXOR.findMaximumXOR(nums));
  }

  @Test
  public void MaxXORTwoNumsTest5() {
    MaxXORTwoNums maxXOR = new MaxXORTwoNums();
    int[] nums = {14,70,53,83,49,91,36,80,92,51,66,70};
    int expect = 127;

    assertEquals(expect, maxXOR.findMaximumXOR(nums));
  }
}