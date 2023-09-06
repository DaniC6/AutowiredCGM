package it.daniele.model;

public class Display {

    private String dimensioneDisplay;

    public Display() {
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    @Override
    public String toString() {
        return "dimensioneDisplay = " + dimensioneDisplay;
    }
}
