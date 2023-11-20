package F07Generics.Exercise.T09CustomListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(this.elements, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T currentElement : this.elements) {
            if (currentElement.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return Collections.max(this.elements);
    }

    public T getMin() {
        return Collections.min(this.elements);
    }

    public List<T> getElements() {
        return elements;
    }

    public void print() {
        for (T element : this.elements) {
            System.out.println(element);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }
}
