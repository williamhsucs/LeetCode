import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordDictionaryTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void WordDictionaryTest1() {
    WordDictionary wd = new WordDictionary();
    wd.addWord("bad");
    wd.addWord("dad");
    wd.addWord("mad");
    assertEquals(false, wd.search("pad"));
    assertEquals(true, wd.search("bad"));
    assertEquals(true, wd.search(".ad"));
    assertEquals(true, wd.search("b.."));
  }
}