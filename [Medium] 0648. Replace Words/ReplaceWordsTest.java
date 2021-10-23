import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceWordsTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void ReplaceWordsTest1() {
    ReplaceWords replaceWords = new ReplaceWords();
    List<String> dicionary = Arrays.asList("cat", "bat", "rat");
    String sentence = "the cattle was rattled by the battery";
    String expect = "the cat was rat by the bat";

    assertEquals(expect, replaceWords.replaceWords(dicionary, sentence));
  }

  @Test
  public void ReplaceWordsTest2() {
    ReplaceWords replaceWords = new ReplaceWords();
    List<String> dicionary = Arrays.asList("a", "aa", "aaa", "aaaa");
    String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
    String expect = "a a a a a a a a bbb baba a";

    assertEquals(expect, replaceWords.replaceWords(dicionary, sentence));
  }

  @Test
  public void ReplaceWordsTest3() {
    ReplaceWords replaceWords = new ReplaceWords();
    List<String> dicionary = Arrays.asList("a","b","c");
    String sentence = "aadsfasf absbs bbab cadsfafs";
    String expect = "a a b c";

    assertEquals(expect, replaceWords.replaceWords(dicionary, sentence));
  }

  @Test
  public void ReplaceWordsTest4() {
    ReplaceWords replaceWords = new ReplaceWords();
    List<String> dicionary = Arrays.asList("catt","cat","bat","rat");
    String sentence = "the cattle was rattled by the battery";
    String expect = "the cat was rat by the bat";

    assertEquals(expect, replaceWords.replaceWords(dicionary, sentence));
  }

  @Test
  public void ReplaceWordsTest5() {
    ReplaceWords replaceWords = new ReplaceWords();
    List<String> dicionary = Arrays.asList("ac","ab");
    String sentence = "it is abnormal that this solution is accepted";
    String expect = "it is ab that this solution is ac";

    assertEquals(expect, replaceWords.replaceWords(dicionary, sentence));
  }
}