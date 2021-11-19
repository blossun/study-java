package dev.solar.thread.part1;

public class Ex2Program {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() { //Runnable 익명 함수 사용
            @Override
            public void run() {
                print1();
            }
        });
        th1.start(); //스레드 실행

        Thread th2 = new Thread(() -> print2()); //람다 표현식 사용
        th2.start();

        for (int i = 0; i < 100; i++) {
            System.out.printf("main:%d\n", i + 1);
        }
    }

    private static void print1() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("sub1:%d\n", i + 1);
        }
    }

    private static void print2() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("sub2:%d\n", i + 1);
        }
    }
}
