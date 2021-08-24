import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void RemoveDuplicatesFromSortedArrayTest1() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    int[] nums = {1,1,2};
    /**
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * Only need to check {1,2,_}
     * But my test case is check whole array.
     * And my code have not replace the remain elements.
     * So the expect array need to keep remain elements.
     */
    int[] expect = {1,2,2};
    int ret = 0;
    int expectRet = 2;

    ret = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    assertEquals(expectRet, ret);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveDuplicatesFromSortedArrayTest2() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int[] expect = {0,1,2,3,4,2,2,3,3,4};
    int ret = 0;
    int expectRet = 5;

    ret = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    assertEquals(expectRet, ret);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveDuplicatesFromSortedArrayTest3() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    int[] nums = {};
    int[] expect = {};
    int ret = 0;
    int expectRet = 0;

    ret = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    assertEquals(expectRet, ret);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveDuplicatesFromSortedArrayTest4() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    int[] nums = {1};
    int[] expect = {1};
    int ret = 0;
    int expectRet = 1;

    ret = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    assertEquals(expectRet, ret);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void RemoveDuplicatesFromSortedArrayTest5() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    int[] nums = {1,1};
    int[] expect = {1,1};
    int ret = 0;
    int expectRet = 1;

    ret = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    assertEquals(expectRet, ret);
    assertArrayEquals(expect, nums);
  }
}