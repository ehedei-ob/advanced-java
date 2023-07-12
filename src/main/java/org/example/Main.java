package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) {
        try {
            int num = 8/0;
        } catch (final ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        final int[] array = { 1, 2, 3, 4, 5, 6 };

        try {
            int num = array[8];
        } catch (final ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            final FileReader fileReader = new FileReader("myfile.txt");
        } catch (final FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}