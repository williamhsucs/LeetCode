import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindDisappearedNumbersTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void FindDisappearedNumbersTest1() {
    FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
    int[] nums = {4,3,2,7,8,2,3,1};
    List<Integer> expect = new ArrayList<>(Arrays.asList(5,6));
    
    assertEquals(expect, findDisappearedNumbers.findDisappearedNumbers(nums));
  }

  @Test
  public void FindDisappearedNumbersTest2() {
    FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
    int[] nums = {1,1};
    List<Integer> expect = new ArrayList<>(Arrays.asList(2));
    
    assertEquals(expect, findDisappearedNumbers.findDisappearedNumbers(nums));
  }
}