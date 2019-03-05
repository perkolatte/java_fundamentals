package objects_classes_methods.labs.objects.Airplane;

public class Airplane {

    String model;
    String airline;

    double fuelCapacityInLitres;
    double currentFuelLevelInLitres;

    Bathroom bathroom;
    Galley galley;
    PassengerCabin passengerCabin;
    Propulsion propulsion;

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

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Galley getGalley() {
        return galley;
    }

    public void setGalley(Galley galley) {
        this.galley = galley;
    }

    public PassengerCabin getPassengerCabin() {
        return passengerCabin;
    }

    public void setPassengerCabin(PassengerCabin passengerCabin) {
        this.passengerCabin = passengerCabin;
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }
}
