package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Example {

    public static void main(String[] args) {

        Bathroom bathroom1 = new Bathroom(20, 10, 3, 5);

        Galley galley1 = new Galley(true, 7);

        Propulsion propulsion1 = new Propulsion(4, 0);

        PassengerCabin passengerCabin1 = new PassengerCabin(555, 14, 300, 2, 400.25);

        Airplane airBus380 = new Airplane("AirBus A380", "Emirates", 320000, 320000, bathroom1, galley1, passengerCabin1, propulsion1);


        System.out.println(airBus380.bathroom.getFacialTissueRemaining());
        System.out.println(airBus380.bathroom.getFacialTissueCapacity());
        airBus380.bathroom.setFacialTissueRemaining(10);
        System.out.println(airBus380.bathroom.getFacialTissueRemaining());
        System.out.println();

        System.out.println(airBus380.bathroom.toString());
        System.out.println();

        System.out.println(airBus380.getAirline());
        System.out.println();

        System.out.println(airBus380.galley.isInFlightMealServed());
        airBus380.galley.setInFlightMealServed(false);
        System.out.println(airBus380.galley.isInFlightMealServed());
        System.out.println();

        System.out.println(airBus380.galley.toString());
        System.out.println();

        System.out.println(airBus380.passengerCabin.getTotalNumSeats());
        System.out.println();

        System.out.println(airBus380.passengerCabin.toString());
        System.out.println();

        System.out.println(airBus380.propulsion.getNumJets());
        System.out.println();

        System.out.println(airBus380.propulsion.toString());
        System.out.println();

        System.out.println(airBus380.toString());

    }

}
