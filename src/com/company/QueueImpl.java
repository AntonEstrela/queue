package com.company;

public class QueueImpl<E> implements Queue<E>{
    int Size = 0;
    int maxSize;
    E[] array;
    public Queue<E>(int length){
        this.maxSize = length;
        array = (E[])new Object[maxSize];
    }
    public void push(E e) throws CuaPlenaException{
        if(Size < array.length){
            array[Size] = e;
            Size++;
        }
        else{
            throw new CuaPlenaException(Size);
        }
    }
    public E pop() throws CuaBuidaException{
        if(Size > 0){
            E element = array[0];
            Size--;
            lShift();
            return element;
        }
        else{
            throw new CuaBuidaException();
        }
    }
    public int size() {
        return Size;
    }
    public boolean isFull(){
        return Size == maxSize;
    }
    public boolean isEmpty(){
        return Size == 0;
    }
    private void lShift(){
        for(int i = 0; i < Size - 1; i++){
            array[i] = array[i+1];
        }
    }
}
