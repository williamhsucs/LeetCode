import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapSumTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MapSumTest1() {
    MapSum mapSum = new MapSum();
    mapSum.insert("apple", 3);
    assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    assertEquals(5, mapSum.sum("ap"));
  }

  @Test
  public void MapSumTest2() {
    MapSum mapSum = new MapSum();
    mapSum.insert("a", 3);
    assertEquals(0, mapSum.sum("ap"));
    mapSum.insert("b", 2);
    assertEquals(3, mapSum.sum("a"));
  }

  @Test
  public void MapSumTest3() {
    MapSum mapSum = new MapSum();
    mapSum.insert("apple", 3);
    assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    mapSum.insert("apple", 2);
    assertEquals(4, mapSum.sum("ap"));
  }

  @Test
  public void MapSumTest4() {
    MapSum mapSum = new MapSum();
    mapSum.insert("apple", 3);
    assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    assertEquals(5, mapSum.sum("ap"));
    mapSum.insert("apple", 5);
    mapSum.insert("apple", 1);
    assertEquals(1, mapSum.sum("apple"));
  }
}