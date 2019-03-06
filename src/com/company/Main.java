package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        Queue<Integer> q = new QueueImpl<Integer>(10);
        for (int i = 0; i < 11; i++){
            int tmp = ran.nextInt(100);
            System.out.print("isFull: " + q.isFull() + " isEmpty: " + q.isEmpty() + " Size: " + q.size() + " Push: " + tmp);
            try {
                q.push(tmp);
                System.out.println(" -> OK");
            }
            catch(CuaPlenaException e){
                System.out.println(" -> CuaPlenaException, amb size: " + e.GetSize());
            }
        }
        for (int i = 0; i < 11; i++){
            System.out.print("isFull: " + q.isFull() + " isEmpty: " + q.isEmpty() + " Size: " + q.size());
            try {
                System.out.println(" Pop: " + q.pop());
            }
            catch(CuaBuidaException e){
                System.out.println(" Pop -> CuaBuidaException");
            }
        }
    }
}
