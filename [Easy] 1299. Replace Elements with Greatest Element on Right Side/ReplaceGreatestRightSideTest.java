import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceGreatestRightSideTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ReplaceGreatestRightSideTest1() {
    ReplaceGreatestRightSide replaceGreatestRightSide = new ReplaceGreatestRightSide();
    int[] nums = {17,18,5,4,6,1};
    int[] expect = {18,6,6,6,1,-1};

    assertArrayEquals(expect, replaceGreatestRightSide.replaceElements(nums));
  }

  @Test
  public void ReplaceGreatestRightSideTest2() {
    ReplaceGreatestRightSide replaceGreatestRightSide = new ReplaceGreatestRightSide();
    int[] nums = {400};
    int[] expect = {-1};

    assertArrayEquals(expect, replaceGreatestRightSide.replaceElements(nums));
  }

}