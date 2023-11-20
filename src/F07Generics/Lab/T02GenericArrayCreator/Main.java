package T02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = ArrayCreator.create(10, "none");
        for (String str : stringArray) {
            System.out.println(str);
        }

        Integer[] intArray = ArrayCreator.create(Integer.class, 10, 0);
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
