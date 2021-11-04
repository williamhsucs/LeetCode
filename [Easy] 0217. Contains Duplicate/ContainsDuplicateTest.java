import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ContainsDuplicateTest1() {
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums = {1,2,3,1};
    assertEquals(true, cd.containsDuplicate(nums));
  }

  @Test
  public void ContainsDuplicateTest2() {
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums = {1,2,3,4};
    assertEquals(false, cd.containsDuplicate(nums));
  }

  @Test
  public void ContainsDuplicateTest3() {
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
    assertEquals(true, cd.containsDuplicate(nums));
  }
}