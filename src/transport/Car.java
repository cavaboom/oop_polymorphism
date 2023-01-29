package transport;

public class Car extends transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatsAmount;
    private boolean isWinter;

    public class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessEntry;

        public Key (boolean remoteStartEngine, boolean keylessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }
    public Car(String brand, String model, double engineVolume, String color, double maxSpeed, int year, String country, String transmission, String bodyType, String regNumber, int seatsAmount, boolean isWinter) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (transmission == null || transmission.isEmpty()){
            this.transmission = "default";
        } else this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else this.bodyType = bodyType;

        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "default";
        } else this.regNumber = regNumber;

        if (seatsAmount <= 0) {
            this.seatsAmount = 4;
        } else this.seatsAmount = seatsAmount;

        this.isWinter = isWinter;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "default";
        } else this.regNumber = regNumber;
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }

    public void changeTires(int month) {
        if (month >= 1 && month <= 3 || month >= 11 && month <= 12) {
            setWinter(true);
        }
        if (month >= 4 && month <= 10) {
            setWinter(false);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", seatsAmount=" + seatsAmount +
                ", isWinter=" + isWinter +
                '}';
    }
}


