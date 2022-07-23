package com.example.effectivejava.item7.excutor;

import java.util.concurrent.*;

public class ExcutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //쓰레드의 갯수(시스템 리소스)를 제한 할 수 있다. 그래서 성능 튜닝을하여 적절한 쓰레드 갯수를 찾는다.
        //CPU갯수를 구하는 방법
        int cpuNumber = Runtime.getRuntime().availableProcessors();

//        10개의 쓰레드로 100개의 일들을 처리.
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        필요한만큼 쓰레드를 만든다. 오랫동안 방치된 쓰레드는 제거. 그러나 쓰레드가 많아지면 위험함.
//        ExecutorService executorService = Executors.newCachedThreadPool();

        // 어떤작업을 몇 초뒤에 실행하거나 커스텀하게 쓰레드를 조절할 수 있는 쓰레드 풀.
        ExecutorService executorService = Executors.newScheduledThreadPool(10);

//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Task());
//        }
//        Future<String> result = executorService.submit(new Task());
        System.out.println(Thread.currentThread() + " hello");

        //블로킹 된다.
//        System.out.println(result.get());
        executorService.shutdown();
    }

    public static class Task implements Runnable {
//        @Override
//        public String call() throws Exception {
//            Thread.sleep(2000L);
//            return Thread.currentThread() + " world";
//        }
        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " world");
        }
    }
}
