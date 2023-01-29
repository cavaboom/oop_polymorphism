package transport;

public class transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;


    public transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
        if (year < 1900) {
            this.year = 2000;
        } else this.year = year;
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else this.country = country;
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else this.color = color;
        if (maxSpeed < 0) {
            this.maxSpeed = 60;
        } else this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "default";
        } else this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = 60;
        } else this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
