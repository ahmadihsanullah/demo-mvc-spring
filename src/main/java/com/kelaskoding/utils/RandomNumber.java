package com.kelaskoding.utils;

public class RandomNumber {
    private static Long number;
    
    public static Long getRandom(long min, long max) {
        number = min + (long) (Math.random() * ((max - min)));
        return number;
    } 
}
