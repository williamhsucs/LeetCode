import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ThirdMaxNumberTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ThirdMaxNumberTest1() {
    ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
    int[] nums = {1,2};
    int expect = 2;

    assertEquals(expect, thirdMaxNumber.thirdMax(nums));
  }

  @Test
  public void ThirdMaxNumberTest2() {
    ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
    int[] nums = {3,2,1};
    int expect = 1;

    assertEquals(expect, thirdMaxNumber.thirdMax(nums));
  }

  @Test
  public void ThirdMaxNumberTest3() {
    ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
    int[] nums = {2,2,3,1};
    int expect = 1;

    assertEquals(expect, thirdMaxNumber.thirdMax(nums));
  }

  @Test
  public void ThirdMaxNumberTest4() {
    ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
    int[] nums = {3,-2147483648,1};
    int expect = -2147483648;

    assertEquals(expect, thirdMaxNumber.thirdMax(nums));
  }
}