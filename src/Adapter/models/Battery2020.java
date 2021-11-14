package Adapter.models;

import Adapter.BatteryAdapter;
import Adapter.abstractions.Battery;

public class Battery2020 {
    private int batteryWeight = 537;
    private int batterySpecificEnergy = 186;

    public int getBatteryWeight() {
        return batteryWeight;
    }

    public int getBatterySpecificEnergy() {
        return batterySpecificEnergy;
    }
}
