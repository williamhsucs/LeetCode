import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortArrayByParityTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void SortArrayByParityTest1() {
    SortArrayByParity sortArrayByParity = new SortArrayByParity();
    int[] nums = {3,1,2,4};
    int[] expect = {2,4,3,1};

    sortArrayByParity.sortArrayByParity(nums);
    assertArrayEquals(expect, nums);
  }
}