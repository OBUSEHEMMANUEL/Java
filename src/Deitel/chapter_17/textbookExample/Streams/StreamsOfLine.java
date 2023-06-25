package Deitel.chapter_17.textbookExample.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamsOfLine {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");

        Map<String, Long> wordCounts = Files.lines(Paths.get("test.txt"))
                .flatMap(line -> pattern.splitAsStream(line)).collect(Collectors.groupingBy(line -> line.toLowerCase(),()->new TreeMap<>(),
                        Collectors.counting()));

        var words = wordCounts.entrySet().stream().collect(Collectors.groupingBy(entry->entry.getKey().charAt(0),
                TreeMap::new,Collectors.toList()));
        //System.out.println(words);
        for(Character w: words.keySet()){
            System.out.println(w);
            for (List k : words.values()){
                System.out.println(k);
            }
        }
        //System.out.println(wordCounts);

    }
}
