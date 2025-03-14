package mission_normal.string_service;

import java.util.Arrays;

public class StringService {

    public void sortStrings(String[] array) {
        Arrays.sort(array, String::compareTo);
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String changeUpperCase(String s) {
        return s.toUpperCase();
    }

    public String changeLowerCase(String s) {
        return s.toLowerCase();
    }


}
