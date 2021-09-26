import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpiralMatrixTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void SpiralMatrixTest1() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    List<Integer> expect = Arrays.asList(1,2,3,6,9,8,7,4,5);
  
    assertEquals(expect, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  public void SpiralMatrixTest2() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrix = {{1},{2}};
    List<Integer> expect = Arrays.asList(1,2);
  
    assertEquals(expect, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  public void SpiralMatrixTest3() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrix = {{1}};
    List<Integer> expect = Arrays.asList(1);
  
    assertEquals(expect, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  public void SpiralMatrixTest4() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    List<Integer> expect = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
  
    assertEquals(expect, spiralMatrix.spiralOrder(matrix));
  }
}