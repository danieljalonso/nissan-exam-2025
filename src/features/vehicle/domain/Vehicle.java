package features.vehicle.domain;

public class Vehicle {

    private String id;
    private String model;
    private String color;
    private String power;
    private String doors;

    public Vehicle(String id, String model, String color, String power, String doors) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.power = power;
        this.doors = doors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }
}
