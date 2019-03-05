package objects_classes_methods.labs.objects.Airplane;

public class Bathroom {

    int tpCapacity;
    int tpRemaining;

    int facialTissueCapacity;
    int facialTissueRemaining;

    int toiletSeatCoverCapacity;
    int toiletSeatCoverRemaining;

    int handSoapCapacity;
    int handSoapRemaining;

    boolean dueForCleaning;

    boolean occupied;

    public Bathroom(int tpCapacity,
                    int facialTissueCapacity,
                    int toiletSeatCoverCapacity,
                    int handSoapCapacity) {

        this.tpCapacity = tpCapacity;
        this.facialTissueCapacity = facialTissueCapacity;
        this.toiletSeatCoverCapacity = toiletSeatCoverCapacity;
        this.handSoapCapacity = handSoapCapacity;

    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "tpCapacity=" + tpCapacity +
                ", tpRemaining=" + tpRemaining +
                ", facialTissueCapacity=" + facialTissueCapacity +
                ", facialTissueRemaining=" + facialTissueRemaining +
                ", toiletSeatCoverCapacity=" + toiletSeatCoverCapacity +
                ", toiletSeatCoverRemaining=" + toiletSeatCoverRemaining +
                ", handSoapCapacity=" + handSoapCapacity +
                ", handSoapRemaining=" + handSoapRemaining +
                ", dueForCleaning=" + dueForCleaning +
                ", occupied=" + occupied +
                '}';
    }

    public int getTpCapacity() {
        return tpCapacity;
    }

    public void setTpCapacity(int tpCapacity) {
        this.tpCapacity = tpCapacity;
    }

    public int getTpRemaining() {
        return tpRemaining;
    }

    public void setTpRemaining(int tpRemaining) {
        this.tpRemaining = tpRemaining;
    }

    public int getFacialTissueCapacity() {
        return facialTissueCapacity;
    }

    public void setFacialTissueCapacity(int facialTissueCapacity) {
        this.facialTissueCapacity = facialTissueCapacity;
    }

    public int getFacialTissueRemaining() {
        return facialTissueRemaining;
    }

    public void setFacialTissueRemaining(int facialTissueRemaining) {
        this.facialTissueRemaining = facialTissueRemaining;
    }

    public int getToiletSeatCoverCapacity() {
        return toiletSeatCoverCapacity;
    }

    public void setToiletSeatCoverCapacity(int toiletSeatCoverCapacity) {
        this.toiletSeatCoverCapacity = toiletSeatCoverCapacity;
    }

    public int getToiletSeatCoverRemaining() {
        return toiletSeatCoverRemaining;
    }

    public void setToiletSeatCoverRemaining(int toiletSeatCoverRemaining) {
        this.toiletSeatCoverRemaining = toiletSeatCoverRemaining;
    }

    public int getHandSoapCapacity() {
        return handSoapCapacity;
    }

    public void setHandSoapCapacity(int handSoapCapacity) {
        this.handSoapCapacity = handSoapCapacity;
    }

    public int getHandSoapRemaining() {
        return handSoapRemaining;
    }

    public void setHandSoapRemaining(int handSoapRemaining) {
        this.handSoapRemaining = handSoapRemaining;
    }

    public boolean isDueForCleaning() {
        return dueForCleaning;
    }

    public void setDueForCleaning(boolean dueForCleaning) {
        this.dueForCleaning = dueForCleaning;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
