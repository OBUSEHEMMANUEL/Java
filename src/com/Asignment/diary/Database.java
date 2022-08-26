package com.Asignment.diary;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Database {
    private ArrayList<Entry> entries;

    public Database() {
        entries = new ArrayList<>();
    }

    public void addEntries(LocalDateTime dateTime, String text) {
        entries.add(new Entry(dateTime, text));
    }

    public ArrayList<Entry> findEntries(LocalDateTime dateTime, boolean byTime) {
        ArrayList<Entry> found = new ArrayList<>();
        for (Entry entry : entries) {
            if ((byTime) && (entry.getDateTime().equals(dateTime))
                    ||
                    ((!byTime) && (entry.getDateTime().toLocalDate().equals(dateTime.toLocalDate())))) ;
        }
        return  found;
    }
    public void deleteEntries(LocalDateTime dateTime){
        ArrayList<Entry> found = new ArrayList<>();
        for(Entry entry : found){
        entries.remove(entry);
    }
}
}