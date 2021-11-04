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
  public void MyLinkedListTest1() {
    MyLinkedList list = new MyLinkedList();
    list.addAtHead(1);
    list.addAtTail(3);
    list.addAtIndex(1, 2);
    assertEquals(2, list.get(1));
    list.deleteAtIndex(1);
    assertEquals(3, list.get(1));
  }

  @Test
  public void MyLinkedListTest2() {
    MyLinkedList list = new MyLinkedList();
    list.addAtHead(1);
    list.addAtTail(3);
    list.addAtIndex(1, 2);
    assertEquals(2, list.get(1));
    list.deleteAtIndex(1);
    assertEquals(3, list.get(1));
    assertEquals(-1, list.get(3));
    list.deleteAtIndex(3);
    list.deleteAtIndex(0);
    assertEquals(3, list.get(0));
    list.deleteAtIndex(0);
    assertEquals(-1, list.get(0));
  }
}