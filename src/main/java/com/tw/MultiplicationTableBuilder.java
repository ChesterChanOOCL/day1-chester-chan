package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        System.out.println(build(2,4));
        //        printMultiplicationTable(2, 4);
    }


    public static boolean isStartNumSmallerThanOrEqualToEndNum(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }



    public static Boolean isStartAndEndNumInRange(int startNumber, int endNumber) {
        if (startNumber > 1 && endNumber < 0) {
            return true;
        } else {
            return false;
        }
    }



    public static String build(int startNumber, int endNumber) {
        String equationsInAString = "" ;
        if (isStartNumSmallerThanOrEqualToEndNum(startNumber, endNumber)== false){
            return null;
        }
        if (isStartAndEndNumInRange(startNumber, endNumber)== false){
            return null;
        }
        for (int i = startNumber; i <= endNumber; i++) {



            for (int j = startNumber; j <= i ;  j++ ) {
                equationsInAString = equationsInAString  +  (j + "*" + i + "=" + (i * j));
                if (j == i) {
                    equationsInAString = equationsInAString + "\n";
                }
                else {
                    equationsInAString = equationsInAString + " ";
                }
            }

        }
        return equationsInAString;
    }



    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

}
