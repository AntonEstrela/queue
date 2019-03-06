package com.company;

public class QueueImpl<E> implements Queue<E>{
    private int Size = 0;
    private int maxSize;
    private E[] array;
    public QueueImpl(int length){
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
        if (Size - 1 >= 0) {
            System.arraycopy(array, 1, array, 0, Size - 1);
        }
    }
}
