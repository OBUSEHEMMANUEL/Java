package Deitel.chapter_16;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();
        for (String color : colors) {
            list.add(color);
        }

        System.out.println(list);
        String[] removeColors ={"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();
            for (String removeColor: removeColors) {
                removeList.add(removeColor);
            }


        System.out.println(removeList);

        Collections.sort(removeList);
        System.out.println("REMOVE COLLECTIONS: "+removeList);

        Collections.sort(removeList,Collections.reverseOrder());
        System.out.println("REVERSE COLLECTIONS : "+removeList);


        list.addAll(List.of(removeColors));
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ",list.get(i));
        }
        removeColor(list,removeList);
        System.out.println();
        System.out.println("After removal");

        System.out.println(list);
}
public static void removeColor(Collection<String> collection1, Collection<String> collection2){
    Iterator<String> iterator = collection1.iterator();
    while (iterator.hasNext()){
        if (collection2.contains(iterator.next())){
            iterator.remove();
        }
    }


    }
}
