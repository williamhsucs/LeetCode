import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumIITest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void TwoSumIITest1() {
    TwoSumII twoSumII = new TwoSumII();
    int[] numbers = {2,7,11,15};
    int target = 9;
    int[] expect = {1,2};

    assertArrayEquals(expect, twoSumII.twoSum(numbers, target));
  }

  @Test
  public void TwoSumIITest2() {
    TwoSumII twoSumII = new TwoSumII();
    int[] numbers = {2,3,4};
    int target = 6;
    int[] expect = {1,3};

    assertArrayEquals(expect, twoSumII.twoSum(numbers, target));
  }

  @Test
  public void TwoSumIITest3() {
    TwoSumII twoSumII = new TwoSumII();
    int[] numbers = {-1,0};
    int target = -1;
    int[] expect = {1,2};

    assertArrayEquals(expect, twoSumII.twoSum(numbers, target));
  }
}