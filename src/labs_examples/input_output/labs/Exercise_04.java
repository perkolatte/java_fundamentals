package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class CsvParsingExample {

    public static void main(String[] args) {

        ArrayList<Resettlement> resettlements = new ArrayList();
        String source = "src/labs_examples/input_output/files/unhcr-resettlement-residing-usa-csv-1.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(source))) {

            br.readLine();
            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                resettlements.add(mapValuesToResettlementObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for(Resettlement resettlement : resettlements){
//            System.out.println(resettlement.toString());
//        }

        String targetFile = "src/labs_examples/input_output/files/resettlements.csv";
        saveResettlementObjectsToCsv(resettlements, targetFile);

    }

    private static Resettlement mapValuesToResettlementObject(String[] source) {

        Resettlement resettlement = new Resettlement();

        resettlement.setAsylumCountry(source[0]);
        resettlement.setOriginCountry(source[1]);
        resettlement.setYear(Integer.parseInt(source[2]));
        if (source[3].equals("*")) {
            resettlement.setNumberAffected(-1);
        } else {
            resettlement.setNumberAffected(Integer.parseInt(source[3]));
        }

        return resettlement;

    }

    private static void saveResettlementObjectsToCsv(ArrayList<Resettlement> resettlements, String targetFile) {

        try (BufferedWriter bW = new BufferedWriter(new FileWriter(targetFile))) {

            for(Resettlement resettlement : resettlements){

                String asylumCountry = resettlement.getAsylumCountry();
                String originCountry = resettlement.getOriginCountry();
                int year = resettlement.getYear();
                int numAffected = resettlement.getNumberAffected();

                if (numAffected == -1) {
                    bW.write(asylumCountry + "," + originCountry + "," + year + "," + "*" + "\n");
                } else {
                    bW.write(asylumCountry + "," + originCountry + "," + year + "," + numAffected + "\n");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Resettlement {

    private String asylumCountry;
    private String originCountry;
    private int year;
    private int numberAffected;

    public Resettlement() {
    }

    public Resettlement(String asylumCountry, String originCountry, int year, int numberAffected) {
        this.asylumCountry = asylumCountry;
        this.originCountry = originCountry;
        this.year = year;
        this.numberAffected = numberAffected;
    }

    @Override
    public String toString() {
        return "Resettlement{" +
                "asylumCountry='" + asylumCountry + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", year=" + year +
                ", numberAffected=" + numberAffected +
                '}';
    }

    public String getAsylumCountry() {
        return asylumCountry;
    }

    public void setAsylumCountry(String asylumCountry) {
        this.asylumCountry = asylumCountry;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberAffected() {
        return numberAffected;
    }

    public void setNumberAffected(int numberAffected) {
        this.numberAffected = numberAffected;
    }
}