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
  public void MergeSortedArrayTest1() {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;
    int[] expect = {1,2,2,3,5,6};
    
    mergeSortedArray.merge(nums1, m, nums2, n);
    assertArrayEquals(expect, nums1);
  }

  @Test
  public void MergeSortedArrayTest2() {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = {1};
    int m = 1;
    int[] nums2 = {};
    int n = 0;
    int[] expect = {1};
    
    mergeSortedArray.merge(nums1, m, nums2, n);
    assertArrayEquals(expect, nums1);
  }

  @Test
  public void MergeSortedArrayTest3() {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = {0};
    int m = 0;
    int[] nums2 = {1};
    int n = 1;
    int[] expect = {1};
    
    mergeSortedArray.merge(nums1, m, nums2, n);
    assertArrayEquals(expect, nums1);
  }
}
