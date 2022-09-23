package com.classwork.work;

import java.util.Arrays;

public class SchoolComparator {
  private static   String[] nigerianInstitution ={"unilag","Lasu","ABSU","NOUN","nSUKKA","Unical","laspotech"};
    public static void main(String[] args) {


        for (int firstIndex = 0; firstIndex < nigerianInstitution.length; firstIndex++) {
            for (int secondIndex = firstIndex+1; secondIndex < nigerianInstitution.length; secondIndex++) {
                if (nigerianInstitution[firstIndex].compareTo(nigerianInstitution[secondIndex])>0) swapElement(nigerianInstitution, firstIndex, secondIndex);

            }

        }
        System.out.println(Arrays.toString(nigerianInstitution));
    }


    private static void swapElement(String[] nigerianInstitution, int firstIndex, int secondIndex) {
        String temp;
        temp = nigerianInstitution[firstIndex];
        nigerianInstitution[firstIndex] = nigerianInstitution[secondIndex];
        nigerianInstitution[secondIndex] = temp;
    }
}
