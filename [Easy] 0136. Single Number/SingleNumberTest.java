import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveZeroesTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void SingleNumberTest1() {
    SingleNumber sn = new SingleNumber();
    int[] nums = {2, 2, 1};

    assertEquals(1, sn.singleNumber(nums));
  }

  @Test
  public void SingleNumberTest2() {
    SingleNumber sn = new SingleNumber();
    int[] nums = {4,1,2,1,2};

    assertEquals(4, sn.singleNumber(nums));
  }

  @Test
  public void SingleNumberTest3() {
    SingleNumber sn = new SingleNumber();
    int[] nums = {1};

    assertEquals(1, sn.singleNumber(nums));
  }
}