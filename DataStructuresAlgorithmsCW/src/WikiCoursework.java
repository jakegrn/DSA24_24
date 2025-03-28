import java.io.IOException;
import dsa.cw2425.WikiFetcher;
import java.util.*;

public class WikiCoursework {
  public static void main(String[] args) throws IOException {

    List<String> urls = new ArrayList<>();
    Map<String, TreeSet<String>> pageWords = new TreeMap<>();

    for (int i = 0; i < 5; i++) {
      WikiFetcher wf = new WikiFetcher();
      String url = wf.getUrl();
      String[] words = wf.getWords();

      TreeSet<String> selectedWords = new TreeSet<>();
      List<String> wordList = Arrays.asList(words);
      Collections.shuffle(wordList);

      for (int j = 0; j < 10; j++) {
        selectedWords.add(wordList.get(j));
      }

      urls.add(url);
      pageWords.put(url, selectedWords);
    }

    WikiFetcher.deepPrint(pageWords);
  }
}