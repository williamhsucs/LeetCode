import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotBoundedInCircleTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void RobotBoundedInCircleTest1() {
    RobotBoundedInCircle rbic = new RobotBoundedInCircle();
    String instructions = "GGLLGG";
    boolean expect = true;

    assertEquals(expect, rbic.isRobotBounded(instructions));
  }

  @Test
  public void RobotBoundedInCircleTest2() {
    RobotBoundedInCircle rbic = new RobotBoundedInCircle();
    String instructions = "GG";
    boolean expect = false;

    assertEquals(expect, rbic.isRobotBounded(instructions));
  }

  @Test
  public void RobotBoundedInCircleTest3() {
    RobotBoundedInCircle rbic = new RobotBoundedInCircle();
    String instructions = "GL";
    boolean expect = true;

    assertEquals(expect, rbic.isRobotBounded(instructions));
  }
}