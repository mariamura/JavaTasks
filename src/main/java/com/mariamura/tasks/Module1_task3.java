package com.mariamura.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Module1_task3 {
    public static void main(String[] args) {
        FooSemaphore foo = new FooSemaphore();

        Thread ob2 = new Thread(() -> foo.second());
        Thread ob1 = new Thread(() -> foo.first());
        Thread ob3 = new Thread(() -> foo.third());
        ob1.start();
        ob2.start();
        ob3.start();

        FooCountDown fooCountDown = new FooCountDown();

        Thread ob4 = new Thread(() -> fooCountDown.third());
        Thread ob5 = new Thread(() -> fooCountDown.second());
        Thread ob6 = new Thread(() -> fooCountDown.first());

        ob4.start();
        ob5.start();
        ob6.start();

    }
}

class FooSemaphore {

    Semaphore semOb1 = new Semaphore(1);
    Semaphore semOb2 = new Semaphore(0);
    Semaphore semOb3 = new Semaphore(0);


    public void first() {
        try {
            semOb1.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("first ");
        semOb2.release();
    }

    public void second() {
        try {
            semOb2.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("second ");
        semOb3.release();
    }

    public void third() {
        try {
            semOb3.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("third ");
        semOb1.release();
    }
}

class FooCountDown {

    CountDownLatch latch1 = new CountDownLatch(1);
    CountDownLatch latch2 = new CountDownLatch(1);


    public void first() {
        System.out.print("first ");
        latch1.countDown();
    }

    public void second() {
        try {
            latch1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("second ");
        latch2.countDown();
    }

    public void third() {
        try {
            latch2.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("third ");
    }
}

