package F10ExamTasks;

import java.util.*;
import java.util.stream.Collectors;

public class SantasPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String materialsInput = scanner.nextLine();
        String magicsInput = scanner.nextLine();

        Stack<Integer> materials = new Stack<>();
        Arrays.stream(materialsInput.split("\\s+"))
                .map(Integer::parseInt).forEach(materials::push);

        Queue<Integer> magics = Arrays.stream(magicsInput.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        Map<String, Integer> presentMap = new TreeMap<>();
        presentMap.put("Doll", 0);
        presentMap.put("Wooden train", 0);
        presentMap.put("Teddy bear", 0);
        presentMap.put("Bicycle", 0);

        while (!materials.isEmpty() && !magics.isEmpty()) {
            int material = materials.peek();
            int magic = magics.peek();

            int totalMagic = material * magic;

            if (totalMagic == 150) {
                materials.pop();
                magics.poll();
                presentMap.put("Doll", presentMap.get("Doll") + 1);
            } else if (totalMagic == 250) {
                materials.pop();
                magics.poll();
                presentMap.put("Wooden train", presentMap.get("Wooden train") + 1);
            } else if (totalMagic == 300) {
                materials.pop();
                magics.poll();
                presentMap.put("Teddy bear", presentMap.get("Teddy bear") + 1);
            } else if (totalMagic == 400) {
                materials.pop();
                magics.poll();
                presentMap.put("Bicycle", presentMap.get("Bicycle") + 1);
            } else if (totalMagic < 0) {
                int sum = material + magic;
                materials.pop();
                magics.poll();
                materials.push(sum);
            } else if (totalMagic > 0) {
                magics.poll();
                materials.push(materials.pop() + 15);
            } else {
                if (magic == 0) {
                    magics.poll();
                }

                if (material == 0) {
                    materials.pop();
                }
            }
        }
        boolean isDollAndTrain = presentMap.get("Doll") > 0 && presentMap.get("Wooden train") > 0;
        boolean isBearAndBicycle = presentMap.get("Teddy bear") > 0 && presentMap.get("Bicycle") > 0;
        if (isDollAndTrain || isBearAndBicycle) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        if (!materials.isEmpty()) {
            System.out.print("Materials left: ");
            Collections.reverse(materials);
            System.out.println(materials.toString().replace("[", "").replace("]", ""));
        }

        if (!magics.isEmpty()) {
            System.out.print("Magic left: ");
            System.out.println(magics.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        for (Map.Entry<String, Integer> entry : presentMap.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
