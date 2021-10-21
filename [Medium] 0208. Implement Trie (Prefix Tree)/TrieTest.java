import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrieTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void TrieTest1() {
    Trie trie = new Trie();
    trie.insert("apple");
    assertEquals(true, trie.search("apple"));   // return True
    assertEquals(false, trie.search("app"));     // return False
    assertEquals(true, trie.startsWith("app")); // return True
    trie.insert("app");
    assertEquals(true, trie.search("app"));     // return True
  }
}