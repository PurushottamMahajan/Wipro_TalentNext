package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelName() { return "Honda Shine"; }
    public String getRegistrationNumber() { return "MH12XY7890"; }
    public String getOwnerName() { return "Alex"; }
    public int getSpeed() { return 70; }
    public void cdplayer() { System.out.println("CD Player is playing"); }
}