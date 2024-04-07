package org.example.linked_list.learning;

import java.util.*;

public class Part1 {
    /*
    1. LinkedList provides List and Deque features
    2. Doubly-linked list implementation
    3. Deque offers Deque as well as Stack features
    4. Ultimately we get 4 data structures ==> List, Queue, Deque, Stack
     */
    public static void main(String[] args) {
//        LinkedList<String> movies = new LinkedList<>();
        var movies = new LinkedList<String>();

        // List
        System.out.println("-".repeat(10) + "List" + "-".repeat(10));
        List<String> moviesList = movies;
        listAdd(moviesList);
        listRemove(moviesList);
        listFetch(moviesList);

        // Queue (FIFO)
        System.out.println("-".repeat(10) + "Queue" + "-".repeat(10));
        Queue<String> moviesQueue = movies;
        queueAdd(moviesQueue, moviesList);
        queueRemove(moviesQueue, moviesList);
        queueFetch(moviesQueue);

        // Deque (Deck - Double Ended Queue)
        System.out.println("-".repeat(10) + "Deque" + "-".repeat(10));
        Deque<String> moviesDeque = movies;
        dequeAdd(moviesDeque);
        dequeRemove(moviesDeque);
        dequeFetch(moviesDeque, moviesList);


        // Stack
        System.out.println("-".repeat(10) + "Stack" + "-".repeat(10));
        Deque<String> moviesStack = movies;
        moviesStack.push("Ratchasan");
        System.out.println("After push = " + moviesStack);
        String m1 = moviesStack.pop();
        System.out.println("After pop = " + moviesStack + "; data = " + m1);
        String m2 = moviesStack.peek();
        System.out.println("After peek = " + moviesStack + "; data = " + m2);
    }

    private static void listFetch(List<String> moviesList) {
        String s = moviesList.get(3);
        System.out.println("After get = " + moviesList + "; data = " + s);
    }

    private static void dequeFetch(Deque<String> moviesDeque, List<String> moviesList) {
        String m1 = moviesDeque.getFirst(); // throws exception if can't
        System.out.println("After getFirst = " + moviesList + "; data = " + m1);
        String m2 = moviesDeque.peekFirst(); // returns null if can't
        System.out.println("After peekFirst = " + moviesList + "; data = " + m2);
        String m3 = moviesDeque.getLast(); // throws exception if can't
        System.out.println("After getLast = " + moviesList + "; data = " + m3);
        String m4 = moviesDeque.peekLast(); // returns null if can't
        System.out.println("After peekLast = " + moviesList + "; data = " + m4);
    }

    private static void dequeRemove(Deque<String> moviesDeque) {
        moviesDeque.addLast("Managaram"); // throws exception if can't
        System.out.println("After addLast = " + moviesDeque);
        boolean r2 = moviesDeque.offerLast("Kolai"); // returns false if can't
        System.out.println("After offerLast = " + moviesDeque + "; result = " + r2);
    }

    private static void dequeAdd(Deque<String> moviesDeque) {
        moviesDeque.addFirst("Vada Chennai"); // throws exception if can't
        System.out.println("After addFirst = " + moviesDeque);
        boolean r1 = moviesDeque.offerFirst("Kaithi"); // returns false if can't
        System.out.println("After offerFirst = " + moviesDeque + "; result = " + r1);
    }

    private static void queueFetch(Queue<String> moviesQueue) {
        String m1 = moviesQueue.element(); // exception if not exists
        System.out.println("After element = " + moviesQueue + "; data = " + m1);
        String m2 = moviesQueue.peek(); // null if not exists
        System.out.println("After peek = " + moviesQueue + "; data = " + m2);
    }

    private static void queueRemove(Queue<String> moviesQueue, List<String> moviesList) {
        String p1 = moviesQueue.poll();
        System.out.println("After poll = " + moviesList + "; data = " + p1);
        String p2 = moviesQueue.remove();
        System.out.println("After remove = " + moviesList + "; data = " + p2);
    }

    private static void queueAdd(Queue<String> moviesQueue, List<String> moviesList) {
        moviesQueue.offer("Vikram Vedha");
        System.out.println("After offer = " + moviesList);
        moviesQueue.add("Leo"); // Same as offer
        System.out.println("After add = " + moviesList);
    }

    private static void listRemove(List<String> moviesList) {
        boolean r1 = moviesList.remove("Singam - 1");
        System.out.println("After remove = " + moviesList + "; result = " + r1);
        String r2 = moviesList.remove(3);
        System.out.println("After remove at index = " + moviesList + "; result = " + r2);
        boolean r3 = moviesList.removeAll(List.of("Jigarthanda", "Gajini"));
        System.out.println("After removeAll = " + moviesList + "; result = " + r3);
    }

    private static void listAdd(List<String> moviesList) {
        moviesList.add("3");
        System.out.println("After add = " + moviesList);
        moviesList.add(0, "Singam - 1");
        System.out.println("After add at index = " + moviesList);
        moviesList.addAll(List.of("Visaranai", "Alaipayuthey"));
        System.out.println("After addAll = " + moviesList);
        moviesList.addAll(0, Arrays.asList("Pithamagan", "Jigarthanda", "Indian"));
        System.out.println("After addAll at index = " + moviesList);
    }
}
