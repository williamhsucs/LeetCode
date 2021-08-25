import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateZerosTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ValidMountainArrayTest1() {
    ValidMountainArray validMountainArray = new ValidMountainArray();
    int[] input = {2,1};
    boolean expect = false;
    boolean ret;
    
    ret = validMountainArray.validMountainArray(input);
    assertEquals(expect, ret);
  }

  @Test
  public void ValidMountainArrayTest2() {
    ValidMountainArray validMountainArray = new ValidMountainArray();
    int[] input = {3,5,5};
    boolean expect = false;
    boolean ret;
    
    ret = validMountainArray.validMountainArray(input);
    assertEquals(expect, ret);
  }

  @Test
  public void ValidMountainArrayTest3() {
    ValidMountainArray validMountainArray = new ValidMountainArray();
    int[] input = {0,3,2,1};
    boolean expect = true;
    boolean ret;
    
    ret = validMountainArray.validMountainArray(input);
    assertEquals(expect, ret);
  }

  @Test
  public void ValidMountainArrayTest4() {
    ValidMountainArray validMountainArray = new ValidMountainArray();
    int[] input = {1,3,2};
    boolean expect = true;
    boolean ret;
    
    ret = validMountainArray.validMountainArray(input);
    assertEquals(expect, ret);
  }
}
