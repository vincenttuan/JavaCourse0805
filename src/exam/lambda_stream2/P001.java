package exam.lambda_stream2;

/*
Given:

class MyClass implements Runnable {

    public int value;

    public void run() {
        while (value < 100) {
            value++;
            System.out.println("value: " + value);
        }
    }
}

class TestThread {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Thread a = new Thread(mc);
        a.start();
        Thread b = new Thread(mc);
        b.start();
    }
}

What change should you make to guarantee a single order of execution (printed values 1 -100 in order)?
A. Line 3: public synchronized void run() {
B. Line 2: public volatile int value;
C. Line 2: public synchronized int value;
D. Line 1: class MyClass extends Thread {

Ans: A
*/
