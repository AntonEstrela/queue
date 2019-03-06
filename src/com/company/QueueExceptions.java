package com.company;

class CuaPlenaException extends Exception{
    int size;
    public CuaPlenaException(int size){
        this.size = size;
    }
    public int GetSize(){
        return size;
    }
}

class CuaBuidaException extends Exception{
    public CuaBuidaException(){}
}