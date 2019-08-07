package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class Exercise_01 {

    public static void main(String[] args) {

        HashMap<String, String> numBedrooms = new HashMap<>();

        numBedrooms.put("Unit 1", "1 bedroom");
        numBedrooms.put("Unit 2", "3 bedroom");
        numBedrooms.put("Unit 3", "1 bedroom");
        numBedrooms.put("Unit 4", "2 bedroom");
        numBedrooms.put("Unit 5", "2 bedroom");
        numBedrooms.put("Unit 6", "studio");

        System.out.println("Unit 4 is a " + numBedrooms.get("Unit 4") + " apartment.\n");

        HashMap<String, String> numBedrooms_copy = new HashMap<>();
        numBedrooms.putAll(numBedrooms);

        System.out.println("This complex has " + numBedrooms.size() + " units.\n");

        System.out.println("Complex contains a unit 7: " + numBedrooms.containsKey("Unit 7") + "\n");

        Set entries = numBedrooms.entrySet();
        Iterator iter = entries.iterator();
        while (iter.hasNext()) {
            Map.Entry unit = (Map.Entry) iter.next();
            System.out.println(unit.getKey() + " is a " + unit.getValue() + " apartment.");
        }
        System.out.println();

        Set units = numBedrooms.keySet();
        iter = units.iterator();
        while (iter.hasNext()) {
            Object unit = iter.next();
            System.out.println(unit);
        }
        System.out.println();

        numBedrooms.putIfAbsent("Unit 6", "4 bedrooms");
        System.out.println(numBedrooms.get("Unit 6"));

        numBedrooms.remove("Unit 3");
        System.out.println(numBedrooms.get("Unit 3"));

        numBedrooms.replace("Unit 2", "2 bedroom");
        System.out.println(numBedrooms.get("Unit 2") + "\n");

        System.out.println(".forEach:");
        numBedrooms.forEach((k, v) -> {
            System.out.println(k + " is a " + v + " apartment.");
        });


        System.out.println("\ncleared:");
        numBedrooms.clear();
        entries = numBedrooms.entrySet();
        iter = entries.iterator();
        while (iter.hasNext()) {
            Map.Entry unit = (Map.Entry) iter.next();
            System.out.println(unit.getKey() + " is a " + unit.getValue() + " apartment.");
        }

    }

}