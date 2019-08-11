package labs_examples.datastructures.hashmap.labs.Exercise_03;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise_03 {

    public static void main(String[] args) {

        //

        long linkedList_total_start = System.nanoTime();
        {

            LinkedList<Integer> linkedList = new LinkedList<>();

            long linkedList_add10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    linkedList.add(i);
                }
            }
            long linkedList_add10000_stop = System.nanoTime();

            double linkedList_add10000_time = (double) (linkedList_add10000_stop - linkedList_add10000_start) / 1_000_000.0;
            System.out.println("linkedList_add10000_time: " + linkedList_add10000_time + " milliseconds");


            long linkedList_update10000_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    linkedList.set(j, i);
                }
            }
            long linkedList_update10000_stop = System.nanoTime();

            double linkedList_update10000_time = (double) (linkedList_update10000_stop - linkedList_update10000_start) / 1_000_000.0;
            System.out.println("linkedList_update10000_time: " + linkedList_update10000_time + " milliseconds");


            long linkedList_search10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    linkedList.indexOf(i);
                }
            }
            long linkedList_search10000_stop = System.nanoTime();

            double linkedList_search10000_time = (double) (linkedList_search10000_stop - linkedList_search10000_start) / 1_000_000.0;
            System.out.println("linkedList_search10000_time: " + linkedList_search10000_time + " milliseconds");


            long linkedList_delete10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    linkedList.remove((Object) i);
                }
            }
            long linkedList_delete10000_stop = System.nanoTime();

            double linkedList_delete10000_time = (double) (linkedList_delete10000_stop - linkedList_delete10000_start) / 1_000_000.0;
            System.out.println("linkedList_delete10000_time: " + linkedList_delete10000_time + " milliseconds");

        }
        long linkedList_total_stop = System.nanoTime();

        double linkedList_total_time = (double) (linkedList_total_stop - linkedList_total_start) / 1_000_000.0;
        System.out.println("linkedList_total_time: " + linkedList_total_time + " milliseconds\n");

        //

        long stack_total_start = System.nanoTime();
        {
            Stack<Integer> stack = new Stack<>();

            long stack_add10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    stack.add(i);
                }
            }
            long stack_add10000_stop = System.nanoTime();

            double stack_add10000_time = (double) (stack_add10000_stop - stack_add10000_start) / 1_000_000.0;
            System.out.println("stack_add10000_time: " + stack_add10000_time + " milliseconds");


            long stack_update10000_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    stack.set(j, i);
                }
            }
            long stack_update10000_stop = System.nanoTime();

            double stack_update10000_time = (double) (stack_update10000_stop - stack_update10000_start) / 1_000_000.0;
            System.out.println("stack_update10000_time: " + stack_update10000_time + " milliseconds");


            long stack_search10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    stack.indexOf(i);
                }
            }
            long stack_search10000_stop = System.nanoTime();

            double stack_search10000_time = (double) (stack_search10000_stop - stack_search10000_start) / 1_000_000.0;
            System.out.println("stack_search10000_time: " + stack_search10000_time + " milliseconds");


            long stack_delete10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    stack.remove((Object) i);
                }
            }
            long stack_delete10000_stop = System.nanoTime();

            double stack_delete10000_time = (double) (stack_delete10000_stop - stack_delete10000_start) / 1_000_000.0;
            System.out.println("stack_delete10000_time: " + stack_delete10000_time + " milliseconds");
        }
        long stack_total_stop = System.nanoTime();

        double stack_total_time = (double) (stack_total_stop - stack_total_start) / 1_000_000.0;
        System.out.println("stack_total_time: " + stack_total_time + " milliseconds\n");

        //

        long priorityQueue_total_start = System.nanoTime();
        {
            Stack<Integer> priorityQueue = new Stack<>();

            long priorityQueue_add10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    priorityQueue.add(i);
                }
            }
            long priorityQueue_add10000_stop = System.nanoTime();

            double priorityQueue_add10000_time = (double) (priorityQueue_add10000_stop - priorityQueue_add10000_start) / 1_000_000.0;
            System.out.println("priorityQueue_add10000_time: " + priorityQueue_add10000_time + " milliseconds");


            long priorityQueue_update10000_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    priorityQueue.set(j, i);
                }
            }
            long priorityQueue_update10000_stop = System.nanoTime();

            double priorityQueue_update10000_time = (double) (priorityQueue_update10000_stop - priorityQueue_update10000_start) / 1_000_000.0;
            System.out.println("priorityQueue_update10000_time: " + priorityQueue_update10000_time + " milliseconds");


            long priorityQueue_search10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    priorityQueue.indexOf(i);
                }
            }
            long priorityQueue_search10000_stop = System.nanoTime();

            double priorityQueue_search10000_time = (double) (priorityQueue_search10000_stop - priorityQueue_search10000_start) / 1_000_000.0;
            System.out.println("priorityQueue_search10000_time: " + priorityQueue_search10000_time + " milliseconds");


            long priorityQueue_delete10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    priorityQueue.remove((Object) i);
                }
            }
            long priorityQueue_delete10000_stop = System.nanoTime();

            double priorityQueue_delete10000_time = (double) (priorityQueue_delete10000_stop - priorityQueue_delete10000_start) / 1_000_000.0;
            System.out.println("priorityQueue_delete10000_time: " + priorityQueue_delete10000_time + " milliseconds");
        }
        long priorityQueue_total_stop = System.nanoTime();

        double priorityQueue_total_time = (double) (priorityQueue_total_stop - priorityQueue_total_start) / 1_000_000.0;
        System.out.println("priorityQueue_total_time: " + priorityQueue_total_time + " milliseconds\n");

        //

        long hashMap_total_start = System.nanoTime();
        {
            Stack<Integer> hashMap = new Stack<>();

            long hashMap_add10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    hashMap.add(i);
                }
            }
            long hashMap_add10000_stop = System.nanoTime();

            double hashMap_add10000_time = (double) (hashMap_add10000_stop - hashMap_add10000_start) / 1_000_000.0;
            System.out.println("hashMap_add10000_time: " + hashMap_add10000_time + " milliseconds");


            long hashMap_update10000_start = System.nanoTime();
            {
                for (int i = 99, j = 0; i > -1; i--, j++) {
                    hashMap.set(j, i);
                }
            }
            long hashMap_update10000_stop = System.nanoTime();

            double hashMap_update10000_time = (double) (hashMap_update10000_stop - hashMap_update10000_start) / 1_000_000.0;
            System.out.println("hashMap_update10000_time: " + hashMap_update10000_time + " milliseconds");


            long hashMap_search10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    hashMap.indexOf(i);
                }
            }
            long hashMap_search10000_stop = System.nanoTime();

            double hashMap_search10000_time = (double) (hashMap_search10000_stop - hashMap_search10000_start) / 1_000_000.0;
            System.out.println("hashMap_search10000_time: " + hashMap_search10000_time + " milliseconds");


            long hashMap_delete10000_start = System.nanoTime();
            {
                for (int i = 0; i < 10000; i++) {
                    hashMap.remove((Object) i);
                }
            }
            long hashMap_delete10000_stop = System.nanoTime();

            double hashMap_delete10000_time = (double) (hashMap_delete10000_stop - hashMap_delete10000_start) / 1_000_000.0;
            System.out.println("hashMap_delete10000_time: " + hashMap_delete10000_time + " milliseconds");
        }
        long hashMap_total_stop = System.nanoTime();

        double hashMap_total_time = (double) (hashMap_total_stop - hashMap_total_start) / 1_000_000.0;
        System.out.println("hashMap_total_time: " + hashMap_total_time + " milliseconds\n");
    }

}
