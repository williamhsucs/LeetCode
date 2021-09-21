import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindPivotIndexTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void FindPivotIndexTest1() {
    FindPivotIndex findPivotIndex = new FindPivotIndex();
    int[] nums = {1,7,3,6,5,6};
    int expect = 3;

    assertEquals(expect, findPivotIndex.pivotIndex(nums));
  }

  @Test
  public void FindPivotIndexTest2() {
    FindPivotIndex findPivotIndex = new FindPivotIndex();
    int[] nums = {1,2,3};
    int expect = -1;

    assertEquals(expect, findPivotIndex.pivotIndex(nums));
  }

  @Test
  public void FindPivotIndexTest3() {
    FindPivotIndex findPivotIndex = new FindPivotIndex();
    int[] nums = {2,1,-1};
    int expect = 0;

    assertEquals(expect, findPivotIndex.pivotIndex(nums));
  }
}