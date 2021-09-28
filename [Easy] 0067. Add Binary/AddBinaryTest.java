import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddBinaryTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void AddBinaryTest1() {
    AddBinary addBinary = new AddBinary();
    String s1 = "11";
    String s2 = "1";
    String expect = "100";
    
    assertEquals(expect, addBinary.addBinary(s1, s2));
  }

  @Test
  public void AddBinaryTest2() {
    AddBinary addBinary = new AddBinary();
    String s1 = "1010";
    String s2 = "1011";
    String expect = "10101";
    
    assertEquals(expect, addBinary.addBinary(s1, s2));
  }

  @Test
  public void AddBinaryTest3() {
    AddBinary addBinary = new AddBinary();
    String s1 = "1110110101";
    String s2 = "1110111011";
    String expect = "11101110000";
    
    assertEquals(expect, addBinary.addBinary(s1, s2));
  }
}
