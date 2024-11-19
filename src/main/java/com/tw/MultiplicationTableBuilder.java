package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        System.out.println(build(2,4));
    }


    public static boolean isStartNumSmallerThanOrEqualToEndNum(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }


    // Also Check the case of startnum and endNum exceeding the range and Return false no need else
    public static Boolean isStartAndEndNumInRange(int startNumber, int endNumber) {
        if (startNumber > 1 && startNumber <= 1000 && endNumber > 1  && endNumber <= 1000 ) {
            return true;
        }
        return false;
    }
public static String build(int startNumber, int endNumber) {
    if (!isStartNumSmallerThanOrEqualToEndNum(startNumber, endNumber) || !isStartAndEndNumInRange(startNumber, endNumber)) {
        return null;
    }

// use multiply function
    return IntStream.rangeClosed(startNumber, endNumber)
            .mapToObj(i -> IntStream.rangeClosed(startNumber, i)
                    .mapToObj(j -> j + "*" + i + "=" + multiply(i , j))
                    .collect(Collectors.joining(" ")))
            .collect(Collectors.joining("\n"));
}
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

}
