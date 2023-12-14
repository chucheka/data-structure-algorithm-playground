package com.characters;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharacterManipulation {
/*
* The default value is \u0000
*The Size of a Java char is 2-byte.
* Also, the standard ASCII characters range from 0 to 127.
 */

    public static void main(String[] args) {

        char c1 =  'u';
        char c2 = 6; // Integers are typecast to chars by compiler
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("The Incremented Value is " + ++c2 + --c1);

        String name = "Chike";

        char[] chars = name.toCharArray();

        Character character =  new Character(c2);

        System.out.println(Arrays.toString(chars));
        System.out.println(name.charAt(1));
        System.out.println(character);

        char unicode = '\u03B1';

        System.out.println("CONVERT UNICODE(escape sequence to char " +unicode);
    }
}
