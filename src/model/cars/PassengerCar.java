package model.cars;

import model.people.IOwner;

public class PassengerCar extends Car{
    private int passengerNumber;

    public PassengerCar() {
    }

    public PassengerCar(String model, int mileage, Color color, IOwner owner, int passengerNumber) {
        super(model, mileage, color, owner);
        this.passengerNumber = passengerNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.cars.PassengerCar{");
        sb.append("model='").append(getModel()).append('\'');
        sb.append(", mileage=").append(getMileage());
        sb.append(", color=").append(getColor());
        sb.append(", owner=").append(getOwner());
        sb.append(", passengerNumber=").append(passengerNumber);
        sb.append('}');
        return sb.toString();
    }
}
