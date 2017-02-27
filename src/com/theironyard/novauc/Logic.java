package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/23/17.
 */


public class Logic {

    public boolean frontAgain(String str) { //THE D'ANGELO METHOD

        String strStart;
//        if (str.length() > 0) {
//            strStart = str.substring(0, 2).toLowerCase();
//            System.out.println("Your string ends with: " + str.substring((str.length() -2), str.length()));
//            System.out.println("Your string starts with: "+ strStart);
//        }
        if (str.endsWith(str.substring(0, 2).toLowerCase())) {
            return true;
        } else if (str.endsWith(str.substring(0).toLowerCase()))
            return true;


        //System.out.println("Here is your " +substring)
        return false;
    }


    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed = speed - 5;

        }
        if ((speed <= 60)) {
            return 0;

        } else if ((speed >= 61) && (speed <= 80)) {
            return 1;

        } else {
            return 2;
        }

    }

    public int sortaSum(int a, int b) {

        int sum = a + b;

        if (a + b >= (10) && sum <= (19)) {
            return 20;
        } else
            return sum;

    }

    public boolean love6(int a, int b) {

        int sum = a + b;
        int difference = a - b;

        if (a == 6 || b == 6) {
            return true;
        } else if (sum == 6 || difference == 6) {
            return true;
        } else
            return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode && n <= 1 || n >= 10) {
            return true;
        } else if (n >= 1 && n <= 10) {
            return true;
        } else {
            return false;
        }


    }
}
























