package F07Generics.Exercise.T11Threeuple;

public class Threeuple<T, U, V> extends Tuple<T, U> {
    private V item3;

    public Threeuple(T item1, U item2, V item3) {
        super(item1, item2);
        this.item3 = item3;
    }

    public V getItem3() {
        return item3;
    }

    public void setItem3(V item3) {
        this.item3 = item3;
    }
}
