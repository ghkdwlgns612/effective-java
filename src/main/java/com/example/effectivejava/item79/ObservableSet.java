package com.example.effectivejava.item79;

import java.util.ArrayList;
import java.util.List;

//public class ObservableSet<E> extends ForwardingSet<E> {
//    private final List<SetObserver<E>> observers = new ArrayList<>();
//
//    public void addObserver(SetObserver<E> observer) {
//        synchronized (observers) {
//            observers.add(observer);
//        }
//    }
//
//    public boolean removeObserver(SetObserver<E> observer) {
//        synchronized (observers) {
//            return observers.remove(observer);
//        }
//    }
//
//    private void notifyElementAdded(E element) {
//        synchronized (observers) {
//            for (SetObserver<E> observer : observers) {
//                observer.added(this, element);
//            }
//        }
//    }
//}
