package com.it.utils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    public static String getRandomString(int count) {
        return new Random()
                .ints('a', 'z')
                .limit(count)
                .mapToObj(s -> String.valueOf((char) s))
                .collect(Collectors.joining());
    }
}
