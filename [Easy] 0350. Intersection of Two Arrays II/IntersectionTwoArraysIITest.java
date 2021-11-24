import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntersectionTwoArraysIITest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void IntersectionTwoArraysIITest1() {
    IntersectionTwoArraysII ita = new IntersectionTwoArraysII();
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
    int[] expect = {2,2};

    assertArrayEquals(expect, ita.intersection(nums1, nums2));
  }

  @Test
  public void IntersectionTwoArraysIITest2() {
    IntersectionTwoArraysII ita = new IntersectionTwoArraysII();
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
    int[] expect = {4,9};

    assertArrayEquals(expect, ita.intersection(nums1, nums2));
  }
}