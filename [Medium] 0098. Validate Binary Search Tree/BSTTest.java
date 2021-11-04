import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BSTTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void BSTTest1() {
    BST bst = new BST();
    TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    assertEquals(true, bst.isValidBST(node));
  }

  @Test
  public void BSTTest2() {
    BST bst = new BST();
    TreeNode node = new TreeNode(2, new TreeNode(2), new TreeNode(2));
    assertEquals(false, bst.isValidBST(node));
  }

  @Test
  public void BSTTest3() {
    BST bst = new BST();
    TreeNode node1 = new TreeNode(4, new TreeNode(3), new TreeNode(6));
    TreeNode node2 = new TreeNode(5, new TreeNode(1), node1);
    assertEquals(false, bst.isValidBST(node2));
  }

  @Test
  public void BSTTest4() {
    BST bst = new BST();
    TreeNode node1 = new TreeNode(-60, new TreeNode(-60), new TreeNode(-6));
    TreeNode node2 = new TreeNode(24, node1, null);
    assertEquals(false, bst.isValidBST(node2));
  }

  @Test
  public void BSTTest5() {
    BST bst = new BST();
    TreeNode node = new TreeNode(-2147483648, new TreeNode(-2147483648), null);
    assertEquals(false, bst.isValidBST(node));
  }

  @Test
  public void BSTTest6() {
    BST bst = new BST();
    TreeNode node = new TreeNode(-2147483648, null, new TreeNode(2147483647));
    assertEquals(true, bst.isValidBST(node));
  }

  @Test
  public void BSTTest7() {
    BST bst = new BST();
    TreeNode node1 = new TreeNode(160, new TreeNode(150), new TreeNode(200));
    TreeNode node2 = new TreeNode(130, new TreeNode(119), new TreeNode(135));
    TreeNode node3 = new TreeNode(100, new TreeNode(75), new TreeNode(110));
    TreeNode node4 = new TreeNode(50, new TreeNode(20), new TreeNode(55));

    TreeNode node5 = new TreeNode(140, node2, node1);
    TreeNode node6 = new TreeNode(70, node4, node3);

    TreeNode node7 = new TreeNode(120, node6, node5);
    assertEquals(false, bst.isValidBST(node7));
  }
}