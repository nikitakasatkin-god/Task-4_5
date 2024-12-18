package com.example.task4_5;

public interface Aggregate {
    public Iterator getIterator();

    boolean hasNext(int i);

    Object next();
}
