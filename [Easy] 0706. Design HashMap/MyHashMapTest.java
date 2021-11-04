import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyHashMapTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MyHashMapTest1() {
    MyHashMap map = new MyHashMap();
    map.put(1, 1);
    map.put(2, 2);
    assertEquals(1, map.get(1));
    assertEquals(-1, map.get(3));
    map.put(2, 1);
    assertEquals(1, map.get(2));
    map.remove(2);
    assertEquals(-1, map.get(2));
  }
}