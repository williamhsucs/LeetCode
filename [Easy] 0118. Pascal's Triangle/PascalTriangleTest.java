import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class PascalTriangleTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void PascalTriangleTest1() {
    PascalTriangle pascalTriangle = new PascalTriangle();
    int numRows = 5;
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(1));
    expect.add(Arrays.asList(1,1));
    expect.add(Arrays.asList(1,2,1));
    expect.add(Arrays.asList(1,3,3,1));
    expect.add(Arrays.asList(1,4,6,4,1));
  
    assertEquals(expect, pascalTriangle.generate(numRows));
  }

  @Test
  public void PascalTriangleTest2() {
    PascalTriangle pascalTriangle = new PascalTriangle();
    int numRows = 1;
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(1));
  
    assertEquals(expect, pascalTriangle.generate(numRows));
  }
}