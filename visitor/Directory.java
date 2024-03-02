package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Directory extends Entry implements Iterable<Entry> {
    private String name;
    private List<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() {
        return entries.iterator();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}
