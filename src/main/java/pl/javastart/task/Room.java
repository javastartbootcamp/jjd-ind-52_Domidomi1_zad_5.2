package pl.javastart.task;

import java.util.Scanner;

public class Room {

    double temperature;
    boolean airConditionair;
    double x = 1.0;
    double y = 0.0;

    public double currentTemperature(double temperature, double x) {
        return temperature - x;
    }

    public double noAirConditionairTemperature(double temperature, double y) {
        return temperature - y;
    }

    private double temperature() {
        return 0;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditionair() {
        return airConditionair;
    }

    public void setAirConditionair(boolean airConditionair) {
        this.airConditionair = airConditionair;
    }
}
