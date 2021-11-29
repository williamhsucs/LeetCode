import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContainsDuplicateIITest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ContainsDuplicateIITest1() {
    ContainsDuplicateII cd = new ContainsDuplicateII();
    int[] nums = {1,2,3,1};
    int k = 3;
    assertEquals(true, cd.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void ContainsDuplicateIITest2() {
    ContainsDuplicateII cd = new ContainsDuplicateII();
    int[] nums = {1,0,1,1};
    int k = 1;
    assertEquals(true, cd.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void ContainsDuplicateIITest3() {
    ContainsDuplicateII cd = new ContainsDuplicateII();
    int[] nums = {1,2,3,1,2,3};
    int k = 2;
    assertEquals(false, cd.containsNearbyDuplicate(nums, k));
  }
}