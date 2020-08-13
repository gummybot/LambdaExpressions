package com.gummybot.lambdapractice.runnableexample;

public class ClassRunnableExample{
    public static void main(String[] args) {
        //Runnable implemented using Traditional way
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=1; i<=5; i++){
                    sum+=i;
                }
                System.out.println(String.format("Sum = %d. Calculated using Traditional implementation", sum));
            }
        };
        new Thread(runnable1).start();

        //Runnable implemented using lambda expression
        Runnable runnable2 = () -> {
            int product=1;
            for(int i=1; i<=3; i++){
                product*=i;
            }
            System.out.println(String.format("Product = %d. Calculated using Lambda expression", product));
        };
        new Thread(runnable2).start();

        //Quicker implementation using lambda expression in Thread's start function itself.
        new Thread(() -> {
            System.out.println("Printing first 10 numbers. Implemented with Lambda expression in Thread.");
            for(int i=1; i<=10; i++) {
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }).start();
    }
}
