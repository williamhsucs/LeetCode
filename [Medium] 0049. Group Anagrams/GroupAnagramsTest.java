import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupAnagramsTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void GroupAnagramsTest1() {
    GroupAnagrams ga = new GroupAnagrams();
    String[] strs = {"a"};
    List<List<String>> expect = Arrays.asList(Arrays.asList("a"));
  
    assertEquals(expect, ga.groupAnagrams(strs));
  }

  @Test
  public void GroupAnagramsTest2() {
    GroupAnagrams ga = new GroupAnagrams();
    String[] strs = {""};
    List<List<String>> expect = Arrays.asList(Arrays.asList(""));
  
    assertEquals(expect, ga.groupAnagrams(strs));
  }

  @Test
  public void GroupAnagramsTest3() {
    GroupAnagrams ga = new GroupAnagrams();
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    List<List<String>> expect = Arrays.asList(Arrays.asList("tan","nat"),Arrays.asList("eat","tea","ate"),Arrays.asList("bat"));
  
    assertEquals(expect, ga.groupAnagrams(strs));
  }
}