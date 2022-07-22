package com.example.effectivejava.item7.cache;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {

    //WeakHashMap과 WeakReference를 이용한 참조해제
    void cacheTest() throws InterruptedException {
        PostRepository postRepository = new PostRepository();
        CacheKey key = new CacheKey(1);
        Integer p = 1;
        postRepository.getPostById(p);

        //assertFalse(postRepository.getCache().isEmpty())

//        p = null; //이것을 해줘도 안된다. 그럼 어떻게 해야할까? WeakedHashMap사용
        //근데 WeakedHashMap을 사용해도 안되는 이유는 지금 현재 메서드에 key를 참조하고 있기 때문이다.
        //그래서 getPostById내부에 key를 넣어주면 된다.
        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);

        //assertTrue(postRepository.getCache().isEmpty())
    }

    //백그라운드에서 주기적으로 작업하여 정리하는 방법
    void backgroundThreadTest() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        PostRepository postRepository = new PostRepository();
        CacheKey key = new CacheKey(1);
        postRepository.getPostById(key);

        Runnable removeOldCache = () -> {
            System.out.println("running removeOldCache task");
            Map<CacheKey, Post> cache = postRepository.getCache();
            Set<CacheKey> cacheKeySet = cache.keySet();
            Optional<CacheKey> key1 = cacheKeySet.stream().min(Comparator.comparing(CacheKey::getCreated));
            key1.ifPresent(k -> {
                System.out.println("removing " + k);
                cache.remove(k);
            });
        };

        System.out.println("The time is : " + new Date());

        executor.scheduleAtFixedRate(removeOldCache,1,3, TimeUnit.SECONDS);
        Thread.sleep(20000L);
    }

}
