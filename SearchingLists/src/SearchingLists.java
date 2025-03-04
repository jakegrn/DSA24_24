import java.io.IOException;
import java.util.List;
import java.io.File;
import java.nio.file.Files;

public class SearchingLists {
    public static void main(String[] args) throws IOException {
        File file = new File("countries.txt");
        List<String> countries = Files.readAllLines(file.toPath());
        //System.out.println(countries);
        //System.out.println(countries.getClass());
        System.out.println(countries.indexOf("YEMEN;YE"));

        int dummy = 0;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            dummy += countries.indexOf("YEMEN;YE");
        }
        System.out.println( System.currentTimeMillis() - start + " ms");

    }
}