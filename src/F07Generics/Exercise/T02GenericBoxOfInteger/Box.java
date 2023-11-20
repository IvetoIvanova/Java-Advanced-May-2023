package F07Generics.Exercise.T02GenericBoxOfInteger;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", value.getClass().getName(), value);
    }
}
