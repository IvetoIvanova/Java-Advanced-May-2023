package T05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%s:%n", model));
        result.append(String.format("%s:%n", engine.getModel()));
        result.append(String.format("%s%n", engine));
        result.append(String.format("Weight: %s%n", weight != null ? weight : "n/a"));
        result.append(String.format("Color: %s%n", color != null ? color : "n/a"));
        return result.toString();
    }
}
