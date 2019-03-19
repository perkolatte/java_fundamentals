package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Propulsion {

    private int numJets;
    private int numProps;

    public Propulsion() {
    }

    public Propulsion(int numJets, int numProps) {

        this.numJets = numJets;
        this.numProps = numProps;

    }

    @Override
    public String toString() {
        return "Propulsion{" +
                "numJets=" + numJets +
                ", numProps=" + numProps +
                '}';
    }

    public int getNumJets() {
        return numJets;
    }

    public void setNumJets(int numJets) {
        this.numJets = numJets;
    }

    public int getNumProps() {
        return numProps;
    }

    public void setNumProps(int numProps) {
        this.numProps = numProps;
    }
}
