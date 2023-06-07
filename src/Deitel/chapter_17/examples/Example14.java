package Deitel.chapter_17.examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example14 {
    public static void main(String[] args) {
        Stream<Integer> list = Stream.of(1,23,45,6,7,9,23,6);
        Set<Integer> set = list.collect(Collectors.toSet());
        System.out.println(set);

        List<String > words = List.of("QWERTY","YUIOP","ASDFGH","JKL@","POIUYCVB","POIUYCVB","ASDFGH","JKL@");
//        Map<String,Integer> map =
//                words.stream()
//                        .collect(Collectors.toMap((st)->st, (st)->st.length()));
//        /*it can also take
//         a third argument for duplicate if it has duplicate keys.
//          merge (a,b)->a+b*/
//        System.out.println(map);

//        Map<String,Integer> map =
//                words.stream()
//                        .collect(Collectors.toMap((st)->st, (st)->st.length(),(a,b)->a+b));
//        /*it can also take
//         a third argument for duplicate if it has duplicate keys.
//          merge (a,b)->a+b*/
//        System.out.println(map);


                Map<String,Integer> map =
                words.stream()
                        .collect(Collectors.toMap((str)->str, (str)->str.length(),(a,b)->a+b, TreeMap::new));
        /*it can also take
         a third argument for duplicate if it has duplicate keys.
          merge (a,b)->a+b*/
        System.out.println(map);


    }
}
