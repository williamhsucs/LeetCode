import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void TwoSumTest1() {
    TwoSum twoSum = new TwoSum();
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] expect = {1,0};

    assertArrayEquals(expect, twoSum.twoSum(nums, target));
  }

  @Test
  public void TwoSumTest2() {
    TwoSum twoSum = new TwoSum();
    int[] nums = {3,2,4};
    int target = 6;
    int[] expect = {2,1};

    assertArrayEquals(expect, twoSum.twoSum(nums, target));
  }

  @Test
  public void TwoSumTest3() {
    TwoSum twoSum = new TwoSum();
    int[] nums = {3,3};
    int target = 6;
    int[] expect = {1,0};

    assertArrayEquals(expect, twoSum.twoSum(nums, target));
  }
}