import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyHashSetTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MyHashSetTest1() {
    MyHashSet set = new MyHashSet();
    set.add(1);
    set.add(2);
    assertEquals(true, set.contains(1));
    assertEquals(false, set.contains(3));
    set.add(2);
    assertEquals(true, set.contains(2));
    set.remove(2);
    assertEquals(false, set.contains(2));
  }
}