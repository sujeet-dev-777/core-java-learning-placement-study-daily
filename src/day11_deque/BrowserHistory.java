package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    public static void main(String[] args) {

        Deque<String> history = new ArrayDeque<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");
        history.push("LinkedIn");

        System.out.println("Current Page: " + history.peek());

        System.out.println("Back Button Pressed");

        history.pop();
        System.out.println("Current Page: " + history.peek());

        history.pop();
        System.out.println("Current Page: " + history.peek());
    }
}