package com.company.bean.old;

public class SteamTrain {
    private OldEngine engine;
    private String model;


    public SteamTrain() {
    }

    public SteamTrain(OldEngine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OldEngine getEngine() {
        return engine;
    }

    public void setEngine(OldEngine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "SteamTrain{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }
}
