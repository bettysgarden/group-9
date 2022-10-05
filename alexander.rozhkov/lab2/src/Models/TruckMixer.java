package Models;

import java.util.Objects;

public class TruckMixer extends ConstructionVehicle {
    int containerCapacity;

    public TruckMixer(String model, int motorPower, int containerCapacity) {
        super(model, motorPower);
        this.containerCapacity = containerCapacity;
    }

    public int getContainerCapacity() {
        return containerCapacity;
    }

    @Override
    public void someAction() {
        System.out.println("Бетономешалка работает... ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof TruckMixer that)) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }
        return containerCapacity == that.containerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), containerCapacity);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString() + "\nОбъем ёмкости - " + containerCapacity + "л";
    }

    @Override
    public int getMotorPower() {
        return motorPower;
    }
}