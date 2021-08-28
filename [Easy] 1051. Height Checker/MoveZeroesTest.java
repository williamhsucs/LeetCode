import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeightCheckerTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void HeightCheckerTest1() {
    HeightChecker heightChecker = new HeightChecker();
    int[] nums = {1,1,4,2,1,3};
    int[] expect = {1,1,1,2,3,4};
    int exp = 3;

    assertEquals(exp, heightChecker.heightChecker(nums));
  }

  @Test
  public void HeightCheckerTest2() {
    HeightChecker heightChecker = new HeightChecker();
    int[] nums = {5,1,2,3,4};
    int[] expect = {1,2,3,4,5};
    int exp = 5;

    assertEquals(exp, heightChecker.heightChecker(nums));
  }

  @Test
  public void HeightCheckerTest3() {
    HeightChecker heightChecker = new HeightChecker();
    int[] nums = {1,2,3,4,5};
    int[] expect = {1,2,3,4,5};
    int exp = 0;

    assertEquals(exp, heightChecker.heightChecker(nums));
  }
}