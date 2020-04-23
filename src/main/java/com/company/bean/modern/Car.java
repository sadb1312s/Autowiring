package com.company.bean.modern;

public class Car {
    private ModernEngine engine;
    private String vin;

    public Car() {
    }

    public Car(ModernEngine engine, String vin) {
        this.engine = engine;
        this.vin = vin;
    }

    public ModernEngine getEngine() {
        return engine;
    }

    public void setEngine(ModernEngine engine) {
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", vin='" + vin + '\'' +
                '}';
    }
}
