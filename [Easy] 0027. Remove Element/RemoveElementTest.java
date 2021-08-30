import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveElementTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void RemoveElementTest1() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {3,2,2,3};
    int val = 3;
    int[] expect = {2,2,0,0};
    int expectRet = 2;

    assertEquals(expectRet, removeElement.removeElement(nums, val));
    Arrays.sort(nums, 0, expectRet);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveElementTest2() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int[] expect = {0,0,1,3,4,0,0,0};
    int expectRet = 5;

    assertEquals(expectRet, removeElement.removeElement(nums, val));
    Arrays.sort(nums, 0, expectRet);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveElementTest3() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {1};
    int val = 1;
    int[] expect = {0};
    int expectRet = 0;

    assertEquals(expectRet, removeElement.removeElement(nums, val));
    Arrays.sort(nums, 0, expectRet);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveElementTest4() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {3,3};
    int val = 3;
    int[] expect = {0,0};
    int expectRet = 0;

    assertEquals(expectRet, removeElement.removeElement(nums, val));
    Arrays.sort(nums, 0, expectRet);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveElementTest5() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {4,5};
    int val = 4;
    int[] expect = {5,0};
    int expectRet = 1;

    assertEquals(expectRet, removeElement.removeElement(nums, val));
    Arrays.sort(nums, 0, expectRet);
    assertArrayEquals(expect, nums);
  }
}