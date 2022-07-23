package com.example.effectivejava.item8.cleaner;

import java.util.List;

public class BIgObject {

    private List<Object> resource;

    public BIgObject(List<Object> resource) {
        this.resource = resource;
    }

    //cleaner는 Runnable태스크로 만들어서 처리한다. static으로 만들어야만 한다.
    //절대 내부클래스에서 BigObject를 참조하면 안된다.
    public static class ResourceCleaner implements Runnable {
        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("cleaned up.");
        }
    }
}
