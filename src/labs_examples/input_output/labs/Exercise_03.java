package labs_examples.input_output.labs;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Exercise_03 {

        public static void main (String[]args) {

            byte[] byteArray = {0, 1, 2, 3, 4};
            int bufferSizeB1 = 3;
            byteStream1(byteArray, bufferSizeB1);

            String sourceB2 = "src/labs_examples/input_output/files/data.dat";
            byteStream2(sourceB2, sourceB2);

            String sourceC1 = "src/labs_examples/input_output/files/KtoD.txt";
            String targetC1 = "src/labs_examples/input_output/files/KtoD_copy.txt";
            characterStream1(sourceC1, targetC1);

            System.out.println("Hiya!");

            char[] sourceC2 = {'a', 'b', 'c', 'd', 'e'};
            int bufferSizeC2 = 2;
            characterStream2(sourceC2, bufferSizeC2);

        }

    private static void byteStream1(byte[] byteArray, int bufferSize) {

        try (ByteArrayInputStream bAIS = new ByteArrayInputStream(byteArray)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead = 0;

            while ((bytesRead = bAIS.read(buffer)) != -1) {


                if (bytesRead < bufferSize) {

                    byte[] smallerBuffer = new byte[bytesRead];

                    for (int i = 0; i < bytesRead; i++) {
                        smallerBuffer[i] = buffer[i];
                    }

                    System.out.println(Arrays.toString(smallerBuffer));

                } else {
                    System.out.println(Arrays.toString(buffer));
                }
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void byteStream2(String source, String target) {

        try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream(target));
             DataInputStream dIn = new DataInputStream(new FileInputStream(source))) {


            for (int i = 0; i < 20; i++) {
                dOut.writeDouble((double) i);
            }

            while (dIn.available() > 0) {
                System.out.println(dIn.readDouble());
            }

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void characterStream1(String source, String target) {

        try (FileReader fR = new FileReader(source);
             PrintWriter pW = new PrintWriter(new FileWriter(target), true)) { //Breaks when target set to System.out - Why?

            int character;

            while ((character = fR.read()) != -1) {

                pW.print((char) character);

            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    private static void characterStream2(char[] source, int bufferSize) {

        try (BufferedReader bR = new BufferedReader(new CharArrayReader(source))) {

            char[] buffer = new char[bufferSize];
            int charsRead = 0;

            while ((charsRead = bR.read(buffer)) != -1) {

                if (charsRead < bufferSize) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(buffer, 0, charsRead)));
                } else {
                    System.out.println(Arrays.toString(buffer));
                }
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}