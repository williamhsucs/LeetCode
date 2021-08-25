import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckIfNandItsDoubleExistTest {
  
  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void CheckIfNandItsDoubleExistTest1() {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();
    int[] input = {5,10};
    boolean expect = true;
    boolean ret;
    
    ret = checkIfNandItsDoubleExist.checkIfExist(input);
    assertEquals(expect, ret);
  }

  @Test
  public void CheckIfNandItsDoubleExistTest2() {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();
    int[] input = {10,5};
    boolean expect = true;
    boolean ret;
    
    ret = checkIfNandItsDoubleExist.checkIfExist(input);
    assertEquals(expect, ret);
  }

  @Test
  public void CheckIfNandItsDoubleExistTest3() {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();
    int[] input = {-10,5};
    boolean expect = false;
    boolean ret;
    
    ret = checkIfNandItsDoubleExist.checkIfExist(input);
    assertEquals(expect, ret);
  }

  @Test
  public void CheckIfNandItsDoubleExistTest4() {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();
    int[] input = {-5,10};
    boolean expect = false;
    boolean ret;
    
    ret = checkIfNandItsDoubleExist.checkIfExist(input);
    assertEquals(expect, ret);
  }

  @Test
  public void CheckIfNandItsDoubleExistTest5() {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();
    int[] input = {-5,0,3,-10};
    boolean expect = true;
    boolean ret;
    
    ret = checkIfNandItsDoubleExist.checkIfExist(input);
    assertEquals(expect, ret);
  }
}
