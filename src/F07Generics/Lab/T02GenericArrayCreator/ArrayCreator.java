package T02GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int length, T item) {
        return createGenericArray(length, item);
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    private static <T> T[] createGenericArray(int length, T item) {
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}
