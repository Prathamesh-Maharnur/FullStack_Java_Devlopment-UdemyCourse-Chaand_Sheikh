package org.studyeasy;

class Brackets{
  synchronized public static void generate() {
          for (int i = 1; i <= 20; i++) {
              if (i <= 10) {
                  System.out.print('[');
              } else {
                  System.out.print(']');
              }
          }
          System.out.println();
      }
}

public class Main {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Brackets.generate();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Brackets.generate();
                }
            }
        }).start();

    }
}


