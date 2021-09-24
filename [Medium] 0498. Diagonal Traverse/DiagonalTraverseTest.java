import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiagonalTraverseTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void DiagonalTraverseTest1() {
    DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    int[] expect = {1,2,4,7,5,3,6,8,9};

    assertArrayEquals(expect, diagonalTraverse.findDiagonalOrder(mat));
  }

  @Test
  public void DiagonalTraverseTest2() {
    DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
    int[][] mat = {{1,2,3}};
    int[] expect = {1,2,3};

    assertArrayEquals(expect, diagonalTraverse.findDiagonalOrder(mat));
  }

  @Test
  public void DiagonalTraverseTest3() {
    DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
    int[][] mat = {{1}};
    int[] expect = {1};

    assertArrayEquals(expect, diagonalTraverse.findDiagonalOrder(mat));
  }
}