package objects_classes_methods.labs.objects.Airplane;

public class PassengerCabin {

    private int totalNumSeats;
    private int numBusinessClass;
    private int numEconomyClass;

    private int numAisles;

    private double overheadCargoCapacity;

    public PassengerCabin() {
    }

    public PassengerCabin(int totalNumSeats,
                          int numBusinessClass,
                          int numEconomyClass,
                          int numAisles,
                          double overheadCargoCapacity) {

        this.totalNumSeats = totalNumSeats;
        this.numBusinessClass = numBusinessClass;
        this.numEconomyClass = numEconomyClass;
        this.numAisles = numAisles;
        this.overheadCargoCapacity = overheadCargoCapacity;

    }

    @Override
    public String toString() {
        return "PassengerCabin{" +
                "totalNumSeats=" + totalNumSeats +
                ", numBusinessClass=" + numBusinessClass +
                ", numEconomyClass=" + numEconomyClass +
                ", numAisles=" + numAisles +
                ", overheadCargoCapacity=" + overheadCargoCapacity +
                '}';
    }

    public int getTotalNumSeats() {
        return totalNumSeats;
    }

    public void setTotalNumSeats(int totalNumSeats) {
        this.totalNumSeats = totalNumSeats;
    }

    public int getNumBusinessClass() {
        return numBusinessClass;
    }

    public void setNumBusinessClass(int numBusinessClass) {
        this.numBusinessClass = numBusinessClass;
    }

    public int getNumEconomyClass() {
        return numEconomyClass;
    }

    public void setNumEconomyClass(int numEconomyClass) {
        this.numEconomyClass = numEconomyClass;
    }

    public int getNumAisles() {
        return numAisles;
    }

    public void setNumAisles(int numAisles) {
        this.numAisles = numAisles;
    }

    public double getOverheadCargoCapacity() {
        return overheadCargoCapacity;
    }

    public void setOverheadCargoCapacity(double overheadCargoCapacity) {
        this.overheadCargoCapacity = overheadCargoCapacity;
    }
}
