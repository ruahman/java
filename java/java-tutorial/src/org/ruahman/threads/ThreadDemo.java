package org.ruahman.threads;

//Thread is a unit of process
// we have at least one main thread

// class for creating threads
class MyThread extends Thread {
    public void run(){

    }
}

// interface for running threads
class MyRunable implements Runnable {
    public void run(){

    }
}

class ThreadA implements Runnable {
    public void run(){
        for(int i=1; i < 10; i++){
            System.out.println("A");
            try {
                Thread.sleep(50);
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

class ThreadB implements Runnable {
    public void run(){
        for(int i=1; i < 10; i++){
            System.out.println("B");
            try {
                Thread.sleep(50);
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

class Counter {
    int count;
    // only one thread at a time has access to this
    public synchronized void increment(){
        count++;
    }
}

public class ThreadDemo {

    public static void demo() {


//        Thread threadA = new ThreadA();
//        Thread threadB = new ThreadB();

//        threadA.start();
//        threadB.start();

        Runnable t1 = new ThreadA();
        Runnable t2 = new ThreadB();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("R");
                    try {
                        Thread.sleep(50);
                    }
                    catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            }
        };

        Thread thread3 = new Thread(t3);

        thread3.start();

        Runnable t4 = ()-> {
          for(int i = 0; i < 9; i++){
              System.out.println("Lamda");
              try {
                  Thread.sleep(50);
              }
              catch (Exception ex) {
                  System.out.println(ex);
              }
          }
        };

        Thread thread4 = new Thread(t4);

        thread4.start();

        Counter c = new Counter();

        Thread threadCount1 = new Thread(()->{
            for(int i = 0; i < 10000; i++){
                // only one thread at a time is calling increment,
                // because it is syncronized
                c.increment();
            }
        });

        Thread threadCount2 = new Thread(()->{
            for(int i = 0; i < 10000; i++){
                // only one thread at a time is calling increment,
                // because it is syncronized
                c.increment();
            }
        });

        threadCount1.start();
        threadCount2.start();

        thread1.setPriority(1);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread4.setPriority(10);
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
        System.out.println(thread4.getPriority());
        System.out.println("waiting to join...");
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            threadCount1.join();
            threadCount2.join();
        } catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println(c.count);
        System.out.println("end thread code");
    }
}
