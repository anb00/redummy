package com.iesemilidarder.asoto.data;

import com.sun.istack.internal.localization.NullLocalizable;

/**
 * com.iesemilidarder.asoto.data
 * Class Vehicle
 * By berto. 04/10/2018
 */
public abstract class Vehicle {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        if (numWheels == null || numWheels > 3) {
            this.numWheels = numWheels;
            throw new IESMyException();
        }
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String color;
    private Integer numWheels;
    private Double price;


    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }

    /**
     * Prints the message where it should
     *
     * @param message txt
     */
    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
