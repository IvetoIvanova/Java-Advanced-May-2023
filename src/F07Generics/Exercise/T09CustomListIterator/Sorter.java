package F07Generics.Exercise.T09CustomListIterator;

import java.util.Collections;
import java.util.List;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        List<T> elements = customList.getElements();
        Collections.sort(elements);
    }
}
