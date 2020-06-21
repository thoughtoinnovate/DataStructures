package com.learn.datastructures.list;

public interface List<E> {
    void add(E element);
    void add(E element, int index);
    void remove(E element);
    void removeAt(int index);
    E get(int index);
}
