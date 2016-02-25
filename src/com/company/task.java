package com.company;

import java.util.Random;

public class task {


    public static void main(String[] args) {
        final int maxpassword = 999999;
        Random randomGenerator = new Random();
        int password = randomGenerator.nextInt(maxpassword);
        int step = 0;

        int border = maxpassword / 2;
        int ipassword = maxpassword;
        //


        while (ipassword != password) {

            if (ipassword > password) {
                ipassword -= border;
            } else if (ipassword < password) {
                ipassword += border;
            }
            step++;
            System.out.println(step + " " + ipassword + " " + border);

            // для решения проблем с округлением
            if ((border & 1) != 0) {

                border++;
            }
            border = border / 2;
        }

    }
}
