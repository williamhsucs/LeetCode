import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlusOneTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void PlusOneTest1() {
    PlusOne plusOne = new PlusOne();
    int[] digit = {1,2,3};
    int[] expect = {1,2,4};
    
    assertArrayEquals(expect, plusOne.plusOne(digit));
  }

  @Test
  public void PlusOneTest2() {
    PlusOne plusOne = new PlusOne();
    int[] digit = {4,3,2,1};
    int[] expect = {4,3,2,2};
    
    assertArrayEquals(expect, plusOne.plusOne(digit));
  }

  @Test
  public void PlusOneTest3() {
    PlusOne plusOne = new PlusOne();
    int[] digit = {0};
    int[] expect = {1};
    
    assertArrayEquals(expect, plusOne.plusOne(digit));
  }

  @Test
  public void PlusOneTest4() {
    PlusOne plusOne = new PlusOne();
    int[] digit = {9};
    int[] expect = {1,0};
    
    assertArrayEquals(expect, plusOne.plusOne(digit));
  }
}
