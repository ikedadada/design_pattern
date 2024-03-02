package composite.challenge;

public abstract class Entry {
    public Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    public String getPath() {
        if (parent == null) {
            return "/" + getName();
        }
        return parent.getPath() + "/" + getName();
    }

}
