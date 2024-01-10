package model.cars;

public interface ICargo {
    double getMaxCargoWeight();
    default int getMaxCapacity(){ //классы, реализующие интерфейс не обязанны переопределять default метод
        return 0;
    }
}
