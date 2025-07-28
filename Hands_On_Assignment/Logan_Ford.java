package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    public String getModelName() { return "Logan"; }
    public String getRegistrationNumber() { return "MH12CD4567"; }
    public String getOwnerName() { return "Max"; }
    public int speed() { return 90; }
    public int gps() { return 1; }
}

class Ford extends Vehicle {
    public String getModelName() { return "Ford Fiesta"; }
    public String getRegistrationNumber() { return "MH14PQ8765"; }
    public String getOwnerName() { return "Emma"; }
    public int speed() { return 100; }
    public int tempControl() { return 1; }
}