package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Example_BufferedReaderCypher {

    public static void main(String[] args) {

        int offset = 5;
        String source = "src/labs_examples/input_output/files/char_data.txt";
        String target = "src/labs_examples/input_output/files/char_data_encrypted.txt";

        encryptToNewFile(source, target, offset);


        source = "src/labs_examples/input_output/files/char_data_encrypted.txt";

        decryptAndPrint(source, offset);

    }

    public static void encryptToNewFile(String source, String target, int offset) {

        try (BufferedReader br = new BufferedReader(new FileReader(source));
             FileOutputStream fos = new FileOutputStream(target)) {

            char[] buffer = new char[1];
            int charsRead = 0;

            while (( charsRead = br.read(buffer) ) != -1) {

//                if (buffer[0] == 0x8217) {
//
//                    fos.write(buffer[0]);
//
//                } else {

                    fos.write(buffer[0] + offset);

//                }

            }

        } catch (IOException e) {

            System.out.println(e.toString());

        }

    }

    public static void decryptAndPrint(String source, int offset) {

        try (BufferedReader br = new BufferedReader(new FileReader(source))) {

            char[] buffer = new char[1];
            int charsRead = 0;

            while (( charsRead = br.read(buffer) ) != -1) {

//                if (buffer[0] == 0x8217) {
//
//                    System.out.println(buffer[0]);
//
//                } else {

                    System.out.print((char) (buffer[0] - offset));

//                }
            }

        } catch (IOException e) {

            System.out.println(e.toString());

        }

    }

}