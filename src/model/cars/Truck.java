package model.cars;

import model.people.IOwner;

public class Truck extends Car implements ICargo{
    private double maxCargoWeight;
    private int maxCapacity;

    public Truck() {
    }

    public Truck(double maxCargoWeight, int maxCapacity) {
        this.maxCargoWeight = maxCargoWeight;
        this.maxCapacity = maxCapacity;
    }

    public Truck(String model, int mileage, Color color, IOwner owner, double maxCargoWeight, int maxCapacity) {
        super(model, mileage, color, owner);
        this.maxCargoWeight = maxCargoWeight;
        this.maxCapacity = maxCapacity;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.cars.Truck{");
        sb.append("model='").append(getModel()).append('\'');
        sb.append(", mileage=").append(getMileage());
        sb.append(", color=").append(getColor());
        sb.append(", owner=").append(getOwner());
        sb.append(", maxCargoWeight=").append(maxCargoWeight);
        sb.append(", maxCapacity=").append(maxCapacity);
        sb.append('}');
        return sb.toString();
    }
}
