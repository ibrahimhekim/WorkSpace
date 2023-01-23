package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	Runnable is = () -> System.out.println("Ben bir programım");
    Thread thread = new Thread(is);
    thread.start();
    //thread.run();

        ExecutorService executorService = Executors.newFixedThreadPool(10); //newCachedThreadPool();
        List<Runnable> listOfRunnable = Arrays.asList(
                () -> System.out.println("Runnable1"),
                () -> System.out.println("Runnable2"),
                () -> System.out.println("Runnable3"),
                () -> System.out.println("Runnable4"),
                () -> System.out.println("Runnable5"),
                () -> System.out.println("Runnable6"),
                () -> System.out.println("Runnable7"),
                () -> System.out.println("Runnable8"),
                () -> System.out.println("Runnable9"));

        List<Callable<Integer>> listOfCallable = Arrays.asList(
                () -> {int a=1; System.out.println("Callable 1"); return a;},
                () -> {int a=2; System.out.println("Callable 2"); return a;},
                () -> {int a=3; System.out.println("Callable 3"); return a;},
                () -> {int a=4; System.out.println("Callable 4"); return a;},
                () -> 5,
                () -> 6
        );
        /*try {
            //executorService.invokeAll(listOfCallable);   //ayrıca bu yontem sadece callable icin gecerli
            List<Future<Integer>> results = executorService.invokeAll(listOfCallable);
            results.stream().forEach(i -> {
                try {
                    System.out.println("Result : " + i.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //IntStream.range(0,9).forEach(r -> executorService.submit(listOfRunnable.get(r)));

        IntStream.range(0,100).forEach(i -> executorService.submit(() -> {
            System.out.println("Task : " + i + " executed by " + Thread.currentThread().getName());
        }));

    }
}
