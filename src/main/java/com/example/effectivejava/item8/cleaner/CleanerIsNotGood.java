package com.example.effectivejava.item8.cleaner;

//import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    //실제 클리너를 사용하는 프로그램.
    public static void main(String[] args) throws InterruptedException {
//        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUp = new ArrayList<>();
        BIgObject bIgObject = new BIgObject(resourceToCleanUp);

        //클리너에 등록. 어떤 객체가 GC가 실행될 때 어떤 Runnable을 사용해서 객체를 해제하라.
//        cleaner.register(bIgObject, new BIgObject.ResourceCleaner(resourceToCleanUp));

        bIgObject = null;
        System.gc();
        Thread.sleep(3000L);
    }
}
