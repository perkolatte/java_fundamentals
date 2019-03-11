package objects_classes_methods.labs.objects.Airplane;

public class Airplane {

    private String model;
    private String airline;

    private double fuelCapacityInLitres;
    private double currentFuelLevelInLitres;

    Bathroom bathroom;
    Galley galley;
    PassengerCabin passengerCabin;
    Propulsion propulsion;

    public Airplane() {
    }

    public Airplane(String model, String airline, double fuelCapacityInLitres, double currentFuelLevelInLitres, Bathroom bathroom, Galley galley, PassengerCabin passengerCabin, Propulsion propulsion) {
        this.model = model;
        this.airline = airline;
        this.fuelCapacityInLitres = fuelCapacityInLitres;
        this.currentFuelLevelInLitres = currentFuelLevelInLitres;
        this.bathroom = bathroom;
        this.galley = galley;
        this.passengerCabin = passengerCabin;
        this.propulsion = propulsion;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacityInLitres=" + fuelCapacityInLitres +
                ",\n currentFuelLevelInLitres=" + currentFuelLevelInLitres +
                ",\n bathroom=" + bathroom +
                ",\n galley=" + galley +
                ",\n passengerCabin=" + passengerCabin +
                ",\n propulsion=" + propulsion +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getFuelCapacity() {
        return fuelCapacityInLitres;
    }

    public void setFuelCapacity(double fuelCapacityInLitres) {
        this.fuelCapacityInLitres = fuelCapacityInLitres;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevelInLitres;
    }

    public void setCurrentFuelLevel(double currentFuelLevelInLitres) {
        this.currentFuelLevelInLitres = currentFuelLevelInLitres;
    }
}
