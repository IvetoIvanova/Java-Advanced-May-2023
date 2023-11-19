package T05CarSalesman;

public class Engine {
    private String model;
    private int power;
    private Integer displacement;
    private String efficiency;

    public Engine(String model, int power, Integer displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Power: %d%n", power));
        result.append(String.format("Displacement: %s%n", displacement != null ? displacement : "n/a"));
        result.append(String.format("Efficiency: %s", efficiency != null ? efficiency : "n/a"));
        return result.toString();
    }

    public String getModel() {
        return model;
    }
}
