import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ReverseStringTest1() {
    ReverseString reverseString = new ReverseString();
    char[] input = {'h','e','l','l','o'};
    char[] expect = {'o','l','l','e','h'};

    assertArrayEquals(expect, reverseString.reverseString(input));
  }

  @Test
  public void ReverseStringTest2() {
    ReverseString reverseString = new ReverseString();
    char[] input = {'H','a','n','n','a','h'};
    char[] expect = {'h','a','n','n','a','H'};

    assertArrayEquals(expect, reverseString.reverseString(input));
  }

  @Test
  public void ReverseStringTest3() {
    ReverseString reverseString = new ReverseString();
    char[] input = {'a'};
    char[] expect = {'a'};

    assertArrayEquals(expect, reverseString.reverseString(input));
  }
}