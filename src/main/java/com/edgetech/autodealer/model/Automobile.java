package com.edgetech.autodealer.model;

public class Automobile {
    private String year;
    private String make;
    private String model;
    private boolean automatic;
    private String trim;
    private int milage;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public Automobile(String year, String make, String model, boolean automatic, String trim) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.automatic = automatic;
        this.trim = trim;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", automatic=" + automatic +
                ", trim='" + trim + '\'' +
                ", milage=" + milage +
                '}';
    }
}
