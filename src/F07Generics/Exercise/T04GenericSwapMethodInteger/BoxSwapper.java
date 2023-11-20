package F07Generics.Exercise.T04GenericSwapMethodInteger;

import java.util.List;

public class BoxSwapper {
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        //Invalid indexes for swapping
//        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
//            return;
//        }

        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}