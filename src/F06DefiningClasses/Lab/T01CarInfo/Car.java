package T01CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int hp) {
        this(brand);
        this.setModel(model);
        this.setHorsePower(hp);
    }

    public Car(String brand) {
        this.setBrand(brand);
        this.setModel("unknown");
        this.horsePower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());
    }
}