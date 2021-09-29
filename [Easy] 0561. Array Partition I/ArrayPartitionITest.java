import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayPartitionITest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ArrayPartitionITest1() {
    ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
    int[] nums = {1,4,3,2};
    int expect = 4;

    assertEquals(expect, arrayPartitionI.arrayPairSum(nums));
  }

  @Test
  public void ArrayPartitionITest2() {
    ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
    int[] nums = {6,2,6,5,1,2};
    int expect = 9;

    assertEquals(expect, arrayPartitionI.arrayPairSum(nums));
  }
}