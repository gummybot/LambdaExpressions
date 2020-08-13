package com.gummybot.lambdapractice.callableexample;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ClassCallableExample {
    public static int[] array = IntStream.rangeClosed(0,5000).toArray();
    public static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable c1 = () -> {
            int sum = 0;
            for(int i=0; i<array.length/2; i++){
                sum+=array[i];
            }
            return sum;
        };
        Callable c2 = () -> {
            int sum = 0;
            for(int i=array.length/2; i<array.length; i++){
                sum+=array[i];
            }
            return sum;
        };

        ExecutorService exec_serv = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(c1, c2);
        List<Future<Integer>> results = exec_serv.invokeAll(taskList);

        int k = 0;
        int sum = 0;
        for(Future<Integer> result:results){
            sum += result.get();
            System.out.println("Sum of task " + ++k + " is: " + result.get());
        }
        System.out.println("Total sum with Callable is: " + sum);
        System.out.println("Total sum of IntStream is: " + total);
        exec_serv.shutdown();
    }
}
