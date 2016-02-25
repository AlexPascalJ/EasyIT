package com.company;

import java.util.Arrays;


public class test2 {



    public static void main(String[] args) {
        final int maxpassword = 999999;
        int password ;
        int step = 0;
        int[] pascount = new int[20];

        int border = maxpassword / 2;
        int ipassword = maxpassword;
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
                pascount[step-1]=pascount[step-1]+1;
            }
        System.out.println(Arrays.toString(pascount));

    }
}
