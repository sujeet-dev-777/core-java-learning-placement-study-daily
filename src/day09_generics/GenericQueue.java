package day09_generics;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {

    private Queue<T> queue = new LinkedList<>();

    public void add(T value){

        queue.offer(value);
    }

    public T remove(){

        return queue.poll();
    }

    public static void main(String[] args) {

        GenericQueue<Integer> queue=new GenericQueue<>();

        queue.add(10);
        queue.add(20);

        System.out.println(queue.queue);

        System.out.println(queue.remove());
        queue.add(200);

        System.out.println(queue.queue);
        System.out.println(queue.remove());

    }
}