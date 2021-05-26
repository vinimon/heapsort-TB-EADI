package com.company;

import java.util.Random;

public class Main {

    public static void main(String args[])
    {
        Random rd = new Random();

        int x = 1000;
        int arrRand[] = new int[x];
        int arrBest[] = new int[x];
        int arrWorse[] = new int[x];

        HeapSort ob = new HeapSort();

        // pior caso
        for (int i = 0; i < arrWorse.length; i++){
            arrWorse[i] = x;
            x--;
        }
        // caso médio
        for (int i = 0; i < arrRand.length; i++) {
            arrRand[i] = rd.nextInt();
        }

        // melhor caso
        for (int i = 0; i < arrBest.length; i++){
            arrBest[i] = i;
        }

        long startTime = System.currentTimeMillis();
        ob.sort(arrWorse);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Best case exec time: " + timeElapsed);
        System.out.println("Swap count = " + ob.getSwapCount());

        ob.setSwapCoutn(0);

        startTime = System.currentTimeMillis();
        ob.sort(arrRand);
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("Average case exec time: " + timeElapsed);
        System.out.println("Swap count = " + ob.getSwapCount());

        ob.setSwapCoutn(0);


        startTime = System.currentTimeMillis();
        ob.sort(arrBest);
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("Worst case exec time: " + timeElapsed);
        System.out.println("Swap count = " + ob.getSwapCount());
    }
}
