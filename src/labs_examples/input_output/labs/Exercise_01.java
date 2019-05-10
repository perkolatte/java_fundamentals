package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example_BufferedInputStream {

    public static void main(String[] args) {

        String source = "src/labs_examples/input_output/files/char_data.txt";
        String target = "src/labs_examples/input_output/files/char_data_copy.txt";

        copyTxtFile5BytesAtATime(source, target);

    }

    public static void copyTxtFile5BytesAtATime(String source, String target) {

        try (FileInputStream fin = new FileInputStream(source);
             BufferedInputStream bin = new BufferedInputStream(fin);
             FileOutputStream fout = new FileOutputStream(target)) {

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bin.read(buffer)) != -1) {

                if (bytesRead < 5) {
                    for (int i = 0; i < bytesRead; i++) {
                        fout.write(buffer[i]);
                    }
                } else {
                    fout.write(buffer);
                }
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

class Example {
    public void main(String[] args) {

        int[] vals = {1,2,3,4,5};

        for(int i = 0; i < vals.length/2; ++i){
            int temp = vals[i];
            vals[i] = vals[vals.length - 1 -i];
            vals[vals.length - 1 -i] = temp;
        }

        for(int i : vals){
            System.out.println(i);
        }

    }
}