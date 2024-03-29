package model.cars;

import model.people.IOwner;

public class Tractor extends Car implements ICargo{
    private int maxCargoWeight;

    public Tractor() {
    }

    public Tractor(String model, int mileage, Color color, IOwner owner, int maxCargoWeight) {
        super(model, mileage, color, owner);
        this.maxCargoWeight = maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.cars.Tractor{");
        sb.append("model='").append(getModel()).append('\'');
        sb.append(", mileage=").append(getMileage());
        sb.append(", color=").append(getColor());
        sb.append(", owner=").append(getOwner());
        sb.append(", maxCargoWeight=").append(maxCargoWeight);
        sb.append('}');
        return sb.toString();
    }
}
