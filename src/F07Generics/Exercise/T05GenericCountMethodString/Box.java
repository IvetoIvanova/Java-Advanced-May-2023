package F07Generics.Exercise.T05GenericCountMethodString;

import java.util.List;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public int compareTo(Box<T> otherBox) {
        return this.value.compareTo(otherBox.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(List<Box<T>> list, T value) {
        int count = 0;
        for (Box<T> element : list) {
            if (element.compareTo(new Box<>(value)) > 0) {
                count++;
            }
        }
        return count;
    }
}
