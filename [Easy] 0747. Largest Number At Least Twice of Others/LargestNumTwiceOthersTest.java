import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class LargestNumTwiceOthersTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void LargestNumTwiceOthersTest1() {
    LargestNumTwiceOthers largestNumTwiceOthers = new LargestNumTwiceOthers();
    int[] nums = {3,6,1,0};
    int expect = 1;

    assertEquals(expect, largestNumTwiceOthers.dominantIndex(nums));
  }

  @Test
  public void LargestNumTwiceOthersTest2() {
    LargestNumTwiceOthers largestNumTwiceOthers = new LargestNumTwiceOthers();
    int[] nums = {1,2,3,4};
    int expect = -1;

    assertEquals(expect, largestNumTwiceOthers.dominantIndex(nums));
  }

  @Test
  public void LargestNumTwiceOthersTest3() {
    LargestNumTwiceOthers largestNumTwiceOthers = new LargestNumTwiceOthers();
    int[] nums = {1};
    int expect = 0;

    assertEquals(expect, largestNumTwiceOthers.dominantIndex(nums));
  }
}