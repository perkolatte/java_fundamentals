package labs_examples.objects_classes_methods.labs.objects.airplane;

import java.util.HashMap;

public class Galley {

    private boolean inFlightMealServed;

    private int numCrewSeats;

    private HashMap<String, Float> menu = new HashMap<String, Float>();

    public Galley() {
    }

    public Galley(boolean inFlightMealServed, int numCrewSeats) {

        this.inFlightMealServed = inFlightMealServed;
        this.numCrewSeats = numCrewSeats;

    }

    @Override
    public String toString() {
        return "Galley{" +
                "inFlightMealServed=" + inFlightMealServed +
                ", numCrewSeats=" + numCrewSeats +
                ", menu=" + menu +
                '}';
    }

    public boolean isInFlightMealServed() {
        return inFlightMealServed;
    }

    public void setInFlightMealServed(boolean inFlightMealServed) {
        this.inFlightMealServed = inFlightMealServed;
    }

    public int getNumCrewSeats() {
        return numCrewSeats;
    }

    public void setNumCrewSeats(int numCrewSeats) {
        this.numCrewSeats = numCrewSeats;
    }

    public HashMap<String, Float> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Float> menu) {
        this.menu = menu;
    }
}
