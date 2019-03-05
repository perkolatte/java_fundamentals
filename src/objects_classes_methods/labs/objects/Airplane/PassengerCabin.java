package objects_classes_methods.labs.objects.Airplane;

public class PassengerCabin {

    int total;
    int numBusinessClass;
    int numEconomyClass;

    int numAisles;

    double overheadCargoCapacity;

    public PassengerCabin(int total,
                          int numBusinessClass,
                          int numEconomyClass,
                          int numAisles,
                          double overheadCargoCapacity) {

        this.total = total;
        this.numBusinessClass = numBusinessClass;
        this.numEconomyClass = numEconomyClass;
        this.numAisles = numAisles;
        this.overheadCargoCapacity = overheadCargoCapacity;

    }

    @Override
    public String toString() {
        return "PassengerCabin{" +
                "total=" + total +
                ", numBusinessClass=" + numBusinessClass +
                ", numEconomyClass=" + numEconomyClass +
                ", numAisles=" + numAisles +
                ", overheadCargoCapacity=" + overheadCargoCapacity +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
