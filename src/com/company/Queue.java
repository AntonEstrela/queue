package com.company;

public interface Queue<E>
{
    void push(E e) throws CuaPlenaException;
    E pop() throws CuaBuidaException;
    int size();
    boolean isFull();
    boolean isEmpty();
}
