package Diary;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Diary {
    private int counter;
    private Entry entry;

    static List<Entry> entries = new ArrayList<>();


    public void add(Entry word) {
        counter++;
        word.setId(counter);
        entries.add(word);
    }
    public int size(){
        return entries.size();
    }

    public Entry getEntry(int index) {
        for(Entry entry : entries){
            if(entry.equals(getEntry(index))) return entry;
        }
        throw new InputMismatchException("Search not found");
    }

}
