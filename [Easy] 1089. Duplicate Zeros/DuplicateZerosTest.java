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
  public void Test1() {
    // Enter code here
    Solution solution = new Solution();
    int[] inputAry = {1,0,2,3,0,4,5,0};
    int[] outputAry = {1,0,0,2,3,0,0,4};
    solution.duplicateZeros(inputAry);
    assertArrayEquals(outputAry, inputAry);
  }

  @Test
  public void Test2() {
    Solution solution = new Solution();
    int[] inputAry = {0,0,0,0,0,0,0,0};
    int[] outputAry = {0,0,0,0,0,0,0,0};
    solution.duplicateZeros(inputAry);
    assertArrayEquals(outputAry, inputAry);
  }

  @Test
  public void Test3() {
    Solution solution = new Solution();
    int[] inputAry = {0,1,7,6,0,2,0,7};
    int[] outputAry = {0,0,1,7,6,0,0,2};
    solution.duplicateZeros(inputAry);
    assertArrayEquals(outputAry, inputAry);
  }

  @Test
  public void test4() {
    Solution solution = new Solution();
    int[] inputAry = {8,4,5,0,0,0,0,7};
    int[] outputAry = {8,4,5,0,0,0,0,0};
    solution.duplicateZeros(inputAry);
    assertArrayEquals(outputAry, inputAry);
  }
}
