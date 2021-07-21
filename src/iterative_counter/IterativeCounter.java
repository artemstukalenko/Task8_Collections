package iterative_counter;

import java.util.*;

    /**
    * Created by Artem Stukalenko on 21.07.2021
    */

public class IterativeCounter {

    static ArrayList<Integer> source = new ArrayList<>();

    public static void main(String[] args) {

        addElements(source);

        countElementsIterations(source);

        HashMap <Integer, Integer> iterations = countElementsIterations(source);

        System.out.println(iterations);
    }

    private static void addElements(ArrayList<Integer> source) {
        source.add(4);
        source.add(5);
        source.add(-6);
        source.add(4);
        source.add(5);
        source.add(3);
        source.add(4);
        source.add(2);
        source.add(4);
        source.add(5);
        source.add(7);
    }

    private static HashMap <Integer, Integer> countElementsIterations(ArrayList<Integer> source) {
        HashMap <Integer, Integer> iterations = new HashMap<>();

        for(int sourceIndex = 0; sourceIndex < source.size(); sourceIndex++) {
            int tempInt = source.get(sourceIndex);

            if (!iterations.containsKey(tempInt)) {
                iterations.put(tempInt, 1);
            } else {
                iterations.put(tempInt, iterations.get(tempInt) + 1);
            }
        }

        return iterations;
    }
}
