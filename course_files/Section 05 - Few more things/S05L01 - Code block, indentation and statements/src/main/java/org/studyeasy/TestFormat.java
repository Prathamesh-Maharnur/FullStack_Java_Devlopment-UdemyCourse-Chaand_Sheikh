package org.studyeasy;

public class TestFormat {

    public static void main(String[] args) {
        int n = 1;
        System.out.println(n);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        switch (n) {
            case 1 -> System.out.println(n);
            case 2 -> System.out.println(n*2);

        }

        float x = 10;
        System.out.println(x);
        System.out.println(n);


    }
}