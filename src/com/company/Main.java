package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        Queue<int> q = new Queue<int>(10);
        for (int i = 0; i < 11; i++){
            int tmp = ran.nextInt(100);
            System.out.print("Size: " + q.size() + "\tPush: " + tmp);
            try {
                q.push(tmp);
            }
            catch(CuaPlenaException e){
                System.out.println(" -> CuaPlenaException, amb size: " + e.GetSize());
            }
            finally{
                System.out.println(" -> OK");
            }
        }
        for (int i = 0; i < 11; i++){
            System.out.print("Size: " + q.size());
            try {
                System.out.println("Pop: " + q.pop());
            }
            catch(CuaBuidaException e){
                System.out.println(" -> CuaBuidaException");
            }
        }
    }
}
