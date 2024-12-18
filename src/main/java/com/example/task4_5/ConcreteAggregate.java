package com.example.task4_5;

public class ConcreteAggregate implements Aggregate{
    private String filetopic;
    private String basePath;

    public ConcreteAggregate(String filetopic, String basePath) {
        this.filetopic = filetopic;
        this.basePath = basePath;
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(filetopic, basePath);
    }

    @Override
    public boolean hasNext(int i) {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
