package labs_examples.datastructures.hashmap.labs.Exercise_03;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise_03 {

    public static void main(String[] args) {

        //

        long linkedList_total_start = System.nanoTime();
        {

            LinkedList<Integer> linkedList = new LinkedList<>();

            long linkedList_add100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    linkedList.add(i);
                }
            }
            long linkedList_add100_stop = System.nanoTime();

            double linkedList_add100_time = (double) (linkedList_add100_stop - linkedList_add100_start) / 1_000_000.0;
            System.out.println("linkedList_add100_time: " + linkedList_add100_time + " milliseconds");


            long linkedList_update100_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    linkedList.set(j, i);
                }
            }
            long linkedList_update100_stop = System.nanoTime();

            double linkedList_update100_time = (double) (linkedList_update100_stop - linkedList_update100_start) / 1_000_000.0;
            System.out.println("linkedList_update100_time: " + linkedList_update100_time + " milliseconds");


            long linkedList_search100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    linkedList.indexOf(i);
                }
            }
            long linkedList_search100_stop = System.nanoTime();

            double linkedList_search100_time = (double) (linkedList_search100_stop - linkedList_search100_start) / 1_000_000.0;
            System.out.println("linkedList_search100_time: " + linkedList_search100_time + " milliseconds");


            long linkedList_delete100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    linkedList.remove((Object) i);
                }
            }
            long linkedList_delete100_stop = System.nanoTime();

            double linkedList_delete100_time = (double) (linkedList_delete100_stop - linkedList_delete100_start) / 1_000_000.0;
            System.out.println("linkedList_delete100_time: " + linkedList_delete100_time + " milliseconds");

        }
        long linkedList_total_stop = System.nanoTime();

        double linkedList_total_time = (double) (linkedList_total_stop - linkedList_total_start) / 1_000_000.0;
        System.out.println("linkedList_total_time: " + linkedList_total_time + " milliseconds\n");

        //

        long stack_total_start = System.nanoTime();
        {
            Stack<Integer> stack = new Stack<>();

            long stack_add100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    stack.add(i);
                }
            }
            long stack_add100_stop = System.nanoTime();

            double stack_add100_time = (double) (stack_add100_stop - stack_add100_start) / 1_000_000.0;
            System.out.println("stack_add100_time: " + stack_add100_time + " milliseconds");


            long stack_update100_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    stack.set(j, i);
                }
            }
            long stack_update100_stop = System.nanoTime();

            double stack_update100_time = (double) (stack_update100_stop - stack_update100_start) / 1_000_000.0;
            System.out.println("stack_update100_time: " + stack_update100_time + " milliseconds");


            long stack_search100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    stack.indexOf(i);
                }
            }
            long stack_search100_stop = System.nanoTime();

            double stack_search100_time = (double) (stack_search100_stop - stack_search100_start) / 1_000_000.0;
            System.out.println("stack_search100_time: " + stack_search100_time + " milliseconds");


            long stack_delete100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    stack.remove((Object) i);
                }
            }
            long stack_delete100_stop = System.nanoTime();

            double stack_delete100_time = (double) (stack_delete100_stop - stack_delete100_start) / 1_000_000.0;
            System.out.println("stack_delete100_time: " + stack_delete100_time + " milliseconds");
        }
        long stack_total_stop = System.nanoTime();

        double stack_total_time = (double) (stack_total_stop - stack_total_start) / 1_000_000.0;
        System.out.println("stack_total_time: " + stack_total_time + " milliseconds\n");

        //

        long priorityQueue_total_start = System.nanoTime();
        {
            Stack<Integer> priorityQueue = new Stack<>();

            long priorityQueue_add100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    priorityQueue.add(i);
                }
            }
            long priorityQueue_add100_stop = System.nanoTime();

            double priorityQueue_add100_time = (double) (priorityQueue_add100_stop - priorityQueue_add100_start) / 1_000_000.0;
            System.out.println("priorityQueue_add100_time: " + priorityQueue_add100_time + " milliseconds");


            long priorityQueue_update100_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    priorityQueue.set(j, i);
                }
            }
            long priorityQueue_update100_stop = System.nanoTime();

            double priorityQueue_update100_time = (double) (priorityQueue_update100_stop - priorityQueue_update100_start) / 1_000_000.0;
            System.out.println("priorityQueue_update100_time: " + priorityQueue_update100_time + " milliseconds");


            long priorityQueue_search100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    priorityQueue.indexOf(i);
                }
            }
            long priorityQueue_search100_stop = System.nanoTime();

            double priorityQueue_search100_time = (double) (priorityQueue_search100_stop - priorityQueue_search100_start) / 1_000_000.0;
            System.out.println("priorityQueue_search100_time: " + priorityQueue_search100_time + " milliseconds");


            long priorityQueue_delete100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    priorityQueue.remove((Object) i);
                }
            }
            long priorityQueue_delete100_stop = System.nanoTime();

            double priorityQueue_delete100_time = (double) (priorityQueue_delete100_stop - priorityQueue_delete100_start) / 1_000_000.0;
            System.out.println("priorityQueue_delete100_time: " + priorityQueue_delete100_time + " milliseconds");
        }
        long priorityQueue_total_stop = System.nanoTime();

        double priorityQueue_total_time = (double) (priorityQueue_total_stop - priorityQueue_total_start) / 1_000_000.0;
        System.out.println("priorityQueue_total_time: " + priorityQueue_total_time + " milliseconds\n");

        //

        long hashMap_total_start = System.nanoTime();
        {
            Stack<Integer> hashMap = new Stack<>();

            long hashMap_add100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    hashMap.add(i);
                }
            }
            long hashMap_add100_stop = System.nanoTime();

            double hashMap_add100_time = (double) (hashMap_add100_stop - hashMap_add100_start) / 1_000_000.0;
            System.out.println("hashMap_add100_time: " + hashMap_add100_time + " milliseconds");


            long hashMap_update100_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    hashMap.set(j, i);
                }
            }
            long hashMap_update100_stop = System.nanoTime();

            double hashMap_update100_time = (double) (hashMap_update100_stop - hashMap_update100_start) / 1_000_000.0;
            System.out.println("hashMap_update100_time: " + hashMap_update100_time + " milliseconds");


            long hashMap_search100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    hashMap.indexOf(i);
                }
            }
            long hashMap_search100_stop = System.nanoTime();

            double hashMap_search100_time = (double) (hashMap_search100_stop - hashMap_search100_start) / 1_000_000.0;
            System.out.println("hashMap_search100_time: " + hashMap_search100_time + " milliseconds");


            long hashMap_delete100_start = System.nanoTime();
            {
                for (int i = 0; i < 100; i++) {
                    hashMap.remove((Object) i);
                }
            }
            long hashMap_delete100_stop = System.nanoTime();

            double hashMap_delete100_time = (double) (hashMap_delete100_stop - hashMap_delete100_start) / 1_000_000.0;
            System.out.println("hashMap_delete100_time: " + hashMap_delete100_time + " milliseconds");
        }
        long hashMap_total_stop = System.nanoTime();

        double hashMap_total_time = (double) (hashMap_total_stop - hashMap_total_start) / 1_000_000.0;
        System.out.println("hashMap_total_time: " + hashMap_total_time + " milliseconds\n");
    }

}
