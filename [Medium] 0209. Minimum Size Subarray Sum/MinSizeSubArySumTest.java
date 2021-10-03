import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinSizeSubArySumTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MinSizeSubArySumTest1() {
    MinSizeSubArySum minSizeSubArySum = new MinSizeSubArySum();
    int[] nums = {2,3,1,2,4,3};
    int target = 7;
    int expect = 2;

    assertEquals(expect, minSizeSubArySum.minSubArrayLen(target, nums));
  }

  @Test
  public void MinSizeSubArySumTest2() {
    MinSizeSubArySum minSizeSubArySum = new MinSizeSubArySum();
    int[] nums = {1,4,4};
    int target = 4;
    int expect = 1;

    assertEquals(expect, minSizeSubArySum.minSubArrayLen(target, nums));
  }

  @Test
  public void MinSizeSubArySumTest3() {
    MinSizeSubArySum minSizeSubArySum = new MinSizeSubArySum();
    int[] nums = {1,1,1,1,1,1,1,1};
    int target = 11;
    int expect = 0;

    assertEquals(expect, minSizeSubArySum.minSubArrayLen(target, nums));
  }
}