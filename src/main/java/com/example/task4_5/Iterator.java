package com.example.task4_5;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public Object preview();
    void reset();
}