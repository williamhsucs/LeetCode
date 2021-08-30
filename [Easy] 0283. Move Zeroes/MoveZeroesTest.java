import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveZeroesTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MoveZeroesTest1() {
    MoveZeroes moveZeroes = new MoveZeroes();
    int[] nums = {0,1,0,3,12};
    int[] expect = {1,3,12,0,0};

    moveZeroes.moveZeroes(nums);
    assertArrayEquals(expect, nums);
  }

  @Test
  public void MoveZeroesTest2() {
    MoveZeroes moveZeroes = new MoveZeroes();
    int[] nums = {-2147483648};
    int[] expect = {-2147483648};

    moveZeroes.moveZeroes(nums);
    assertArrayEquals(expect, nums);
  }
}