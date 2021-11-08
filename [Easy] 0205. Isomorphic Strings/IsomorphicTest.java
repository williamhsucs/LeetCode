import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsomorphicTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void IsomorphicTest1() {
    Isomorphic isomorphic = new Isomorphic();
    String s1 = "egg";
    String s2 = "add";

    assertEquals(true, isomorphic.isIsomorphic(s1, s2));
  }

  @Test
  public void IsomorphicTest2() {
    Isomorphic isomorphic = new Isomorphic();
    String s1 = "foo";
    String s2 = "bar";

    assertEquals(false, isomorphic.isIsomorphic(s1, s2));
  }

  @Test
  public void IsomorphicTest3() {
    Isomorphic isomorphic = new Isomorphic();
    String s1 = "paper";
    String s2 = "title";

    assertEquals(true, isomorphic.isIsomorphic(s1, s2));
  }
}