package org.studyeasy;

interface Lambda{
    public void demo();
}

public class Main {
    public static void main(String[] args) {
        Lambda lambda = (()-> System.out.println("Statement 01"));
        lambda.demo();

    }
}
