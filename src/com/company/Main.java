package com.company;
import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;
public class Main {

    /**
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) {
        final int maxpassword = 999999;
        Random randomGenerator = new Random();
        int password = randomGenerator.nextInt(maxpassword);
        int step = 0;

        int border = maxpassword / 2;
        int ipassword = maxpassword;
        //

        try (FileWriter writer = new FileWriter("/home/ander/Documents/test.csv")) {
            //
            for (int i = 1; i < maxpassword; i++) {
                password = i;
                ipassword = maxpassword;
                step = 0;
                border = maxpassword / 2;
                while (ipassword != password) {

                    if (ipassword > password) {
                        ipassword -= border;
                    } else if (ipassword < password) {
                        ipassword += border;
                    }
                    step++;
                    // System.out.println(step + " " + ipassword + " " + border);

                    // для решения проблем с округлением
                    if ((border & 1) != 0) {

                        border++;
                    }
                    border = border / 2;
                }
                writer.append(Integer.toString(i));
                writer.append(";");
                writer.append(Integer.toString(step));
                writer.append("\n");
                writer.flush();

            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
