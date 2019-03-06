package objects_classes_methods.labs.objects.Airplane;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Example {

    public static void main(String[] args) {

        Bathroom bathroom1 = new Bathroom(20, 10, 3, 5);

        Galley galley1 = new Galley(true, 7);

        Propulsion propulsion1 = new Propulsion(4, 0);

        PassengerCabin passengerCabin1 = new PassengerCabin(555, 14, 300, 2, 400.25);

        Airplane airBus380 = new Airplane("AirBus A380", "Emirates", 320000, 320000, bathroom1, galley1, passengerCabin1, propulsion1);

        System.out.println(airBus380.toString());

    }

}
