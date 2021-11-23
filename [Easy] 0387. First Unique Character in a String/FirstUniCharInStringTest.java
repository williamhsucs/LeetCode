import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstUniCharInStringTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void FirstUniCharInStringTest1() {
    FirstUniCharInString fc = new FirstUniCharInString();
    assertEquals(0, fc.firstUniqChar("leetcode"));
  }

  @Test
  public void FirstUniCharInStringTest2() {
    FirstUniCharInString fc = new FirstUniCharInString();
    assertEquals(2, fc.firstUniqChar("loveleetcode"));
  }

  @Test
  public void FirstUniCharInStringTest3() {
    FirstUniCharInString fc = new FirstUniCharInString();
    assertEquals(-1, fc.firstUniqChar("aabb"));
  }
}